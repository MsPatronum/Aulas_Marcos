/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_marcos;

import javax.swing.*;

/**
 *
 * @author Nicole
 */
public class inicialMaiuscula {

    /**
     *
     * @param args
     */
    public static void main(String [] args){
        String entrada = JOptionPane.showInputDialog("Digite a frase: ");
        
        String[] aux = entrada.split(" ");
        String resultado = "";
        for (int i = 0; i < aux.length; i++) {
            if(aux[i].length() > 2){
                char ch = aux[i].toUpperCase().charAt(0);
                resultado += ch + aux[i].substring(1)+" ";
            }else{
                resultado += aux[i] + " ";
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
