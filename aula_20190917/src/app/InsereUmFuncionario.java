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
public class InsereUmFuncionario {
    public static void main(String[] args){
        try{
            Funcionario f = new Funcionario();
            f.setNome_funcionario("Nicole");
            f.setCargo_funcionario("Quase Dono");
            f.setSalario_funcionario(123456.78);
            f.setDataAdm_funcionario( new Date());
            
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.insert(f);
            System.out.println("Funcionario Cadastrado");
            
        }catch(Exception e){
        }
    }
}
