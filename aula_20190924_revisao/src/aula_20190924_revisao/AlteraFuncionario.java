/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_20190924_revisao;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicole
 */
public class AlteraFuncionario {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Código:");
            int id = Integer.parseInt(entrada);
            String nome = JOptionPane.showInputDialog("Nome:");
            String cargo = JOptionPane.showInputDialog("Cargo:");
            entrada = JOptionPane.showInputDialog("Salario:");
            double salario = Double.parseDouble(entrada);
            entrada = JOptionPane.showInputDialog("Admissão:");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dataAdm = df.parse(entrada);

            //Carregar driver na memoria
            Class.forName("com.mysql.jdbc.Driver");
            //carregar banco de dados
            String url = "jdbc:mysql://localhost/eduvale";
            //login e senha do bd
            Connection con = DriverManager.getConnection(url, "root", "");
            
            String sql = "UPDATE FUNCIONARIO SET "
                    + "NOME = ?, "
                    + "CARGO=?, "
                    + "SALARIO = ?, "
                    + "DATAADM = ?"
                    + "WHERE IDFUNCIONARIO = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, cargo);
            pst.setDouble(3, salario);
            pst.setDate(4, new java.sql.Date(dataAdm.getTime()));
            pst.setInt(5, id);
            
            int resp = pst.executeUpdate();
            
            if (resp == 1){
                JOptionPane.showMessageDialog(null, "Funcionario Alterado");
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
            }
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
