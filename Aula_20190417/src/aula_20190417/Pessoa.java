package aula_20190417;

/**
 *
 * @author Nicole
 */
public class Pessoa{
    private String nome;
    private String rg;
    
    /*
    * Construtor -> função principal de inicializar os atributos
    * de um objeto
    */
    public Pessoa(){
    }
    
    public Pessoa(String nome){
        this.nome = nome;
        rg = "Não Informado";
    }
    
    public Pessoa(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    /*
    * Quando sobrescrever um método, tem que usar o @Override
    */
    @Override
    
    /*
    * toString() : String -> retornar uma representação textual
    * de um objeto
    */
    
    public String toString(){
        return getNome() + " - " + rg;
    }
    
}