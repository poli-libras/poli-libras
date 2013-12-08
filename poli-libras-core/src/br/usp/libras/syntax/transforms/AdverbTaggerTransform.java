package br.usp.libras.syntax.transforms;

import java.util.List;
import java.util.Properties;

import br.usp.libras.syntax.Tagger;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;

import com.google.common.collect.Lists;

/**
 * Uses tagger.properties to tag information about the adverb
 * @author leonardo
 *
 */
public class AdverbTaggerTransform implements TokensTransform {
	
    private Properties tags = new Properties();
	
	public AdverbTaggerTransform() {
		Tagger tagger = new Tagger();
		tags = tagger.getTags();
	}

	@Override
	public List<TokenMorph> transform(List<TokenMorph> tokens) {

		List<TokenMorph> transformed = Lists.newArrayList(tokens);
		for (TokenMorph tk: transformed) {
			String adverbType = this.tags.getProperty(tk.getLexeme());
			if (adverbType != null) {
				tk.setProperty(TokenProperties.ADV_TYPE_KEY, adverbType);
			}
		}
		return transformed;
	}

}
