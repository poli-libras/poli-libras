package br.usp.libras.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
	private static JLabel dictionaryLabel;
	private static JButton infoButton;
	private static JButton signButton;
	
	private static final String LABEL_MESSAGE = "Digite sua frase:  ";
	private static final String BUTTON_MESSAGE = "Traduzir";
	private static final String LABEL_MESSAGE_DICTIONARY = "Selecione a fonte dos sinais: ";
	private static final String BUTTON_SOBRE = "Sobre";
	private static final String[] COMBO_LIST = {"Local (offline)","Wikilibras (online)"};
	
	 public static void main(String[] args) {
	     
	     final JFrame frame = new JFrame("Poli-Libras APP");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setResizable(false);
	
	     JPanel panel = new JPanel();
	     JPanel panelCommands = new JPanel(new GridBagLayout());
	
	     final VirtualJonah applet = new VirtualJonah();
	     applet.init();
	        
	     signField = new JTextField();
	     signField.setPreferredSize(new Dimension(200, 20));
	     signLabel = new JLabel(LABEL_MESSAGE);  
	     signButton = new JButton(BUTTON_MESSAGE);
	    
	     dictionaryLabel = new JLabel(LABEL_MESSAGE_DICTIONARY);
	     dictionaryCombo = new JComboBox(COMBO_LIST);
	     
	     infoButton = new JButton(BUTTON_SOBRE);
	          
	     GridBagConstraints grid = new GridBagConstraints();
	     grid.fill = GridBagConstraints.HORIZONTAL;
	     grid.gridx=0;
	     grid.gridy=0;
	     panelCommands.add(signLabel,grid);

	     grid.gridx=1;
	     grid.gridy=0;
	     panelCommands.add(signField,grid);
	     
	     grid.ipady= 20;
	     grid.insets = new Insets(0,5,0,0);
	     grid.gridx=2;
	     grid.gridy=0;
	     grid.gridheight = 3;
	     grid.weighty = 1.0;
	     panelCommands.add(signButton,grid);
	     grid.ipady= 0;
	     grid.insets = new Insets(0,0,0,0);
	     
	     grid.gridx=0;
	     grid.gridy=1;
	     panelCommands.add(dictionaryLabel,grid);
	     
	     grid.fill = GridBagConstraints.HORIZONTAL;
	     grid.gridx=1;
	     grid.gridy=1;
	     panelCommands.add(dictionaryCombo,grid);
	     
	     grid.ipady= 20;
	     grid.fill = GridBagConstraints.HORIZONTAL;
	     grid.gridheight = 3;
	     grid.gridx=3;
	     grid.gridy=0;
	     panelCommands.add(infoButton,grid);
	     grid.ipady=0;
	     
	     panel.add(applet);
	     panel.add(panelCommands);
	     
	     frame.add(panel);
	     frame.setSize(applet.getSize().width, applet.getSize().height +90);
	     
	     signButton.addActionListener( new ActionListener(){
	 	    
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String setence = signField.getText();
					Translator translator;
					
					if(dictionaryCombo.getSelectedIndex()==0){
						SignDictionary dic = new SQLiteDictionary();
						translator = new Translator(dic);
								
					}else{
						translator = new Translator();
					}
					
					translator.setVerbose();
					applet.loadSignsFromObject(translator.translate(setence));
					applet.playSigns();
				}
				
		     } );

		     infoButton.addActionListener( new ActionListener(){
		 	    
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(frame, "Este é o modulo desktop do Poli-Libras.\nPara mais informações visite nosso site: \n      http://www.polilibras.com.br/");

				}
				
		     } ); 

	     frame.setVisible(true);
	
	 }
	
}
