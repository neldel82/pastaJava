

//**LOGICA PARA SEGUIR NO CODIGO **/
//1. entrar com 6 valores, 4 valores inteiros e 3 decimais;  
//2. calcular os valores das duas peças e exibir "VALOR A PAGAR: R$ " + TOTAL;
//3. exibir o valor com exibicao TOTAL; 


package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numPeca1, numPeca2;
        double valPeca1, valPeca2, TOTAL;

        entrada.nextInt(); //esse cara nao armazena em variavel, apenas INPUT
        numPeca1 = entrada.nextInt();
        valPeca1 = entrada.nextDouble();

        entrada.nextInt();//esse é o segundo bloco, o primeiro INPUT tbm nao nao armazena em variavel
        numPeca2 = entrada.nextInt();
        valPeca2 = entrada.nextDouble();
        
        TOTAL = ((numPeca1 * valPeca1) + (numPeca2 * valPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , TOTAL);


        entrada.close();
    }
    
}
