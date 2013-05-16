package br.usp.libras.syntax;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LinkingVerbFinderTest {

	@Test
	public void shouldFindLinkingVerb() {
		
		List<TokenMorph> tokens = getStatement();
		LinkingVerbFinder finder = new LinkingVerbFinder();
		List<TokenMorph> linkingVerbs = finder.findLinkingVerbs(tokens);
		
		assertEquals(1, linkingVerbs.size());
		TokenMorph tk = linkingVerbs.get(0);
		assertEquals("sou", tk.getLexeme());
	}
	
	@Test
	public void shouldNotFindLinkingVerb() {
		

		List<TokenMorph> tokens = getStatement2();
		LinkingVerbFinder finder = new LinkingVerbFinder();
		List<TokenMorph> linkingVerbs = finder.findLinkingVerbs(tokens);
		
		assertEquals(0, linkingVerbs.size());
		
	}
	
	/**
	 * @author brunamoreira
	 * Oração com verbo composto ("Eu vou comer chocolate.")
	 * retorna 0 tokens
	 * 
	 */
	@Test
	public void shouldNotFindLinkingVerbCompoundVerb(){
		
		List<TokenMorph> tokens = getStatement3();
		LinkingVerbFinder finder = new LinkingVerbFinder();
		List<TokenMorph> linkingVerbs = finder.findLinkingVerbs(tokens);
		
		assertEquals(0, linkingVerbs.size());
	}
	
	
	private List<TokenMorph> getStatement() {
		
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

	
	private List<TokenMorph> getStatement2() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("Você", SyntacticTags.SUBJ, MorphTags.PRON_PERS);
		tokens.add(tk);
		
		tk = new TokenMorph("canta", "cantar", SyntacticTags.VERB,  PhraseTags.VP, MorphTags.V_FIN, "PR=3S=IND");
		tokens.add(tk);		
				
		tk = new TokenMorph("bem", SyntacticTags.ADVL, MorphTags.ADV);
		tokens.add(tk);
		
		return tokens;
	}
	
private List<TokenMorph> getStatement3() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		
		TokenMorph tk = new TokenMorph("Eu", SyntacticTags.SUBJ, MorphTags.PRON_PERS);
		tokens.add(tk);
		
		tk = new TokenMorph("vou", "ir", SyntacticTags.VERB,  PhraseTags.VP, MorphTags.V_FIN, "PR=1S=IND");
		tokens.add(tk);		
		
		tk = new TokenMorph("comer", "comer", SyntacticTags.VERB,  PhraseTags.VP, MorphTags.V_FIN, "PR=3S=IND");
		tokens.add(tk);
		
		tk = new TokenMorph("chocolate", SyntacticTags.ACC, MorphTags.NOUN);
		tokens.add(tk);
		
		return tokens;
	}
}
