package aula_20190820;

import java.util.*;

public class ListaDeAlunos{
    public static void main(String[] args){
        Set<Aluno> lista = new TreeSet<>();
        Aluno a1 = new Aluno(123,"Kriptovênio","Direito");
        Aluno a2 = new Aluno(124,"Plinofélfio","Arquitetura");
        Aluno a3 = new Aluno(125,"Nicole","ADS");
        Aluno a4 = new Aluno(126,"Kriptovênio","Nutrição");
        
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        
        System.out.println(lista);
    }
}