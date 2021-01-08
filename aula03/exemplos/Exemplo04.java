
//LOGICA PARA O CODIGO;
//1. ENTRADA: entrar com o valor para apresentar o produto de 1 a 10;
//2. PROCESSAMENTO: apos a insercao do valor, criar repeticao ate 10 e processar produto;
//3. SAIDA: apresentar o produto de cada repeticao;

package aula03.exemplos;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        int cont,num;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = entrada.nextInt();

        cont = 0;

        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont ++;
        }

        entrada.close();


    }
    
}
