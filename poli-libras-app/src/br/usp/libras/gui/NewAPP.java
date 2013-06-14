package br.usp.libras.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import br.usp.libras.jonah.VirtualJonah;
import br.usp.libras.translator.Translator;

public class NewAPP {

	private static JTextField signField;
	private static JLabel signLabel;
	
	 public static void main(String[] args) {
	     
	     final JFrame frame = new JFrame("Poli-Libras APP");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	     JPanel panel = new JPanel();
	     JPanel buttonPanel = new JPanel();
	
	     final VirtualJonah applet = new VirtualJonah();
	     applet.init();
	
	     signField = new JTextField();
	     signField.setPreferredSize(new Dimension(100, 20));
	     signLabel = new JLabel("Put your sentence here");
	     
	     JButton signButton = new JButton("Translate");
	     
	     signButton.addActionListener( new ActionListener(){
	    
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String frase = signField.getText();
				
				Translator translator = new Translator();
				translator.setVerbose();

				applet.loadSignsFromObject(translator.translate(frase));
			}
			
	     } );
	
	     buttonPanel.add(signButton);
	
	     panel.add(applet);
	     panel.add(signLabel);
	     panel.add(signField);
	     panel.add(buttonPanel);
	
	     frame.add(panel);
	     frame.setSize(applet.getSize().width, applet.getSize().height +100);
	
	     frame.setVisible(true);
	
	 }
	
}
