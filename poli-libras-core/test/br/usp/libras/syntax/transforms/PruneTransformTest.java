package br.usp.libras.syntax.transforms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.PhraseTags;
import br.usp.libras.syntax.SyntacticTags;
import br.usp.libras.syntax.TokenMorph;

public class PruneTransformTest {

	@Test
	public void shouldPruneArticlesAndPreprositions() {
		
		List<TokenMorph> tokens = this.getStatement();
		
		TokensTransform transform = new PruneTransform();
		List<TokenMorph> transformed = transform.transform(tokens);
		
		assertEquals(3, transformed.size());
		assertEquals("cachorro", transformed.get(0).getLexeme());
		assertEquals("latiu", transformed.get(1).getLexeme());
		assertEquals("dono", transformed.get(2).getLexeme());
	}

	@Test
	public void shouldPruneLinkingVerbs() {
		
		List<TokenMorph> tokens = this.getStatement2();
		
		TokensTransform transform = new PruneTransform();
		List<TokenMorph> transformed = transform.transform(tokens);
		
		assertEquals(2, transformed.size());
		assertEquals("Eu", transformed.get(0).getLexeme());
		assertEquals("Estado", transformed.get(1).getLexeme());
	}

	private List<TokenMorph> getStatement() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);
		
		tk = new TokenMorph("para", SyntacticTags.ACC, MorphTags.PRP);
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.ACC, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("dono", SyntacticTags.ACC, MorphTags.NOUN);
		tokens.add(tk);

		return tokens;
	}
	
	private List<TokenMorph> getStatement2() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("Eu", SyntacticTags.SUBJ, MorphTags.PRON_PERS);
		tokens.add(tk);
		
		tk = new TokenMorph("sou", "ser", SyntacticTags.VERB,  PhraseTags.VP, MorphTags.V_FIN, "PR=1S=IND");
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.ACC, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("Estado", SyntacticTags.ACC, MorphTags.NOUN);
		tokens.add(tk);
		
		return tokens;
	}

}
