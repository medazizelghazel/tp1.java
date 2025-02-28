package ex2;

import java.util.List;

public class Stats {
    public static void afficherStatsEtudiants(List<Etudiant> etudiants) {
        for (Etudiant e : etudiants) {
            System.out.println("Étudiant : " + e.getNom());
            System.out.println("Moyenne : " + e.getValue());
            System.out.println("Meilleure note : " + e.getMeilleureNote());
            System.out.println("Moins bonne note : " + e.getMoinsBonneNote());
            System.out.println();
        }
    }

    public static float getMoyenneGroupe(List<Etudiant> etudiants) {
        return (float) etudiants.stream().mapToDouble(Etudiant::getValue).average().orElse(0);
    }

    public static Etudiant getMaximumGroupe(List<Etudiant> etudiants) {
        return etudiants.stream().max(Etudiant::compareTo).orElse(null);
    }

    public static Etudiant getMinimumGroupe(List<Etudiant> etudiants) {
        return etudiants.stream().min(Etudiant::compareTo).orElse(null);
    }
}
