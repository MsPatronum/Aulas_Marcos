/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
import model.dao.FuncionarioDAO;
import model.entities.Funcionario;

/**
 *
 * @author Nicole
 */
public class AlterFuncionario {
    public static void main(String[] args){
        try{
            Funcionario f = new Funcionario();
            f.setCod_funcionario(1);
            f.setNome_funcionario("Enrico");
            f.setCargo_funcionario("Dono");
            f.setSalario_funcionario(12);
            f.setDataAdm_funcionario( new Date());
            
            FuncionarioDAO dao = new FuncionarioDAO();
            if(dao.alter(f)){
                System.out.println("Funcionario Alterado");
            }else{
                System.out.println("Erro");
            }
            System.out.println("Funcionario Cadastrado");
            
        }catch(Exception e){
        }
    }
    
}
