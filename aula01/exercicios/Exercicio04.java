
//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com valor salario minimo;
//2. entrar com valor quilowatt;
//3. variavel que armazene o valor - salario x quilowatt;
//4. calcular valor de entrada de quilowatt
//5. exibir o valor em reais de cada quilowatt;
//6. exibir o valor em reais a ser pago;
//7. exibir o valor final com desconto de 15%

package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario_min;
        double consumo;

        System.out.println("Digite o valor do salario minimo: ");
        salario_min = entrada.nextDouble();

        System.out.println("Digite consumo em Quilowatt");
        consumo = entrada.nextDouble();

        entrada.close();

        System.out.println("Valor Quilowatt: " + (salario_min /500));
        System.out.println("Valor em Reais: ");
    }

}
