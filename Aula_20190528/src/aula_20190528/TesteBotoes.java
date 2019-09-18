package aula_20190528;

import java.awt.*;
import javax.swing.*;

public class TesteBotoes extends JFrame{
    Botao btn, btn2, btn3;
    public TesteBotoes(){
        btn = new Botao("Clique aqui", new Font("Serif", Font.BOLD, 30));
        add(btn, BorderLayout.NORTH);
        
        btn2 = new Botao("Clica aqui");
        add(btn2, BorderLayout.CENTER);
        
        btn3 = new Botao("Dá um clique", new Font("Arial", Font.ITALIC, 25), Color.BLACK, Color.PINK);
        add(btn3, BorderLayout.SOUTH);
        
        setTitle("Teste Botão");
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main (String[] args){
        new TesteBotoes();
    }
}