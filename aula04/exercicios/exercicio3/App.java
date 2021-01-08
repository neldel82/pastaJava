public class App {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fusca","VW",8.0);
        Veiculo veiculo2 = new Veiculo("Gol","VW",11.0);
        
        
        veiculo1.dadosCarros();
        veiculo2.dadosCarros();
        
        System.out.println("Consumo: " + veiculo1.valorConsumo());
        System.out.println("Consumo: " + veiculo2.valorConsumo());


    }
}
