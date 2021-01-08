import java.util.Scanner;

// LOGICA PARA O CODIGO;
//1. ENTRADA: ler 10 numeros inteiros;
//2. PROCESSAMENTO: processar dentre os numeros qtos sao pares e qtos sao impares;
//3. SAIDA: exibir numeros pares e impares;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros, cont, pares, impares;
        cont = 10;
        pares = 0;
        impares = 0;

        

        for (cont = 10;cont > 0; cont--) {
            System.out.println("Digite numeros: ");
            numeros = entrada.nextInt();

            if ( numeros%2 == 0) {
                //System.out.println("Numeros pares: " + numeros);
                pares++;
                

            } else {
                //System.out.println("Numeros impares: " + numeros);
                impares++;
            }
           

        }

        System.out.println("total de numeros pares:" + pares);
        System.out.println("total de numeros impares:" + impares);
        
    

        entrada.close();
       
    }

        
}
