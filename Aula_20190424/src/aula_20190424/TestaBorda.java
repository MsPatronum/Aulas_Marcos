package aula_20190424;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TestaBorda extends JFrame {
	JLabel lblNome, lblCpf, lblRg;
	JTextField txtNome, txtCpf, txtRg;
	public TestaBorda() {
		lblNome = new JLabel("Nome: ");
		lblCpf = new JLabel("CPF: ");
		lblRg = new JLabel("RG: ");
		txtNome = new JTextField();
		txtCpf = new JTextField();
		txtRg = new JTextField();
		JPanel p = new JPanel(new GridLayout(3, 2));
                TitledBorder titulo = BorderFactory.createTitledBorder("Dados Pessoais");
		p.setBorder(titulo);
		p.add(lblNome); p.add(txtNome);
		p.add(lblCpf); p.add(txtCpf);
		p.add(lblRg); p.add(txtRg);
		add(p, BorderLayout.NORTH);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TestaBorda();
	}
}
