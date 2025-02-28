package ex2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant implements IStatisticable, Comparable<Etudiant> {
    private String matricule;
    private String nom;
    private List<Note> notes;

    public Etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    @Override
    public float getValue() {
        return (float) notes.stream().mapToDouble(Note::getValeur).average().orElse(0);
    }

    public float getMeilleureNote() {
    	float max = 0;
    	for (Note note : notes) {
    	    if (note.getValeur() > max) {
    	        max = note.getValeur();
    	    }
    	}
    	return max;
    }

    public float getMoinsBonneNote() {
    	if (notes.isEmpty()) {
    	    return 0;
    	}

    	float min = notes.get(0).getValeur();
    	for (Note note : notes) {
    	    if (note.getValeur() < min) {
    	        min = note.getValeur();
    	    }
    	}
    	return min;

    }

    @Override
    public int compareTo(Etudiant e) {
        return Float.compare(this.getValue(), e.getValue());
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }
}
