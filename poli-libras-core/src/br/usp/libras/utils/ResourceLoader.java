package br.usp.libras.utils;

import java.io.File;
import java.net.URL;

public class ResourceLoader {

	private String path;
	private File resource;
	
	public ResourceLoader(String path) {
		this.path = path;
	}

	public File getResource() {
		if (resource == null)
			loadResource();
		return resource;
	}

	private void loadResource() {
		URL resourceUrl = this.getClass().getClassLoader().getResource(path);
		if (resourceUrl == null) {
			String msg = "Could not load resource " + path;
			System.out.println(msg);
			throw new IllegalArgumentException(msg);
		}
		else {
			resource = new File(resourceUrl.getFile());
		}
	}
	
}
