/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;
import model.dao.FuncionarioDAO;

/**
 *
 * @author Nicole
 */
public class ExcludeFuncionario {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Código:");
            int id = Integer.parseInt(entrada);
            
            FuncionarioDAO dao = new FuncionarioDAO();
            
            if(dao.exclude(id)){
                System.out.println("Funcionario Apagado");
            }else{
                System.out.println("Funcionario não Encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
