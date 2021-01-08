package aula03.exemplos;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        
        int cont, soma;

        cont = 0;
        soma = 0;


        while (cont < 10) {
            System.out.println(cont);
            soma += cont; // msm coisa que soma = soma + cont;
            cont++; 

        }
        System.out.println("soma = " + soma);
    
    }
    
}
