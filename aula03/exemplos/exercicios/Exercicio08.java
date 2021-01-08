import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros, pares, soma;
        soma = 0;
        pares = 0;
        final int QTDADE_NUMERO = 10; // variavel constante

        for (int cont = 1; cont <= QTDADE_NUMERO; cont++) {
            System.out.printf("Digite o " + cont + " numero: ");
            numeros = entrada.nextInt();

            if (numeros % 2 == 0) {
                soma = soma + numeros;
                pares++;
            }
        }
        System.out.println("A media de numero pares é: " + soma / pares);
        System.out.println("A porcentagem de numero impares é: " + ((QTDADE_NUMERO - pares) * 10));
        entrada.close();
    }

}
