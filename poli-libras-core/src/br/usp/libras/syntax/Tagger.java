package br.usp.libras.syntax;

import java.util.Properties;

import br.usp.libras.utils.PropertiesLoader;

public class Tagger {

	private static final String TAGGER_FILE = "tagger.properties";
	
	public Properties getTags() {
		PropertiesLoader loader = new PropertiesLoader(TAGGER_FILE);
		Properties tags = loader.getProperties();
		return tags;
	}
}
