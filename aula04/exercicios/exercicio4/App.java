public class App {
    public static void main(String[] args) {
        Relogio relogio = new Relogio (16,30,12);

        relogio.time();

        relogio.setHora(20);

        System.out.println("Hora atual: " + relogio.getHora());
        
    }
}
