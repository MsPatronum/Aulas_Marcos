/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_20190424;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nicole
 */
public class ExercicioProgramaCalculos extends JFrame {
    JButton btnParImpar, btnFatorial, btnPrimo, btnLog2;
    JLabel lblTitulo, lblNumero, lblResultado;
    JTextField txtNumero, txtResultado;
    public ExercicioProgramaCalculos(){
        lblTitulo = new JLabel("Calculos Especiais", JLabel.CENTER);
	lblNumero = new JLabel("Numero: ");
	lblResultado = new JLabel("Resultado");
	txtNumero = new JTextField(10);
	txtResultado = new JTextField(10);
        btnParImpar = new JButton("Par/Impar");
        btnFatorial = new JButton("Fatorial");
        btnPrimo = new JButton("Primo");
        btnLog2 = new  JButton("Log2");
        
        JPanel pNorte = new JPanel(new GridLayout(2,1));
        pNorte.add(lblTitulo);
        JPanel pEntrada = new JPanel();
        pEntrada.add(lblNumero);
        pEntrada.add(txtNumero);
        pNorte.add(pEntrada);
        add(pNorte, "North");
        
        
    }

	public static void main(String[] args) {
		new ExemploJFrame();
	}
}
