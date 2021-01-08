package exercicios;

import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite seu salario: R$ ");

        salario = entrada.nextDouble();

        if (salario < 600) {
            System.out.println("isento");
        } else { // else (salario > 600) {
            if (salario <= 1200) {  // } if (salario <= 1200) {
                System.out.println("20%");
            } else { // } else (salario > 1200) {

                if (salario <= 2000) {   // } if (salario <=200) {
                    System.out.println("25%");
                } else { // daqui pra baixo adicionei
                    System.out.println("30%");
                }
            }
        }
     entrada.close();


    } 

    
}
