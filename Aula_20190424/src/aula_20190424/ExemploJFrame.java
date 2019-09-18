package aula_20190424;

import java.awt.*;
import javax.swing.*;


public class ExemploJFrame extends JFrame {
	public ExemploJFrame() {
		Toolkit tk = getToolkit();
		Image img = tk.getImage("src/icones/horse.png");
		setIconImage(img);
		Dimension d = tk.getScreenSize();
		int largura = d.width;
		int altura = d.height;
		//setUndecorated(true);
		setMinimumSize(new Dimension(largura - 200, altura - 200));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		// setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Exemplo de Janela");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ExemploJFrame();
	}
}
