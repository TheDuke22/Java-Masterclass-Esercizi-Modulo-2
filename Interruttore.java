public class Interruttore extends  Lampadina{
    Lampadina lampadina;

    public Interruttore(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    public void clicco (){
        lampadina.click();
    }

}
