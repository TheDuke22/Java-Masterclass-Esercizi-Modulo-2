public class LampadinaMain {
    public static void main(String[] args) {
        Lampadina lampa = new Lampadina(Stato.SPENTA);
        Lampadina lampa2 = new Lampadina(Stato.SPENTA);
        Interruttore inte1 = new Interruttore(lampa);
        Interruttore inte2 = new Interruttore(lampa);
        Interruttore inte3 = new Interruttore(lampa2);

        lampa.stato();
        for (int i = 0; i < 9; i++) {
            lampa.click();

        }
        inte1.clicco();
        System.out.println(lampa.click);
        inte2.clicco();
        System.out.println(lampa.click);
        lampa.stato();
        lampa2.click();
        lampa2.stato();
        lampa.staccahAttaccah();
        System.out.println("ora manca la corrente");
        inte2.clicco();
        lampa.stato();
        inte2.clicco();
        inte3.clicco();
        lampa2.stato();
        lampa.staccahAttaccah();
        System.out.println("ora c'e` corrente");
        lampa2.stato();
        lampa.stato();
        inte3.clicco();
        lampa2.stato();
        System.out.println(lampa2.click);
        inte2.clicco();
        inte2.clicco();
        lampa.stato();
        inte2.clicco();




    }
}
