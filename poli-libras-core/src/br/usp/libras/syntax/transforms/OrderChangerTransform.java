package br.usp.libras.syntax.transforms;

import java.util.ArrayList;
import java.util.List;

import br.usp.libras.syntax.ObjectFinder;
import br.usp.libras.syntax.SubjectFinder;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.WordOrder;

import com.google.common.collect.Lists;

/**
 * 
 * Changes the structure of the Portuguese phrase to a LIBRAS sentence structure. 
 * If we do know what to do, the tokens are returned with the original order.
 * 
 * @author leonardo, koga, guilherme, willian
 *
 */
public class OrderChangerTransform implements TokensTransform {

	@Override
	public List<TokenMorph> transform(List<TokenMorph> tokens) {

		WordOrder order = chooseWordOrder(tokens);
		List<TokenMorph> defaultTokens = Lists.newArrayList(tokens);

        switch (order) {
            case OSV:
            	return this.changeToOSV(tokens);
            case SVO:
                return defaultTokens;
            case SOV:
            	return defaultTokens;
            default:
            	return defaultTokens;
        }
	}
	
	private List<TokenMorph> changeToOSV(List<TokenMorph> tokens) {
		
		SubjectFinder subjectFinder = new SubjectFinder();
		ObjectFinder objectFinder = new ObjectFinder();
		List<TokenMorph> transformed = new ArrayList<TokenMorph>();

		List<TokenMorph> object = objectFinder.findObject(tokens);
		List<TokenMorph> subject = subjectFinder.findSubject(tokens);
		
		transformed.addAll(object);
		transformed.addAll(subject);
		
		List<TokenMorph> remainder = Lists.newArrayList(tokens);
		remainder.removeAll(object);
		remainder.removeAll(subject);
		
		transformed.addAll(remainder);
		return transformed;
	}
	
	/**
	 * Chooses the best Word order based on LIBRAS' grammar.
	 * 
	 * @param tokens
	 * @return
	 */
    private WordOrder chooseWordOrder(List<TokenMorph> tokens) {

    	return WordOrder.OSV;
    }


}
