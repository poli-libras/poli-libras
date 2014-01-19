package br.usp.libras.translator;

import java.util.List;

import javax.swing.JOptionPane;

import br.usp.libras.sign.Sign;
public class ManualTranslatorTester {

	public static void main(String[] args) {

    	Translator translator = new Translator();
    	
    	while (true) {
    		String input = JOptionPane.showInputDialog("Digite sua frase:");
    		List<Sign> signs = translator.translate(input);
    		System.out.println("------------------------s");
    		System.out.println("Traducao para frase:" + input);
    		for (Sign sign : signs) {  
				System.out.println(sign.toString());
			}
    	}
	}
}
