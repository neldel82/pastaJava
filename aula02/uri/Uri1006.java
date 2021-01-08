

//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com 3 valores decimais;
//2. calcular a MEDIA valores e armazenar na variavel MEDIA;
//3. exibir o valor com exibicao "MEDIA = " 


package uri;

import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, MEDIA;

        Scanner entrada = new Scanner(System.in);

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        MEDIA = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n" , MEDIA);

        entrada.close();

    
    }
    
}
