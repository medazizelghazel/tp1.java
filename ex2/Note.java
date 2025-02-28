package ex2;

public class Note {
    private String cours;
    private float valeur;

    public Note(String cours, float valeur) {
        this.cours = cours;
        this.valeur = valeur;
    }

    public float getValeur() {
        return valeur;
    }

    public String getCours() {
        return cours;
    }
}
