import java.util.Scanner;

// LOGICA PARA O CODIGO;
//1. ENTRADA: o usuario vai imputar numeros inteiros;
//2. PROCESSAMENTO: quando o usuario digitar "0" o codigo vai somar todos os valores digitados;
//3. SAIDA: exibir a soma de todos os valores digitados antes de "0";

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valores, cont, SOMA;
        valores = 1; //variavel dependente de laco necessita iniciar com valor *** NAO ESQUECER ***
        cont = 0; 
        SOMA = 0; //variavel dependente de laco necessita iniciar com valor *** NAO ESQUECER ***

        while (valores != 0) {
            System.out.println("Digite valor numerico: " + valores);
            valores = entrada.nextInt();
            cont++;
            SOMA = SOMA + valores;
            }
         System.out.println("A soma é: " + SOMA);

        entrada.close();

    }

}
