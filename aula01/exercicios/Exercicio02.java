//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com os dois valores
//2. calcular a media
//3. exibir o valor

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        // 1. entrar com os dois valores - INPUT
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        // calcular a media - PROCESSAMENTO
        System.out.println("Digite nota1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite nota2: ");
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2) / 2; //primeira operacao em parenteses e depois divisao

        // 3. exibir o valor - PRINTAR RESULTADO
        System.out.println("Sua media é: " + media);

        entrada.close();

    }

}
