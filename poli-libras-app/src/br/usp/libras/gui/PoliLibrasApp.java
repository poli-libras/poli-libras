package br.usp.libras.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import processing.core.PApplet;
import br.usp.libras.jonah.VirtualJonah;
import br.usp.libras.sign.Sign;
import br.usp.libras.translator.Translator;

public class PoliLibrasApp extends VirtualJonah {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Captura frases entradas pelo usuário
	 */
	@Override
	public void keyPressed() {
		
		// continua fazendo oq já fazia
		super.keyPressed();
		
		// nova funcionalidade
        if (key == 't') {
            System.out.println("Digite sua frase:");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            try {
                String frase = input.readLine();
                System.out.println("Traduzindo frase:" + frase);
                Translator translator = new Translator();
                translator.setVerbose();
                this.setSignName("");
                reset();
                this.loadSignsFromObject(translator.translate(frase));
                
                System.out.println("Frase traduzida com sucesso.");
                System.out.println("Numero de sinais:" + this.getSigns().size());
                for (Sign s : this.getSigns()) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

	public static void main(String[] args) {
		
		PApplet.main(new String[] { "br.usp.libras.gui.PoliLibrasApp" });
	}
}
