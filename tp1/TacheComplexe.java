package tp1;

import java.util.ArrayList;
import java.util.Collection;

public class TacheComplexe implements Tache {
    private String nom;
    private Collection<Tache> sousTaches;

    public TacheComplexe(String nom) {
        this.nom=nom;
        this.sousTaches=new ArrayList<>();
    }

    public void ajouter(Tache t) {
        sousTaches.add(t);
    }

    public void supprimer(Tache t) {
        sousTaches.remove(t);
    }

    public String getNom() {
        return nom;
    }

    public int getCout() {
    	int total=0;
    	for (Tache t:sousTaches) {
    	    total+=t.getCout();
    	}
    	return total;
    }
}

