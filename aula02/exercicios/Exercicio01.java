//**LOGICA PARA SEGUIR NO CODIGO **/
//1. ENTRADA: entrar com 1 valor ;  
//2. PROCESSAMENTO: se valor for > 20, calcular metade do valor;
//3. SAIDA: printar metade do valor; 


package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor, resultado;

        valor = entrada.nextInt();

        if(valor > 20){
            resultado = (valor / 2);
            System.out.println("Resultado: " + resultado);
        }

     entrada.close();
    }
    
}
