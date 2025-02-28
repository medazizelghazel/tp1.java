package tp1;

public class Main {
    public static void main(String[] args) {
        TacheElementaire t1=new TacheElementaire("Tâche 1", 100);
        TacheElementaire t2=new TacheElementaire("Tâche 2", 200);
        
        TacheComplexe complexe=new TacheComplexe("Tâche Complexe");
        complexe.ajouter(t1);
        complexe.ajouter(t2);

        System.out.println("nom :" + complexe.getNom());
        System.out.println("cout total :" + complexe.getCout());
    }
}

