package aula_20190924_revisao;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class InsereFuncionario{
    public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
        String nome = JOptionPane.showInputDialog("Nome:");
        String cargo = JOptionPane.showInputDialog("Cargo:");
        String entrada = JOptionPane.showInputDialog("Salario:");
        double salario = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Admissão:");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAdm = df.parse(entrada);
        
        //Carregar driver na memoria
        Class.forName("com.mysql.jdbc.Driver");
        //carregar banco de dados
        String url = "jdbc:mysql://localhost/eduvale";
        //login e senha do bd
        Connection con = DriverManager.getConnection(url, "root", "");
        
        
        String sql = "INSERT INTO "
                + "FUNCIONARIO"
                + "(NOME, CARGO, SALARIO, DATAADM) "
                + "VALUES"
                + "(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, nome);
        pst.setString(2, cargo);
        pst.setDouble(3, salario);
        pst.setDate(4, new java.sql.Date(dataAdm.getTime()));
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!");
        
        pst.close();
        con.close();
        
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}