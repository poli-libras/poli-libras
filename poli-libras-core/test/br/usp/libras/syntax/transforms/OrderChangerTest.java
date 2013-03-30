package br.usp.libras.syntax.transforms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.SyntacticTags;
import br.usp.libras.syntax.TokenMorph;

public class OrderChangerTest {

	@Test
	public void shouldChangeFromSVOToOSV() {
		
		List<TokenMorph> tokens = getStatement();
		List<TokenMorph> expected = getExpectedStatement();
		TokensTransform orderChanger = new OrderChangerTransform();
		List<TokenMorph> transformed = orderChanger.transform(tokens);
		
		assertEquals(expected.size(), transformed.size());
		int i = 0;
		for (TokenMorph tk: expected) {
			assertEquals(tk, transformed.get(i++));
		}
	}
	
	private List<TokenMorph> getStatement() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);
		
		tk = new TokenMorph("para", SyntacticTags.PIV, MorphTags.PRP);
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.PIV, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("dono", SyntacticTags.PIV, MorphTags.NOUN);
		tokens.add(tk);

		return tokens;
	}
	
	private List<TokenMorph> getExpectedStatement() {

		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("para", SyntacticTags.PIV, MorphTags.PRP);
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.PIV, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("dono", SyntacticTags.PIV, MorphTags.NOUN);
		tokens.add(tk);

		tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);
		
		return tokens;
	}

}
