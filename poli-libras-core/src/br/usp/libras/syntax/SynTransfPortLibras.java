package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;

import org.cogroo.text.Sentence;

import br.usp.libras.syntax.transforms.AdverbIncorporationTransform;
import br.usp.libras.syntax.transforms.AdverbTaggerTransform;
import br.usp.libras.syntax.transforms.OrderChangerTransform;
import br.usp.libras.syntax.transforms.PruneTransform;
import br.usp.libras.syntax.transforms.SecondPersonTransform;
import br.usp.libras.syntax.transforms.TokensTransform;

/**
 * Syntactic transformer from Portuguese to LIBRAS.
 * @author leonardo, koga, guilherme, willian
 *
 */
public class SynTransfPortLibras implements SyntacticTranformer {

    private List<TokensTransform> tokensTransforms = new ArrayList<TokensTransform>();
    private SyntacticAnalyser cogroo = new SyntacticAnalyser();

    public SynTransfPortLibras() {
    	
    	this.tokensTransforms.add(new AdverbTaggerTransform());
    	this.tokensTransforms.add(new OrderChangerTransform());
    	this.tokensTransforms.add(new SecondPersonTransform());
    	this.tokensTransforms.add(new AdverbIncorporationTransform());
    	this.tokensTransforms.add(new PruneTransform());
    }
    
    /**
     * Transform a syntax tree containing a portuguese sentence into a simplified sentence LIBRAS-like.
     * 
     * @param sentence
     * @return a list with all tokens
     */
    public List<TokenMorph> transform(String sentence) {

    	Sentence s = this.cogroo.analyse(sentence).get(0);
    	TokenConverter converter = new TokenConverter();
    	List<TokenMorph> tokens = converter.convertTokens(s.getTokens());
    	for (TokensTransform transform : this.tokensTransforms) {
    		tokens = transform.transform(tokens);
    	}

        return tokens;
    }


}
