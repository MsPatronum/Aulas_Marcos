package aula_20190528;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Botao extends JButton{
    public Botao(String rotulo, Font f, Color frente, Color fundo){
        super(rotulo); //construtor da superclasse de botão (JButton)
        setFont(f);
        setForeground(frente);
        setBackground(fundo);
        
        addMouseListener(new Ouvinte());
    }
    
    public Botao(String rotulo, Font f){
        this(rotulo, f, Color.BLUE, Color.YELLOW);
    }
    
    public Botao(String rotulo){
        this(rotulo, new Font("Arial", Font.BOLD, 20));
    }
    
    class Ouvinte extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent evt){
            
            trocarCores();
        }
        @Override
        public void mouseExited(MouseEvent evt){
            trocarCores();
        }
        
        private void trocarCores(){
            Color frente = getForeground();
            Color fundo = getBackground();
            
            setBackground(frente);
            setForeground(fundo);
            
        }
    }
}