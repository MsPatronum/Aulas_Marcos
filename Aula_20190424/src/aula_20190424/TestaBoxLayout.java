package aula_20190424;

import java.awt.*;
import javax.swing.*;

public class TestaBoxLayout extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;
	public TestaBoxLayout() {
		btn1 = new JButton("Botão 1");
		btn2 = new JButton("Botão 2");
		btn3 = new JButton("Botão 3");
		btn4 = new JButton("Botão 4");
		btn5 = new JButton("Botão 5");
		
		Box box1 = Box.createHorizontalBox();
		box1.add(btn1);
		box1.add(Box.createGlue());
		box1.add(btn2);
		box1.add(Box.createGlue());
		box1.add(btn3);
		add(box1, "North");
                Box box2 = Box.createVerticalBox();
		box2.add(Box.createGlue());
		box2.add(btn4);
		box2.add(btn5);
		box2.add(Box.createGlue());;
		add(box2, "East");
		
		setTitle("Exemplo de BoxLayout");
		setSize(300, 200);
		setVisible( true );
	}
	public static void main(String args[]) {
		new TestaBoxLayout();
	}
}

