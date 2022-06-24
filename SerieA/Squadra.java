package SerieA;

public class Squadra {
    private String id;
    private String nome;
    private Giocatore [] rosa;
    private int punti;
    private int gf;
    private int gs;

    public Squadra(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGs() {
        return gs;
    }

    public void setGs(int gs) {
        this.gs = gs;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Giocatore[] getRosa() {
        return rosa;
    }

    @Override
    public String toString() {
        return (nome +" "+ getPunti()+ " punti");
    }
}
