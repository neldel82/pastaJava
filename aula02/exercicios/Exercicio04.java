
//**LOGICA PARA SEGUIR NO CODIGO **/
//1. ENTRADA: dado salario bruto e dado valor prestacao;  
//2. PROCESSAMENTO: validacao que da prestacao acima 30% reprovado caso nao aprovado;
//3. SAIDA: printar resultados; 

package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, prestacao, margem;

        System.out.println("Digite seu salario bruto: R$ ");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestacao: R$ ");
        prestacao = entrada.nextDouble();

        margem = (salario * 0.3);

        if (prestacao < margem) {
            System.out.println("APROVADO");

        } else {
            System.out.println("REPROVADO");
        }

        entrada.close();
    }

}
