
//exemplo de estrutura de repeticao (LAÇO);

package aula03.exemplos;

public class Exemplo01 {

    public static void main(String[] args) {

        int cont;

        cont = 10;

        while (cont > 0) {
            System.out.println(cont);
            // cont ++; // essa expressa é a msm coisa que cont = cont + 1;
            // cont = cont + 2;
            cont--; //nessa operacao decrementa o valor;

        }
        System.out.println("final da repeticao.");
    }

}
