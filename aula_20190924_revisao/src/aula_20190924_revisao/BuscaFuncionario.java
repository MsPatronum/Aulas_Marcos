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
public class BuscaFuncionario {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Código:");
            int id = Integer.parseInt(entrada);
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/eduvale";
            Connection con = DriverManager.getConnection(url, "root", "");
            
            String sql = "Select nome from funcionario where idfuncionario = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, rs.getString("nome"));
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
