package aula_20190820;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private int matricula;
    private String nome;
    private String curso;

    public Aluno(int matricula, String nome, String curso) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        String info = matricula +"  "+ nome + "  " + curso;
        return info;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.matricula;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.curso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return true;
    }

    @Override 
    public int compareTo(Aluno o) {
        int resp = nome.compareTo(o.nome); //ordenar pelo nome        
        if(resp != 0){
            return resp;
        }
        return matricula - o.matricula;
    }
    
    
}
