package GestorePrenotazioni;

public class Ristorante {
    private int postiInterno= 12;
    private int postiEsterno= 18;

    public Ristorante() {
    }

    public int getPostiInterno() {
        return postiInterno;
    }

    public void setPostiInterno(int postiInterno) {
        this.postiInterno = postiInterno;
    }

    public int getPostiEsterno() {
        return postiEsterno;
    }

    public void setPostiEsterno(int postiEsterno) {
        this.postiEsterno = postiEsterno;
    }
}