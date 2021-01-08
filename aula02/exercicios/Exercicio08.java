
//**LOGICA PARA SEGUIR NO CODIGO **/
//1. ENTRADA: entrar com os 3 lados do triangulo;  
//2. PROCESSAMENTO: 1. Verificar se trata-se de triangulo, caso sim, classifica-lo;
//3. SAIDA: printar o tipo de triangulo; 

package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ladoa, ladob, ladoc;

        System.out.println("LadoA: ");
        ladoa = entrada.nextInt();

        System.out.println("LadoB: ");
        ladob = entrada.nextInt();

        System.out.println("LadoC: ");
        ladoc = entrada.nextInt();

        if (ladoa > (ladob + ladoc) || ladob > (ladoc + ladoa) || ladoc > (ladoa + ladob)) {
            System.out.println("nao é triangulo");
        } else {
            if (ladoa == ladob && ladob == ladoc && ladoa == ladoc) {
                System.out.println("Triangulo Equilatero");
            } else {
                if (ladoa == ladob || ladob == ladoc || ladoa == ladoc) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triangulo escaleno");
                }
            }
        }

        entrada.close();

    }

}
