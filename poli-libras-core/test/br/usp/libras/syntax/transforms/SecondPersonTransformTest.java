package br.usp.libras.syntax.transforms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.SyntacticTags;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;

public class SecondPersonTransformTest {

	@Test
	public void test() {
		
		List<TokenMorph> tokens = this.getStatement();
		
		TokensTransform transform = new SecondPersonTransform();
		List<TokenMorph> transformed = transform.transform(tokens);

		TokenMorph tkVerb = transformed.get(1);
		assertEquals("latiu", tkVerb.getLexeme());
		assertEquals(TokenProperties.SECPERSON, tkVerb.getProperty(TokenProperties.SUBJECT_TYPE_KEY));
	}
	
	private List<TokenMorph> getStatement() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("Você", SyntacticTags.SUBJ, MorphTags.PRON_PERS);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);
		
		tk = new TokenMorph("para", SyntacticTags.PIV, MorphTags.PRP);
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.PIV, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.PIV, MorphTags.NOUN);
		tokens.add(tk);

		return tokens;
	}

}
