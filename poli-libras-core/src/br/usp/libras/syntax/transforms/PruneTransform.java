package br.usp.libras.syntax.transforms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.usp.libras.syntax.LinkingVerbFinder;
import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.TokenMorph;

import com.google.common.collect.Lists;

/**
 * Remove words not used in LIBRAS
 * 
 * @author leonardo, koga, guilherme
 *
 */
public class PruneTransform implements TokensTransform {
	
	private static List<String> PRUNNABLE_TYPES = new ArrayList<String>(); 
	
	static {
		PRUNNABLE_TYPES.add(MorphTags.ART);
		PRUNNABLE_TYPES.add(MorphTags.PRP);
	}

	@Override
	public List<TokenMorph> transform(List<TokenMorph> tokens) {
		List<TokenMorph> transformedTokens = Lists.newArrayList(tokens);
		transformedTokens = this.pruneByMorphTag(transformedTokens);
		transformedTokens = this.pruneByLinkingVerb(transformedTokens);
		return transformedTokens;
	}

	private List<TokenMorph> pruneByLinkingVerb(List<TokenMorph> tokens) {
		LinkingVerbFinder finder = new LinkingVerbFinder();
		List<TokenMorph> linkingVerbs = finder.findLinkingVerbs(tokens);
		for (TokenMorph tk: linkingVerbs) {
			tokens.remove(tk);
		}
		return tokens;
	}

	public List<TokenMorph> pruneByMorphTag(List<TokenMorph> tokens) {
		for (Iterator<TokenMorph> it = tokens.listIterator(); it.hasNext(); ) {
			TokenMorph token = it.next();
			if (PRUNNABLE_TYPES.contains(token.getMorphTag())) {
                it.remove();
            }
		}
		return tokens;
	}

}
