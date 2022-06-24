public class Lampadina {

    Stato statolamp = Stato.SPENTA;
    int click = 11;
    static boolean hasPower = true;

    public Lampadina() {
    }

    public Lampadina(Stato statolamp) {
        this.statolamp = statolamp;
    }

    public void stato( ) {
        System.out.println(statolamp);
    }

    public static void staccahAttaccah(){
        hasPower = !hasPower;

    }

    public void click() {
        if(hasPower){
        if (statolamp == Stato.ACCESA && click > 0){
            statolamp = Stato.SPENTA;
            click--;}
        else if (statolamp == Stato.SPENTA && click > 0){
            statolamp = Stato.ACCESA;
            click--;}
        else statolamp = Stato.ROTTA;}
        else{
            System.out.println("NO POWER");
            if (statolamp != Stato.ROTTA)
            statolamp = Stato.SPENTA;
        }
    }

}
