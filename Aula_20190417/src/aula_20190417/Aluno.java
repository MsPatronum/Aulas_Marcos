package aula_20190417;

/*
* ALUNO É UMA PESSOA, ou seja, a classe Aluno herda os atributos 
* da classe Pessoa e adiciona os seus próprios depois (implementação
* da diferença
*/
public class Aluno extends Pessoa{
    private String curso;
    
    public Aluno(){}
    
    /*
    * UTILIZA A HERANÇA DA CLASSE PESSOA INFORMANDO TUDO E ADICIONA O CURSO  
    */
    public Aluno(String nome, String rg, String curso){
        super(nome,rg);
        this.curso = curso;
    }
    
    /*
    * UTILIZA A HERANÇA DA CLASSE PESSOA, INFORMANDO APENAS O NOME E RETORNA
    * SEM O RG OU O CURSO
    */
    public Aluno(String nome){
        super(nome);
        this.curso = "Sem Matrícula";
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
 
@Override
public String toString(){
    String texto = super.toString();
    texto += " - " + curso;
    return texto;
}
    
    
}