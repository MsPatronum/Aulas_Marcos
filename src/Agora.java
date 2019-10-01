import java.util.*;

public class Agora{
    public static void main(String[] args) {
        String Saudacao = null;
        String Momento = null;
        String[] DiaSemana = {"","Domingo ,", "Segunda-Feira, ","Terça-Feira, ","Quarta-feira, ","Quinta-Feira, ","Sexta-feira, ","Sábado, "};
        String[] Mes = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
	GregorianCalendar agora = new GregorianCalendar();
	int dia = agora.get(Calendar.DAY_OF_MONTH);
 	int mes = agora.get(Calendar.MONTH) + 1;  // Janeiro = 0
	int ano = agora.get(Calendar.YEAR);
	int semana = agora.get(Calendar.DAY_OF_WEEK); // Domingo = 1
	int hora = agora.get(Calendar.HOUR_OF_DAY); // hora 0 a 23
        
        if (hora>=0){
            Momento = "Bom dia, ";
        }
        if(hora>=12){
            Momento = "Boa tarde, ";
        }
        if (hora>=18){
            Momento = "Boa noite, ";
        }
        
        Saudacao = Momento + DiaSemana[semana] + dia + " de " + Mes[mes] + " de " + ano +".";
        
        System.out.println(Saudacao);
    }

}