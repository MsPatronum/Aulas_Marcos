package atvdd_calculos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculos extends JFrame {
	JLabel lblTitulo, lblNumero, lblResultado;
	JTextField txtNumero, txtResultado;
	JButton btnParImpar, btnFatorial, btnPrimo, btnLog2;
	
	public Calculos() {
		lblTitulo = new JLabel("Cálculos Especiais", JLabel.CENTER);
		lblNumero = new JLabel("Número:");
		lblResultado = new JLabel("Resultado");
		txtNumero = new JTextField(10);
		txtResultado = new JTextField(10);
		btnParImpar = new JButton("Par/Ímpar");
		btnFatorial = new JButton("Fatorial");
		btnPrimo = new JButton("Primo");
		btnLog2 = new JButton("Log2");
		
		JPanel pNorte = new JPanel(new GridLayout(2, 1));
		pNorte.add(lblTitulo);
		JPanel pEntrada = new JPanel();
		pEntrada.add(lblNumero);
		pEntrada.add(txtNumero);
		pNorte.add(pEntrada);
		add(pNorte, "North");
		
		JPanel pBtn = new JPanel(new GridLayout(2, 2));
		pBtn.add(btnParImpar); pBtn.add(btnFatorial);
		pBtn.add(btnPrimo); pBtn.add(btnLog2);
		add(pBtn, BorderLayout.CENTER);
		
		JPanel pResultado = new JPanel();
		pResultado.add(lblResultado);
		pResultado.add(txtResultado);
		txtResultado.setEditable(false);
		add(pResultado, BorderLayout.SOUTH);
		
		setTitle("Programa de Cálculos");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
                
                Ouvinte ov = new Ouvinte();
                btnParImpar.addActionListener(ov);
                btnFatorial.addActionListener(ov);
                btnPrimo.addActionListener(ov);
                btnLog2.addActionListener(ov);
	}
	
	public static void main(String[] args) {
		new Calculos();
	}
        
        class Ouvinte implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent evt) {
                int n = Integer.parseInt(txtNumero.getText());
                
                Object btn = evt.getSource();
                if(btn == btnParImpar){
                    if(CalculosUtil.isPar(n)){
                        txtResultado.setText("É par.");
                    }else{
                        txtResultado.setText("É impar.");
                    }
                }else if (btn == btnFatorial){
                    txtResultado.setText("" + CalculosUtil.fat(n));
                }else if (btn == btnPrimo){
                    if (CalculosUtil.isPrimo(n)){
                        txtResultado.setText("É primo.");
                    }else{
                        txtResultado.setText("Não é primo.");
                    }
                }else{
                    txtResultado.setText("" + CalculosUtil.log2(n));
                }
            
            }
        }
}
