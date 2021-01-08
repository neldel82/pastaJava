import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int calculo;

        System.err.println("Informe um numero inteiro: ");
        numero1 = entrada.nextInt();

        calculo = soma(numero1, 5); // chamando metodo "soma" e passando os valores 10 para para parametro valor1 e
                                    // 5 para parametro valor2

        System.out.println(numero1 + " + 5 = " + calculo);

        entrada.close();
    }

    public static int soma(int valor1, int valor2) { // metodo "soma" do tipo retorno nesse caso é necessario informar o
                                                     // tipo "inteiro"
        int resultado;

        resultado = valor1 + valor2;

        return resultado;
    }
}
