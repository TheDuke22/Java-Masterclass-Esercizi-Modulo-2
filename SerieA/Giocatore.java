package SerieA;

public class Giocatore {
    int id;
    String nome;
    String Cognome;

    public Giocatore(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        Cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }
}
