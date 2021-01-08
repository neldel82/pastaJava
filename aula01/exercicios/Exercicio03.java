package exercicios;

import java.util.Scanner;

//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com salario
//2. calcular porcentagem de aumento
//3. exibir o valor

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double novo_salario;

        System.out.println("Digite salario atual: ");
        salario = entrada.nextDouble();

        novo_salario = (salario * 1.25);

        System.out.println("Seu novo salario é: " + novo_salario);

        entrada.close();

    }

}
