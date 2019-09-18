/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;
import model.dao.FuncionarioDAO;
import model.entities.Funcionario;

/**
 *
 * @author Nicole
 */
public class SearchFuncionario {
    public static void main(String[] args){
        try {
            String entrada = JOptionPane.showInputDialog("Código");
            int id = Integer.parseInt(entrada);
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario f = dao.getById(id);
            if( f != null){
                JOptionPane.showMessageDialog(null, f.getNome_funcionario());
            }else{
                JOptionPane.showMessageDialog(null, "Não Achou");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
