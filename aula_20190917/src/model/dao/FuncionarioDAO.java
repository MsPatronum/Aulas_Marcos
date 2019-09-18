/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.*;
import java.util.*;
import model.entities.Funcionario;

/**
 *
 * @author Nicole
 */
public class FuncionarioDAO {
    private ConnectionFactory factory;
    
    public FuncionarioDAO() throws ClassNotFoundException{
        factory = new ConnectionFactory();
    }
    
    public void insert(Funcionario f) throws Exception{
        Connection con = factory.openConnection();
        String sql = "Insert into funcionario (nome, cargo, salario, dataAdm) values (?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, f.getNome_funcionario());
        pst.setString(2, f.getCargo_funcionario());
        pst.setDouble(3, f.getSalario_funcionario());
        pst.setDate(4, new java.sql.Date(f.getDataAdm_funcionario().getTime()));
        pst.executeUpdate();
        
        pst.close();
        con.close();
    }
    
    public ArrayList<Funcionario> Everybody() throws Exception{
        Connection con = factory.openConnection();
        String sql = "Select * from Funcionario order by nome_funcionario";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Funcionario> list = new ArrayList<>();
        while(rs.next()){
            Funcionario f = new Funcionario();
            f.setCod_funcionario(rs.getInt("cod_funcionario"));
            f.setNome_funcionario(rs.getString("nome_funcionario"));
            f.setSalario_funcionario(rs.getDouble("salario_funcionario"));
            f.setDataAdm_funcionario(rs.getDate("dataAdm_funcionario"));
            
            list.add(f);
        }
        st.close();
        con.close();
        return list;
    }
    
    public Funcionario getById(int id) throws Exception{
        Connection con = factory.openConnection();
        String sql = "Select * from funcionario where cod_funcionario = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        Funcionario f = null;
        if (rs.next()){
            f = new Funcionario();
            f.setCod_funcionario(rs.getInt("cod_funcionario"));
            f.setNome_funcionario(rs.getString("nome_funcionario"));
            f.setSalario_funcionario(rs.getDouble("salario_funcionario"));
            f.setDataAdm_funcionario(rs.getDate("dataAdm_funcionario")); 
        }
        rs.close();
        pst.close();
        con.close();
        return f;
    }
    public boolean alter(Funcionario f)throws Exception{
        Connection con = factory.openConnection();
        String sql = "Update Funcionario set nome_funcionario = ?, "
                + "cargo_funcionario = ?, "
                + "salario_funcionario = ?, "
                + "dataadm_funcionario = ? "
                + "where cod_funcionario = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, f.getNome_funcionario());
        pst.setString(2, f.getCargo_funcionario());
        pst.setDouble(3, f.getSalario_funcionario());
        pst.setDate(4, new java.sql.Date(f.getDataAdm_funcionario().getTime()));
        pst.setInt(5, f.getCod_funcionario());
        int resp = pst.executeUpdate();
        
        pst.close();
        con.close();
        
        if (resp==1){
            return true;
        }
        return false;
    }


    public boolean exclude(int id) throws Exception{
        Connection con = factory.openConnection();
        String sql = "Delete from Funcionario where cod_funcionario = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        int resp = pst.executeUpdate();
        pst.close();
        con.close();
        if(resp==1){
            return true;
        }return false;
    }
}

