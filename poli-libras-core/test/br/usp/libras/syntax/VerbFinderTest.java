package br.usp.libras.syntax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VerbFinderTest {
	
	@Test
	public void shouldFindVerbToken() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("Cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		tk = new TokenMorph("comeu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);

		VerbFinder finder = new VerbFinder();
		TokenMorph tkVerb = finder.findVerb(tokens);
		
		assertEquals("comeu", tkVerb.getLexeme());
		assertEquals(SyntacticTags.VERB, tkVerb.getSyntaticTag());
		assertTrue(MorphTags.isVerb(tkVerb.getMorphTag()));
	}
	
	@Test
	public void shouldNotFindVerbToken() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("Cachorro", SyntacticTags.OTHER, MorphTags.NOUN);
		tokens.add(tk);
		tk = new TokenMorph("legal", SyntacticTags.OTHER, MorphTags.ADJ);
		tokens.add(tk);

		VerbFinder finder = new VerbFinder();
		TokenMorph tkVerb = finder.findVerb(tokens);
		
		assertNull(tkVerb);
	}
}
