//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com custo carro;
//2. entrar com margem distribuidor;
//3. entrar com imposto;
//4. calcular preco final;
//5. exibir o valor com preço de farica;
//6. exibir o valor margem distriidor;
//7. exibir o valor impostos;
package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        double valorCarro;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do carro: ");
        valorCarro = entrada.nextDouble();

        System.out.println("Valor do carro com preço de farica: " + (valorCarro - (valorCarro * 0.73)));
        System.out.println("Valor do carro sem margem do distribuidor: " + (valorCarro - (valorCarro * 0.28)));
        System.out.println("Valor do carro sem impostos: " + (valorCarro - (valorCarro * 0.45)));


        entrada.close();


    }
    
}
