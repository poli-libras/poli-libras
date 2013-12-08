package br.usp.libras.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

	private String path;
	private Properties properties;

	public PropertiesLoader(String path) {
		this.path = path;
	}

	public Properties getProperties() {
		if (properties == null)
			loadProperties();
		return properties;
	}

	private void loadProperties() {
		ResourceLoader fileLoader = new ResourceLoader(path);
		File file = fileLoader.getResource();
		properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
		} catch (IOException e) {
			System.out.println("Could not load properties " + path
					+ ". Returning empty properties.");
		}
	}

}
