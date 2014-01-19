package br.usp.libras.syntax;

import static org.junit.Assert.*;

import java.util.List;

import org.cogroo.text.Sentence;
import org.cogroo.text.Token;
import org.junit.Test;

public class TokenConverterTest {
	
	private SyntacticAnalyser cogroo = new SyntacticAnalyser();

	@Test
	public void test() {
		
		final String frase = "O cachorro comeu a lição";
		Sentence s = cogroo.analyse(frase).get(0);
		List<Token> tokens = s.getTokens();
		
		TokenConverter converter = new TokenConverter();
		List<TokenMorph> tks = converter.convertTokens(tokens);
		
		assertEquals(5, tks.size());
		
		TokenMorph tk = tks.get(0);
		TokenMorph expected = new TokenMorph("O", "o", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.ART, "M=S");
		assertEquals(expected, tk);
		
		tk = tks.get(1);
		expected = new TokenMorph("cachorro", "cachorro", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.NOUN, "M=S");
		assertEquals(expected, tk);

		tk = tks.get(2);
		expected = new TokenMorph("comeu", "comer", SyntacticTags.VERB, PhraseTags.VP, MorphTags.V_FIN, "PS=3S=IND");
		assertEquals(expected, tk);

		tk = tks.get(3);
		expected = new TokenMorph("a", "o", SyntacticTags.ACC, PhraseTags.NP, MorphTags.ART, "F=S");
		assertEquals(expected, tk);

		tk = tks.get(4);
		expected = new TokenMorph("lição", "lição", SyntacticTags.ACC, PhraseTags.NP, MorphTags.NOUN, "F=S");
		assertEquals(expected, tk);
	}
	
	// main output:
	//	O o B-SUBJ B-NP art M=S
	//	cachorro cachorro I-SUBJ I-NP n M=S
	//	comeu comer B-P B-VP v-fin PS=3S=IND
	//	a o B-ACC B-NP art F=S
	//	lição lição I-ACC I-NP n F=S
	
	public static void main(String[] args) {
		
		String frase = "eu olho tu";
		SyntacticAnalyser sa = new SyntacticAnalyser();
		Sentence s = sa.analyse(frase).get(0);
		
		for (Token tk: s.getTokens()) {
		    String lema = tk.getLemmas().length > 0 ? tk.getLemmas()[0] : "Sem lema";
			System.out.println(tk.getLexeme() + " " + lema + " " + tk.getSyntacticTag() + " " + tk.getChunkTag() 
					+ " " + tk.getPOSTag() + " " + tk.getFeatures() );
		}
	}


}
