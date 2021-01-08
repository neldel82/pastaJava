import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero; // essa variavel vira "valor" dentro do metodo "informa" (valor é variavel
                    // local)

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println("O numero é: " + informa(numero)); // chamando metodo "informa" na linha print

        entrada.close();
    }

    public static String informa(int valor) {
        if (valor % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}
