package br.usp.libras.syntax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class SynTransfPortLibrasTest {
    
    private SyntacticTranformer syntaticTransformer = new SynTransfPortLibras();

    @Test
    public void testAnalyse1() throws IOException {

    	String frase = "Eu quero chocolate";
        List<TokenMorph> tokens = syntaticTransformer.transform(frase);
        assertEquals(3, tokens.size());
        assertEquals("chocolate", tokens.get(0).getLexeme());
        assertEquals("Eu", tokens.get(1).getLexeme());
        assertEquals("quero", tokens.get(2).getLexeme());
    }
    
    @Test
    public void testAnalyse2() throws IOException {

    	String frase = "Eu quero chocolate rapidamente";
        List<TokenMorph> tokens = syntaticTransformer.transform(frase);
        
        assertEquals(3, tokens.size());
        assertEquals("chocolate", tokens.get(0).getLexeme());
        assertEquals("Eu", tokens.get(1).getLexeme());
        assertEquals("quero", tokens.get(2).getLexeme());
        assertNotNull(tokens.get(2).getProperty(TokenProperties.ADV_TYPE_KEY));
    }
    
    @Test
    public void testAnalyse3() throws IOException {
    	
    	String frase = "Você queria um chocolate";
        List<TokenMorph> tokens = syntaticTransformer.transform(frase);
        assertEquals(3, tokens.size());
        assertEquals("chocolate", tokens.get(0).getLexeme());
        assertEquals("Você", tokens.get(1).getLexeme());
        assertEquals("queria", tokens.get(2).getLexeme());
        assertNotNull(tokens.get(2).getSyntaticTag().equals(SyntacticTags.SUBJ));
    }
    
}
