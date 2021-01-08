package uri;

import java.util.Scanner;


//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com 2 valores inteiros;
//2. calcular o produto dos dois valores inteiros e armazenar na variavel PROD;
//3. exibir o valor com exibicao "PROD = " 

public class Uri1004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1, valor2, PROD;
        
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();

        PROD = valor1 * valor2;
        
        System.out.println("PROD = " + PROD);

        entrada.close();
    }
}