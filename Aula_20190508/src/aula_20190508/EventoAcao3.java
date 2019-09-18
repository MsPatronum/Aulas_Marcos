package aula_20190508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoAcao3 extends JFrame {
	JButton btn;
	public EventoAcao3 ( ) {
		btn = new JButton ("Botão de Comando" );
		btn.addActionListener ( new Ouvinte() ) ;
		add( btn, "North" );
		setSize(300, 200);
		setVisible ( true );
	}
	public static void main (String args[ ]) {
		new EventoAcao3( );
	}
	
	class Ouvinte implements ActionListener {
		public void actionPerformed ( ActionEvent evt ) {
			Object b = evt.getSource();
			if (b == btn) {
				btn.setBackground(Color.red);

			}
			System.out.println("Ação: " + evt.getActionCommand());
			System.out.println("Modificadores: " + evt.getModifiers());
			if ((evt.getModifiers() & ActionEvent.ALT_MASK) == 
					ActionEvent.ALT_MASK) {
				System.out.println("Tecla Alt pressionada");
			}
		}		
	}
}
