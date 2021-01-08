package exemplos;

import java.util.Scanner; //biblioteca Scanner

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // biblioteca utiliza entrada do teclado
        int idade; // variavel do tipo numero inteiro

        System.out.println("Digite a sua idade:"); //linha utilizada apenas para o codigo nao parece morto

        idade = entrada.nextInt(); // faz a leitura e armazena na varial "entrada"
        System.out.println("A sua idade é: " + idade);

        entrada.close();
    }

}
