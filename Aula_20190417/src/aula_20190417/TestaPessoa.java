package aula_20190417;

public class TestaPessoa{
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        
        /*
        *  new = operador de instanciação - Intsância (de uma classe) = objeto
        */
        
        p.setNome("Nicole");
        p.setRg("504135600");
        System.out.println("Nome: " + p.getNome());
        
        Pessoa p2 = new Pessoa("Breno","4321/x");
        System.out.println("Nome: " + p2.getNome());
        
        Pessoa p3 = new Pessoa("Mariana");
        System.err.println("Nome: " + p3.getNome());
    }
}