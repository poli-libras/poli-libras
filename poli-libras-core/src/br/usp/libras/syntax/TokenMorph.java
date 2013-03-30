package br.usp.libras.syntax;

import java.util.HashMap;
import java.util.Map;

public class TokenMorph {
	
    private String lexeme;
    private String lemma;
    private String syntaticTag;
    private String phraseTag;
    private String morphTag;
    private String features; 
    private Map<String, String> properties = new HashMap<String, String>();
    
	public TokenMorph(String lexeme, String syntaticTag, String morphTag) {
		this.lexeme = lexeme;
		this.syntaticTag = syntaticTag;
		this.morphTag = morphTag;
	}
	
	public TokenMorph(String lexeme, String lemma, String syntaticTag,
			String phraseTag, String morphTag, String features) {
		this.lexeme = lexeme;
		this.lemma = lemma;
		this.syntaticTag = syntaticTag;
		this.phraseTag = phraseTag;
		this.morphTag = morphTag;
		this.features = features;
	}

	public void setProperty(String key, String value) {
		this.properties.put(key,  value);
	}

	public String getProperty(String key) {
		return this.properties.get(key);
	}

	public String getLexeme() {
		return lexeme;
	}
	public void setLexeme(String lexeme) {
		this.lexeme = lexeme;
	}
	public String getLemma() {
		return lemma;
	}
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	public String getSyntaticTag() {
		return syntaticTag;
	}
	public void setSyntaticTag(String syntaticTag) {
		this.syntaticTag = syntaticTag;
	}
	public String getPhraseTag() {
		return phraseTag;
	}
	public void setPhraseTag(String phraseTag) {
		this.phraseTag = phraseTag;
	}
	public String getMorphTag() {
		return morphTag;
	}
	public void setMorphTag(String morphTag) {
		this.morphTag = morphTag;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((features == null) ? 0 : features.hashCode());
		result = prime * result + ((lemma == null) ? 0 : lemma.hashCode());
		result = prime * result + ((lexeme == null) ? 0 : lexeme.hashCode());
		result = prime * result
				+ ((morphTag == null) ? 0 : morphTag.hashCode());
		result = prime * result
				+ ((phraseTag == null) ? 0 : phraseTag.hashCode());
		result = prime * result
				+ ((properties == null) ? 0 : properties.hashCode());
		result = prime * result
				+ ((syntaticTag == null) ? 0 : syntaticTag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenMorph other = (TokenMorph) obj;
		if (features == null) {
			if (other.features != null)
				return false;
		} else if (!features.equals(other.features))
			return false;
		if (lemma == null) {
			if (other.lemma != null)
				return false;
		} else if (!lemma.equals(other.lemma))
			return false;
		if (lexeme == null) {
			if (other.lexeme != null)
				return false;
		} else if (!lexeme.equals(other.lexeme))
			return false;
		if (morphTag == null) {
			if (other.morphTag != null)
				return false;
		} else if (!morphTag.equals(other.morphTag))
			return false;
		if (phraseTag == null) {
			if (other.phraseTag != null)
				return false;
		} else if (!phraseTag.equals(other.phraseTag))
			return false;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		if (syntaticTag == null) {
			if (other.syntaticTag != null)
				return false;
		} else if (!syntaticTag.equals(other.syntaticTag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TokenMorph [lexeme=" + lexeme + ", syntaticTag=" + syntaticTag
				+ ", phraseTag=" + phraseTag + ", morphTag=" + morphTag + "]";
	}

}
