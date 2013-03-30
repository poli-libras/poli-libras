package br.usp.libras.syntax.transforms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.usp.libras.syntax.SubjectFinder;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;
import br.usp.libras.syntax.VerbFinder;

import com.google.common.collect.Lists;

/**
 * 
 * Sets "second person" to the verb if subject is "você" or equivalent
 * 
 * @author leonardo, koga, guilherme
 *
 */
public class SecondPersonTransform implements TokensTransform {
	
    private static final String PRONOUNS_FILE = "resources/pronomes2p.list";
    private static Set<String> pronouns2p = new HashSet<String>();
    
    static {
        BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(PRONOUNS_FILE));
			while (bf.ready()) {
				String pron = bf.readLine().trim().toUpperCase();
				pronouns2p.add(pron);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public List<TokenMorph> transform(List<TokenMorph> tokens) {
		
		List<TokenMorph> transformedTokens = Lists.newArrayList(tokens);
		VerbFinder verbFinder = new VerbFinder();
		TokenMorph tokenVerb = verbFinder.findVerb(transformedTokens);
    	if (tokenVerb != null && subjectHasPronouns2p(transformedTokens)) {
    		tokenVerb.setProperty(TokenProperties.SUBJECT_TYPE_KEY, TokenProperties.SECPERSON);
    	}
		return transformedTokens;
	}

    private boolean subjectHasPronouns2p(List<TokenMorph> tokens) {

    	SubjectFinder finder = new SubjectFinder();
    	List<TokenMorph> subject = finder.findSubject(tokens);
    	
    	for (TokenMorph tk: subject) {
    		if (pronouns2p.contains(tk.getLexeme().toUpperCase())) {
    			return true;
    		}
    	}
    	return false;
  }
    
}
