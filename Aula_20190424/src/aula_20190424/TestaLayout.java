package aula_20190424;

import java.awt.*;
import javax.swing.*;

public class TestaLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;
	public TestaLayout() {
		btn1 = new JButton("Botão 1");
		btn2 = new JButton("Botão 2");
		btn3 = new JButton("Botão 3");
		btn4 = new JButton("Botão 4");
		btn5 = new JButton("Botão 5");
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(3, 2));
                
                add(btn1, "North");
		add(btn2, BorderLayout.SOUTH);
		add("East", btn3);
		add(BorderLayout.WEST, btn4);
		add(btn5);
		setSize(300, 200);
		setVisible( true );
	}
	public static void main(String args[]) {
		TestaLayout tela = new TestaLayout();
		tela. setTitle("Exemplo de Layouts");
	}
}
