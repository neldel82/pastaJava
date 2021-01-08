//1. ENTRADA: entrar com o valor inteiro e armazenar na variavel N;
//2. PROCESSAMENTO: de 1 ate o valor de N, sndo que a cada repeticao seja o valor * ele msm;
//3. SAIDA: apresentar o valor de cada repeticao ate chegar em N;

package aula03.exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, cont;
        cont = 1;
        System.out.print("Digite o numero: ");
        num = entrada.nextInt();
        System.out.print("1");

            while (cont <= num/2) {
            cont = cont*2;
            System.out.printf(" , %d", cont);

            }

        entrada.close();
    }

}
