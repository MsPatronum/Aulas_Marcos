/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_20190924_revisao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicole
 */
public class ExcluiFuncionario {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Código:");
            int id = Integer.parseInt(entrada);
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/eduvale";
            Connection con = DriverManager.getConnection(url, "root", "");
            
            String sql = "DELECTE FROM FUNCIONARIO WHERE IDFUNCIONARIO = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            int resp = pst.executeUpdate();
            
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Funcionario Excluido!");
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario não Encontrado!");
            }
            pst.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
