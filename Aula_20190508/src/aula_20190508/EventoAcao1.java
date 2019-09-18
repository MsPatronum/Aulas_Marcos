package aula_20190508;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoAcao1 extends JFrame {
	JButton btn;
	public EventoAcao1 ( ) {
		btn = new JButton ("Botão de Comando" );
		btn.addActionListener ( new ActionListener( ) {
			public void actionPerformed ( ActionEvent evt ) {
				btn.setBackground ( Color.red );
			}
		} );
		add ( btn, "North" );
		setSize(300, 200);
		setVisible( true );
	}
	public static void main (String args[ ]) {
		new EventoAcao1( );
	}
}