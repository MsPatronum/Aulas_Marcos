package aula_20190424;

import java.awt.*;
import javax.swing.*;

public class TestaGridBagLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public TestaGridBagLayout() {
		setLayout (new GridBagLayout( ));
		GridBagConstraints gbc = new GridBagConstraints( );
		
		btn1 = new JButton("Botão 1");
		gbc.weightx = 30; 	gbc.weighty = 30; // peso
		gbc.gridx = 0; 		gbc.gridy = 0;  // posição
		gbc.gridwidth = 3;	gbc.gridheight = 1;  // tamanho
		gbc.fill = GridBagConstraints.BOTH;  // preenchimento
		add (btn1, gbc);
                btn2 = new JButton("Botão 2");
		gbc.gridx = 0; 		gbc.gridy = 1;  // posição
		gbc.gridwidth = 1; 	gbc.gridheight = 1;  // tamanho
		add(btn2, gbc);
		
		btn3 = new JButton("Botão 3");
		gbc.gridx = 0; 		gbc.gridy = 2;  // posição
		add(btn3, gbc);
		
		btn4 = new JButton("Botão 4");
		gbc.gridx = 0; 		gbc.gridy = 3;  // posição
		add(btn4, gbc);
		
		btn5 = new JButton("Botão 5");
		gbc.weightx = 100; 	gbc.weighty = 100; // peso
		gbc.gridx = 1; 		gbc.gridy = 1;  // posição
		gbc.gridwidth = 2; 	gbc.gridheight = 3;  // tamanho
		add(btn5, gbc);
	
		setTitle("Exemplo de GridBagLayout");
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new TestaGridBagLayout();
	}
}
