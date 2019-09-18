package aula_20190910;

import java.sql.*;
import javax.swing.JOptionPane;

public class AlteraAluno {
    public static void main(String[] args){
        try {
            String idTexto = JOptionPane.showInputDialog("Código");
            int id = Integer.parseInt(idTexto);
            String nome = JOptionPane.showInputDialog("Nome");
            String curso = JOptionPane.showInputDialog("Curso");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:msql://localhost/eduvale";
            Connection con =
                    DriverManager.getConnection(url, "root", "");
            String sql = "Update aluno "
                         + "set aluno_nome = ?, curso = ? "
                         + "where cod_aluno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, curso);
            pst.setInt(3, id);
            int resp = pst.executeUpdate();
            if (resp == 1) {
                JOptionPane.showMessageDialog(null,"Alteração efetuada!");
            } else {
                JOptionPane.showMessageDialog(null,"Aluno não encontrado");
            }
            pst.close();
            con.close();
        } catch (Exception e) {
        }
    }
}
