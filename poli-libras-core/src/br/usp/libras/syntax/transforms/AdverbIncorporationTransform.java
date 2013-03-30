package br.usp.libras.syntax.transforms;

import java.util.Iterator;
import java.util.List;

import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.TokenProperties;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.VerbFinder;

import com.google.common.collect.Lists;

/**
 * Incorporates adverbs into the verbs.
 * 
 * @author leonardo, koga, guilherme
 * 
 */
public class AdverbIncorporationTransform implements TokensTransform {

	@Override
	public List<TokenMorph> transform(List<TokenMorph> tokens) {

		List<TokenMorph> transformedTokens = Lists.newArrayList(tokens);
		VerbFinder verbFinder = new VerbFinder();
		TokenMorph tokenVerb = verbFinder.findVerb(transformedTokens);

		for (Iterator<TokenMorph> it = transformedTokens.listIterator(); it.hasNext(); ) {
			TokenMorph token = it.next();
			if (tokenVerb != null && token.getMorphTag().equals(MorphTags.ADV)) {
				String adverbType = token.getProperty(TokenProperties.ADV_TYPE_KEY);
				if ((adverbType != null) && (adverbType.equals(TokenProperties.ADV_DEG_NEG)
							|| adverbType.equals(TokenProperties.ADV_DEG_POS)
							|| adverbType.equals(TokenProperties.ADV_MAN_FAST)
							|| adverbType.equals(TokenProperties.ADV_MAN_SLOW))) {
						tokenVerb.setProperty(TokenProperties.ADV_TYPE_KEY, adverbType);
						it.remove();
				}
			}
		}

		return transformedTokens;
	}

}
