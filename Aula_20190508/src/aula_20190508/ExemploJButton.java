package aula_20190508;

import javax.swing.*;

public class ExemploJButton extends JFrame{
    JButton btn;
    public ExemploJButton(){
        setTitle("Exemplo de Botão");
        setSize(300,200);
        btn = new JButton("Botão de Teste");
        btn.setIcon(new ImageIcon("icones/horse.png"));
    }
}