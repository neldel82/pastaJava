
//**LOGICA PARA SEGUIR NO CODIGO **/
//1. ENTRADA: entrar com 2 notas  ;  
//2. PROCESSAMENTO: se media for >= 6.0;
//3. SAIDA: printar "aprovado" na condicao if e "reprovado" else; 

package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = ((nota1 * 0.4) + (nota2 * 0.6));

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }

}
