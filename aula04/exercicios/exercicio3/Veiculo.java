public class Veiculo {

    //atributos

    String modelo;
    String marca;
    double consumo;

    //metodos e construtor

    Veiculo(String modelo, String marca, double consumo) { //construtor para incializar atributos
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // metodos

    void dadosCarros() {
        System.out.println(modelo + " e " + marca);
    }

    double valorConsumo() {
        return consumo;
        
    }
}
