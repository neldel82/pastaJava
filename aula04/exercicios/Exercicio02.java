import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite primeiro valor inteiro: ");
        a = entrada.nextInt();
        System.out.println("Digite segundo valor inteiro: ");
        b = entrada.nextInt();
        System.out.println("Digite terceiro valor inteiro: ");
        c = entrada.nextInt();

        System.out.println("O menor numero é: " + informa(a, b, c));

        entrada.close();
    }

    public static int informa(int v1, int v2, int v3) {
        if (v1 <= v2 && v1 <= v3) {
            return v1;
        } else {
            if (v2 < v1 && v2 < v3) {
                return v2;
            }
        }
        return v3;
    }

}
