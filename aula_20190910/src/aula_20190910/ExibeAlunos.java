package aula_20190910;

import java.sql.*;

public class ExibeAlunos {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/eduvale";
            Connection con = 
                    DriverManager.getConnection(url, "root", "");
            String sql = "Select * from aluno order by aluno_nome";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nome = rs.getString("aluno_nome");
                String curso = rs.getString("aluno_curso");
                System.out.println(nome + " - " + curso);
            }
            rs.close();
            st.close();
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}