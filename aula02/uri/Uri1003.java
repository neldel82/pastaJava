package uri;

import java.util.Scanner;

//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com os dois valores
//2. calcular a media
//3. exibir o valor

public class Uri1003 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a,b, soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        entrada.close();
        
    }
}