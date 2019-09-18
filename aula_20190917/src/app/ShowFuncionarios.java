/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.*;
import model.dao.FuncionarioDAO;
import model.entities.Funcionario;

/**
 *
 * @author Nicole
 */
public class ShowFuncionarios {
    public static void main(String[] args){
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            ArrayList<Funcionario> funcionarios = dao.Everybody();
            for(Funcionario f : funcionarios){
                String texto = f.getNome_funcionario();
                texto += f.getCargo_funcionario();
                texto += f.getSalario_funcionario();
                texto += f.getDataAdmFormatada();
                texto += f.getSalarioFormatado();
                System.out.println(texto);
            
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
