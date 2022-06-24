package GestorePrenotazioni;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Prenotazione {
    Ristorante r = new Ristorante();
    String [] prenotazioniInterno = new String[r.getPostiInterno()];
    String [] prenotazioniEsterno = new String[r.getPostiEsterno()];
    int countInt;
    int countEst;
    int nprenotazione = 1;






    public boolean prenota (DentroFuori a, int numPosti){

        if (numPosti > r.getPostiEsterno() && numPosti > r.getPostiInterno()){
            System.out.println("spiaze siamo al completo");
        return false;}

        if ( a == DentroFuori.ESTERNO && r.getPostiEsterno()>= numPosti) {
            System.out.println("posti all'esterno disponibili, prenotato!");
            r.setPostiEsterno(r.getPostiEsterno() - numPosti);
            System.out.println("codice prenotazione: " + "prenotazione"+(nprenotazione));
            prenotazioniEsterno [countEst] = "prenotazione"+(nprenotazione);
            countEst++;
            nprenotazione++;
            return true;

        }
        else if (a == DentroFuori.ESTERNO && r.getPostiEsterno()< numPosti){
            System.out.println("posti all'esterno non disponibili");
            System.out.println("posti all'interno disponibili, prenotato!");
            r.setPostiInterno(r.getPostiInterno()-numPosti);
            System.out.println("codice prenotazione: " + "prenotazione"+(nprenotazione));
            prenotazioniInterno [countInt] = "prenotazione"+(nprenotazione);
            countInt++;
            nprenotazione++;
            return true;
        }

        else if (a == DentroFuori.INTERNO && r.getPostiInterno() >= numPosti) {
                System.out.println("posti all'interno disponibili, prenotato!");
                r.setPostiInterno(r.getPostiInterno()-numPosti);
            System.out.println("codice prenotazione: " + "prenotazione"+(nprenotazione));
            prenotazioniInterno [countInt] = "prenotazione"+(nprenotazione);
            countInt++;
            nprenotazione++;
                return true;
            }
        else if (a == DentroFuori.INTERNO && r.getPostiInterno()< numPosti){
            System.out.println("posti all'interno non disponibili");
            System.out.println("posti all'esterno disponibili, prenotato!");
            r.setPostiEsterno(r.getPostiEsterno() - numPosti);
            System.out.println("codice prenotazione: " + "prenotazione"+(nprenotazione));
            prenotazioniEsterno [countEst] = "prenotazione"+(nprenotazione);
            countEst++;
            nprenotazione++;
            return true;}
        return false;
    }
    public void cancellaPrenotazione ( DentroFuori x, String p){
        if (x == DentroFuori.ESTERNO){
            for (int i = 0; i < prenotazioniEsterno.length; i++) {
             if (Objects.equals(prenotazioniEsterno[i], p)){
                  prenotazioniEsterno [i] = null;
                System.out.println("prenotazione eliminata con successo");
             return;}

            }
            System.out.println("prenotazione non trovata");
        }
        else if (x == DentroFuori.INTERNO) {
            for (int i = 0; i < prenotazioniInterno.length; i++) {
                if(Objects.equals(prenotazioniInterno[i], p)){
                    prenotazioniInterno[i]=null;
                    System.out.println("prenotazione eliminata con successo");
                    return;
                }

            }System.out.println("prenotazione non trovata");
        }
    }

    public String[] ritornaPrenotazioni (DentroFuori x){
        if (x==DentroFuori.ESTERNO)
            return prenotazioniEsterno;
        return prenotazioniInterno;
    }


        public static void main(String[] args) {;
        Prenotazione p = new Prenotazione();

        p.prenota(DentroFuori.ESTERNO, 10);
        p.prenota(DentroFuori.ESTERNO, 1);
        p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.INTERNO, 2);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 4);
            p.prenota(DentroFuori.INTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.ESTERNO, 1);
            p.prenota(DentroFuori.INTERNO, 1);




        p.prenota(DentroFuori.INTERNO, 10);
        p.prenota(DentroFuori.ESTERNO, 1);
        p.prenota(DentroFuori.ESTERNO, 4);
        p.cancellaPrenotazione(DentroFuori.ESTERNO, "prenotazione4");
        p.cancellaPrenotazione(DentroFuori.ESTERNO, "prenotazione4");
        p.cancellaPrenotazione(DentroFuori.INTERNO, "prenotazione2");
        p.cancellaPrenotazione(DentroFuori.ESTERNO, "prenotazione2");

            System.out.println(Arrays.toString(p.ritornaPrenotazioni(DentroFuori.ESTERNO)));




    }
}


