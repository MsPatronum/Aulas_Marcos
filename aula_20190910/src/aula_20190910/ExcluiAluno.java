package aula_20190910;

import java.sql.*;
import javax.swing.JOptionPane;

public class ExcluiAluno {
    public static void main(String[] args){
        try {
            String entrada = JOptionPane.showInputDialog("Código");
            int id = Integer.parseInt(entrada);
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/eduvale";
            Connection con =
                    DriverManager.getConnection(url, "root","");
            String sql = "Delete from aluno where cod_aluno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            int resp = pst.executeUpdate();
            if(resp == 1){
                JOptionPane.showMessageDialog(null,"Aluno excluído");
            }else{
                JOptionPane.showMessageDialog(null,"Aluno não encontrado");
            }
            pst.close();
            con.close();
        } catch (Exception e) {
        }
    }
}
