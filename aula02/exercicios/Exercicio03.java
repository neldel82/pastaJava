
//**LOGICA PARA SEGUIR NO CODIGO **/
//1. ENTRADA: entrar com 2 numeros;  
//2. PROCESSAMENTO: calculo de ordem nao crescente;
//3. SAIDA: printar ordem de numeros de forma nao crescente; 

package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2;

        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + "," + num2);

        } else {
            System.out.println(num2 + "," + num1);
        }

        entrada.close();
    }

}
