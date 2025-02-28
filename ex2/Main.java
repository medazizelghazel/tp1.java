package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("001", "Alice");
        e1.addNote(new Note("Math", 15));
        e1.addNote(new Note("Physique", 12));

        Etudiant e2 = new Etudiant("002", "Bob");
        e2.addNote(new Note("Math", 10));
        e2.addNote(new Note("Physique", 8));

        Etudiant e3 = new Etudiant("003", "Charlie");
        e3.addNote(new Note("Math", 17));
        e3.addNote(new Note("Physique", 18));

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(e1);
        etudiants.add(e2);
        etudiants.add(e3);

        System.out.println("Statistiques des étudiants :");
        Stats.afficherStatsEtudiants(etudiants);

        System.out.println("Moyenne du groupe : " + Stats.getMoyenneGroupe(etudiants));

        System.out.println("Meilleur étudiant : " + Stats.getMaximumGroupe(etudiants).getNom());
        System.out.println("Moins bon étudiant : " + Stats.getMinimumGroupe(etudiants).getNom());

        System.out.println("\nTri par moyenne :");
        Collections.sort(etudiants);
        etudiants.forEach(e -> System.out.println(e.getNom() + " - " + e.getValue()));

        System.out.println("\nTri par matricule :");
        etudiants.sort(new CompareMat());
        etudiants.forEach(e -> System.out.println(e.getNom() + " - " + e.getMatricule()));

        System.out.println("\nTri par nom :");
        etudiants.sort(new CompareNom());
        etudiants.forEach(e -> System.out.println(e.getNom()));
    }
}
