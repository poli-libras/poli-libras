package br.usp.libras.translator;

import java.util.List;

import br.usp.libras.contextualiser.Contextualiser;
import br.usp.libras.dic.SignDictionary;
import br.usp.libras.sign.Sign;
import br.usp.libras.syntax.SynTransfPortLibras;
import br.usp.libras.syntax.SyntacticTranformer;
import br.usp.libras.syntax.TokenMorph;

public class Translator {

    private SyntacticTranformer transformer = new SynTransfPortLibras();
    private Contextualiser context = new Contextualiser();
    private boolean verbose = false;

    public Translator() {

    }
    
    public Translator(SignDictionary dic) {
        context = new Contextualiser(dic);
    }

    public void setVerbose() {
        verbose = true;
    }

    public List<Sign> translate(String text) {

        List<TokenMorph >tokens = transformer.transform(text);
    
        if (verbose) {
            System.out.println("Transformer");
            for (TokenMorph tokenMorph : tokens) {
                System.out.println(tokenMorph);
            }
        }

        List<Sign> signs = context.contextualise(tokens);

        return signs;
    }
}
