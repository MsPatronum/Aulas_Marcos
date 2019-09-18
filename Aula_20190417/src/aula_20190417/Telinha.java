package aula_20190417;

import java.awt.*;
import javax.swing.*;

public class Telinha extends JFrame{
    private static final long serialVersionUID = 1L;
    
    JLabel lbl_nome;
    JTextField txt_nome;
    JButton btn_submit;
    
    public Telinha(){
        lbl_nome = new JLabel("Nome: ");
        txt_nome = new JTextField();
        btn_submit = new JButton("Ir");
        
        add(lbl_nome, "North");
        add(txt_nome, BorderLayout.CENTER);
        add("South", btn_submit);
        
        setTitle("Olá!");
        //setSize(300,200);
        pack(); //define um tamanho automaticamente
        setLocationRelativeTo(null); //centraliza na tela
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Telinha();
        
    }
}