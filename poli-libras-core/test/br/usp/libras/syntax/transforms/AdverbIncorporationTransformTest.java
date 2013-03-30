package br.usp.libras.syntax.transforms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.PhraseTags;
import br.usp.libras.syntax.SyntacticTags;
import br.usp.libras.syntax.TokenProperties;
import br.usp.libras.syntax.TokenMorph;

/**
 * The use of this transform requires previous adverb tagging on the statement, 
 * which can be accomplished by the usage of the AdverbTaggerTransform
 * @author leonardo
 *
 */
public class AdverbIncorporationTransformTest {

	@Test
	public void test() {
		
		List<TokenMorph> tokens = this.getStatement();
		
		TokensTransform transform = new AdverbIncorporationTransform();
		List<TokenMorph> transformed = transform.transform(tokens);
		
		assertEquals(4, transformed.size());
		TokenMorph tkVerb = transformed.get(1);
		assertEquals("comeu", tkVerb.getLexeme());
		assertEquals(TokenProperties.ADV_MAN_FAST, tkVerb.getProperties().get(TokenProperties.ADV_TYPE_KEY));
	}

	private List<TokenMorph> getStatement() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("cachorro", "cachorro", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.NOUN, "M=S");
		tokens.add(tk);
		tk = new TokenMorph("comeu", "comer", SyntacticTags.VERB, PhraseTags.VP, MorphTags.V_FIN, "PS=3S=IND");
		tokens.add(tk);
		tk = new TokenMorph("a", "o", SyntacticTags.ACC, PhraseTags.NP, MorphTags.ART, "F=S");
		tokens.add(tk);
		tk = new TokenMorph("lição", "lição", SyntacticTags.ACC, PhraseTags.NP, MorphTags.NOUN, "F=S");
		tokens.add(tk);
		tk = new TokenMorph("rapidamente", "rapidamente", SyntacticTags.ADVL, PhraseTags.ADVP, MorphTags.ADV, "-");
		tk.setProperty(TokenProperties.ADV_TYPE_KEY, TokenProperties.ADV_MAN_FAST);
		tokens.add(tk);
		return tokens;
	}

}
