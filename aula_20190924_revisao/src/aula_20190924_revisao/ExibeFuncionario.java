/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_20190924_revisao;

import java.sql.*;

/**
 *
 * @author Nicole
 */
public class ExibeFuncionario {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysq://localhost/eduvale";
            Connection con = DriverManager.getConnection(url,"root","");
            
            String sql = "SELECT NOME, DATAADM FROM FUNCIONARIO ORDER BY NOME";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){                
                System.out.println(rs.getString("NOME") + " " + rs.getDate("DATAADM"));
            }
            
            rs.close();
            st.close();
            con.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
