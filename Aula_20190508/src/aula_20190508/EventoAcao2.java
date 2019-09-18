package aula_20190508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoAcao2 extends JFrame implements ActionListener {
	JButton btn;
	public EventoAcao2 ( ) {
		btn = new JButton ("Botão de Comando" );
		btn.addActionListener ( this ) ;
		add( btn, "North" );
		setSize(300, 200);
		setVisible ( true );
	}
	public void actionPerformed ( ActionEvent evt ) {
		btn.setBackground(Color.red);
	}
	public static void main (String args[ ]) {
		new EventoAcao2( );
	}
}
