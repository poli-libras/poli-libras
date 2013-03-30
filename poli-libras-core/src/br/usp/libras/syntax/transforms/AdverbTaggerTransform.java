package br.usp.libras.syntax.transforms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.google.common.collect.Lists;

import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;

/**
 * Uses tagger.properties to tag information about the adverb
 * @author leonardo
 *
 */
public class AdverbTaggerTransform implements TokensTransform {
	
    private static final String TAGGER_FILE = "resources/tagger.properties";
    private Properties tags = new Properties();
	
	public AdverbTaggerTransform() {
		
		try {
			File file = new File(TAGGER_FILE);
			InputStream is = new FileInputStream(file);
			tags.load(is);
		} catch (IOException e) {
			System.out.println("File " + TAGGER_FILE + " not found");
		}
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
