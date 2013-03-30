package br.usp.libras.syntax;

import java.util.List;
import java.util.Locale;

import org.cogroo.analyzer.AnalyzerI;
import org.cogroo.analyzer.ComponentFactory;
import org.cogroo.text.Document;
import org.cogroo.text.Sentence;
import org.cogroo.text.impl.DocumentImpl;

public class SyntacticAnalyser {
	
	private AnalyzerI cogroo;
	
	public SyntacticAnalyser() {
		ComponentFactory factory = ComponentFactory.create(new Locale("pt", "BR"));
		cogroo = factory.createPipe();
	}
	
	public List<Sentence> analyse(String sentence) {
		Document doc = new DocumentImpl();
		doc.setText(sentence);
		cogroo.analyze(doc);
		return doc.getSentences();
	}

}
