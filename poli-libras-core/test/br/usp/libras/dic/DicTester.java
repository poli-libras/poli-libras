package br.usp.libras.dic;

import br.usp.libras.sign.Sign;

public class DicTester {
    
    public static void main(String[] args) {
        
        /**
         * base de dados contêm sinais [ SINAL(word) ]: 
         * NOVO(novo), DENOVO(de novo), SEGUNDO(dois) e DOIS(dois)
         */
        
        WikiLibrasDictionary dic = new WikiLibrasDictionary();
        
        Sign s = dic.signByName("CORINGA");
        System.out.println(s);
        
        s = dic.simpleTranslate("bola");        
        System.out.println(s);
    }

}
