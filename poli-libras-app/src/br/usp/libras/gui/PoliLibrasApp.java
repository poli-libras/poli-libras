package br.usp.libras.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import br.usp.libras.dic.SQLiteDictionary;
import br.usp.libras.dic.SignDictionary;
import br.usp.libras.jonah.VirtualJonah;
import br.usp.libras.translator.Translator;

public class PoliLibrasApp {

	private static JTextField signField;
	private static JLabel signLabel;
	private static JComboBox dictionaryCombo;
	private static final String LABEL_MESSAGE = "Digite sua frase";
	private static final String BUTTON_MESSAGE = "Gerar Sinais";
	private static final String[] COMBO_LIST = {"Local","Wikilibras"};
	
	 public static void main(String[] args) {
	     
	     final JFrame frame = new JFrame("Poli-Libras APP");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	     JPanel panel = new JPanel();
	     JPanel buttonPanel = new JPanel();
	
	     final VirtualJonah applet = new VirtualJonah();
	     applet.init();
	     
	     signField = new JTextField();
	     signField.setPreferredSize(new Dimension(200, 20));
	     signLabel = new JLabel(LABEL_MESSAGE);
	     
	     JButton signButton = new JButton(BUTTON_MESSAGE);
	     
	     
	     dictionaryCombo = new JComboBox(COMBO_LIST);
	     
	     
	     signButton.addActionListener( new ActionListener(){
	    
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String setence = signField.getText();
				Translator translator;
				
				if(dictionaryCombo.getSelectedIndex()==0){
					JOptionPane.showMessageDialog(null, (String) dictionaryCombo.getSelectedItem());
					SignDictionary dic = new SQLiteDictionary();
					translator = new Translator(dic);
							
				}else{
					JOptionPane.showMessageDialog(null, (String) dictionaryCombo.getSelectedItem());
					translator = new Translator();
				}
				
				translator.setVerbose();
				applet.loadSignsFromObject(translator.translate(setence));
				applet.playSigns();
			}
			
	     } );
	
	     buttonPanel.add(signButton);
	
	     panel.add(applet);
	     panel.add(signLabel);
	     panel.add(signField);
	     panel.add(buttonPanel);	     
	     panel.add(dictionaryCombo);
	     
	     
	     frame.add(panel);
	     frame.setSize(applet.getSize().width, applet.getSize().height +100);
	
	     frame.setVisible(true);
	
	 }
	
}
