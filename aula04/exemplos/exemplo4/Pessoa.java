public class Pessoa {
    //atributos
    String nome;
    double salario;

    //metodos e construtor
    
    Pessoa(String nome, double salario) { //metodo construtor, obrigatorio usar nome da classe, nesse caso "Pessoa";
        this.nome = nome;       //this é usado quando o nome do atributo é igual ao parametro do metodo, nesse caso "nome" refere-se ao atributo
        this.salario = salario; //this é usado quando o nome do atributo é igual ao parametro do metodo, nesse caso "salario" refere-se ao salario
    }
    
    void exibirDados() {        //metodo é a definicao de uma acao do objeto
        System.err.println(nome + " : " + salario);
    }
}
