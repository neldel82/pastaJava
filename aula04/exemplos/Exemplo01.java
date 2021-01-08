
public class Exemplo01 {
    public static void main(String[] args) {
        int comprimento = 30; //variavel com numero nao constante
        System.out.println("Meu programa");
        linha(); //metodo "linha" no bloco main
        System.out.println("1 - criar novo usuario: ");
        linha2(25); //metodo "linha2" com parametro (25) esse 25 é passado para variavel "tamanho"
        linha2(comprimento); //metodo "linha2" com parametro (comprimento) nesse caso, esta dizendo que "tamanho = comprimento" 
        linha3(15, '*'); //metodo linha3 passando o valor 15 para "tamanho" e o caracter "*" para variavel "tipo"
        linha3(20,'_');



    }
    
    public static void linha(){    //metodo "linha"
        System.out.println("--------------------");

    }

    public static void linha2(int tamanho) {   //metodo "linha2"
        for (int i = 0; i < tamanho; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
        
    

    public static void linha3(int tamanho, char tipo) {   //metodo "linha2"
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
}


}
