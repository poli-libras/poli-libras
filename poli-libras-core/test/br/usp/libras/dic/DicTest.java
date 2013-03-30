package br.usp.libras.dic;

import java.util.ArrayList;
import java.util.List;

import br.usp.libras.sign.Sign;

public class DicTest {
    
    public static void main(String[] args) {
        
        /**
         * base de dados contêm sinais [ SINAL(word) ]: 
         * NOVO(novo), DENOVO(de novo), SEGUNDO(dois) e DOIS(dois)
         */
        
        WikiLibrasDictionary dic = new WikiLibrasDictionary();
        List<Integer> erros = new ArrayList<Integer>();;
        String[] ERROS = {"signByName", "nearSigns", "translate", "simpleTranslate"};
        
        Sign s0 = dic.signByName("EU");
        System.out.println(s0.getName());
        
        // teste signByName
        // passa NOVO, retorna NOVO
        
        Sign s1 = dic.signByName("NOVO");
        if (s1 == null || !s1.getName().equals("NOVO")) {
            erros.add(0);
        }
        
        // teste nearSigns
        // passa NOVO, retorna {NOVO, DENOVO}
        
        List<Sign> signs1 = dic.nearSigns("NOVO");
        boolean ok1 = false;
        boolean ok2 = false;
        for (Sign s: signs1) {
            if (s.getName().equals("NOVO"))
                ok1 = true;
            if (s.getName().equals("DENOVO"))
                ok2 = true;
        }
        if (!ok1 || !ok2) {
            erros.add(1);
        }
        
        // teste translate
        // passa dois, retorna DOIS e SEGUNDO
        
        List<Sign> signs2 = dic.translate("dois");
        ok1 = false;
        ok2 = false;
        for (Sign s: signs2) {
            if (s.getName().equals("DOIS"))
                ok1 = true;
            if (s.getName().equals("SEGUNDO"))
                ok2 = true;
        }
        if (!ok1 || !ok2) {
            erros.add(2);
        }

        // simple translate
        // passa dois, retorna DOIS ou SEGUNDO

        Sign s3 = dic.simpleTranslate("dois");
        if (s3 == null || !s3.getName().equals("NOVO") && !s3.getName().equals("SEGUNDO")) {
            erros.add(3);
        }

        // resultados
        
        if (erros.isEmpty()) {
            System.out.println("Testes executados com sucesso!");
        } 
        else {
            for (Integer i: erros)
                System.out.println("Problemas no teste " + ERROS[i]);
        }
    }

}
