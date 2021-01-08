public class Relogio {

    //atriutos
    private int hora,minuto,segundo;

    //construtor

    Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    //metodo

    public void time() {
            System.out.printf("%02d:%02d:%02d:/n" , hora,minuto,segundo);

    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        if(hora > -1 && hora < 24){
            this.hora = hora;
        }
        
    }
}
