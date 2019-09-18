package aula_20190910;
import java.sql.*;
import javax.swing.*;

public class BuscaAluno {
    public static void main(String[] args){
        try {
            String entrada = JOptionPane.showInputDialog("Digite o ID");
            int id = Integer.getInteger(entrada);
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/eduvale";
            Connection con = 
                DriverManager.getConnection(url, "root", "");
            String sql = "Select * from aluno where cod_aluno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("aluno_nome");
                String curso = rs.getString("aluno_curso");
                JOptionPane.showMessageDialog(null,nome +" - "+curso);
            }else{
                JOptionPane.showMessageDialog(null,"Aluno não encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
