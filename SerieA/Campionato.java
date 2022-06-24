package SerieA;

import java.util.Arrays;

public class Campionato {
    Squadra [] classifica = new Squadra[4];
    int indice=0;

    public void fillArr(Squadra a){
        ;
        classifica[indice]=a;
        indice++;
    }


    public void esitoPartita (Squadra squadraCasa,int golCasa, Squadra squadraOspite, int golOspite) {
        squadraCasa.setGf(squadraCasa.getGf() + golCasa);
        squadraCasa.setGs(squadraCasa.getGs() + golOspite);
        squadraOspite.setGf(squadraOspite.getGf() + golOspite);
        squadraOspite.setGs(squadraOspite.getGs() + golCasa);
        if (golCasa > golOspite) {
            System.out.println("VINCE LA SQUADRA DI CASA : " + squadraCasa.getNome());
            squadraCasa.setPunti(squadraCasa.getPunti() + 3);
            return;
        } else if (golCasa == golOspite) {
            System.out.println("PAREGGIO");
            squadraCasa.setPunti(squadraCasa.getPunti() + 1);
            squadraOspite.setPunti(squadraOspite.getPunti() + 1);
            return;
        } else {
            System.out.println("VINCE LA SQUADRA OSPITE : " + squadraOspite.getNome());
            squadraOspite.setPunti(squadraOspite.getPunti() + 3);
            return;
        }
    }

    public Squadra[] getClassifica (){ // Funziona, ma se cambiano 2 pos non restituisce le squadre in ordine, meglio un doppio for?
        for (int i = 0; i < classifica.length-2; i++) {
            //if (classifica[i+1] == null)
            //   return classifica;
            if (classifica[i].getPunti()>classifica[i+1].getPunti())
                classifica[i] = classifica [i];
            else if (classifica[i].getPunti() < classifica[i+1].getPunti()){
                Squadra j;
                j= classifica [i];
                classifica[i]= classifica[i+1];
                classifica[i+1] = j;
            }
        }
        return classifica;
    }
    public Squadra migliorAttacco(){
        Squadra a= classifica[0];
        for (int i = 1; i < classifica.length-1; i++) {
            if (a.getGf() < classifica[i].getGf())
                a= classifica [i];}
            return a;
        }
    public Squadra peggiorDifesa(){
        Squadra a= classifica[0];
        for (int i = 1; i < classifica.length-1; i++) {
            if (a.getGs() < classifica[i].getGs())
                a= classifica [i];}
        return a;
    }



    public static void main(String[] args) {
        Campionato a = new Campionato();
        Squadra inter = new Squadra("pazza", "Inter");
        Squadra juve = new Squadra("ladrona", "Juventus");
        Squadra milan = new Squadra("pioliisonfire", "Milan");
        Squadra salernitana = new Squadra("seeeiiffff", "Salernitana");
        a.fillArr(inter);
        a.fillArr(milan);
        a.fillArr(juve);
        a.fillArr(salernitana);
        a.esitoPartita(inter,5,milan,2);
        a.esitoPartita(milan,0,juve,0);
        a.esitoPartita(inter,1,juve,2);
        System.out.println(Arrays.toString(a.getClassifica()));
        a.esitoPartita(juve,0,inter,2);
        a.esitoPartita(juve,1,milan,3);
        a.esitoPartita(milan,2,inter,2);
        System.out.println(Arrays.toString(a.getClassifica()));
        a.esitoPartita(inter,2,salernitana,2);
        a.esitoPartita(salernitana, 1,juve,3);
        a.esitoPartita(salernitana, 1,milan,1);
        System.out.println(Arrays.toString(a.getClassifica()));
        System.out.println("miglior attacco: " + a.migliorAttacco().getGf()+ " " + a.migliorAttacco().getNome());
        System.out.println("peggior difesa: " + a.peggiorDifesa().getGs()+ " " + a.peggiorDifesa().getNome());
        a.esitoPartita(milan,10,salernitana,2);
        System.out.println(Arrays.toString(a.getClassifica()));
        System.out.println(Arrays.toString(a.getClassifica()));
        System.out.println("miglior attacco: " + a.migliorAttacco().getGf()+ " " + a.migliorAttacco().getNome());
        System.out.println("peggior difesa: " + a.peggiorDifesa().getGs()+ " " + a.peggiorDifesa().getNome());



    }


}

