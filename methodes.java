import java.util.ArrayList;
import java.util.Scanner;

public class methodes {
    Scanner input = new Scanner(System.in);

    public void Ajouter(ArrayList list, int matricule) {

        try {
            System.out.println("Entrer le nom de l'employé : ");
            String nom = input.next();
            System.out.println("Entrer le prénom de l'employé : ");
            String prenom = input.next();
            System.out.println("Entrer l'âge de l'employé : ");
            int age = input.nextInt();
            System.out.println("Entrer le salaire de l'employé : ");
            int salaire = input.nextInt();
            Cemploye emp = new Cemploye(matricule, nom, prenom, age, salaire);
            list.add(emp);
        } catch (Exception e) {
            System.out.println("!!!!! ERREUR de saisie veillez réessayer !!!!!!");
        }
    }

    public void Modifier(ArrayList<Cemploye> list, int matricule) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMatricule() == matricule) {
                try {
                    System.out.println("Modifier le nom : ");
                    String nom = input.next();
                    list.get(i).setNom(nom);
                    System.out.println("Modifier le prénom : ");
                    String prenom = input.next();
                    list.get(i).setPrenom(prenom);
                    System.out.println("Modifier l'âge : ");
                    int age = input.nextInt();
                    list.get(i).setAge(age);
                    System.out.println("Modifier le salaire : ");
                    int salaire = input.nextInt();
                    list.get(i).setSalaire(salaire);
                } catch (Exception e) {
                    System.out.println("!!!!! ERREUR de saisie veillez réessayer !!!!!!");
                }
            }
        }
    }

    public void Supprimer(ArrayList<Cemploye> list, int matricule) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMatricule() == matricule) {
                list.remove(i);
            }
        }
    }

    public void Afficher(ArrayList<Cemploye> list, int matricule) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMatricule() == matricule) {
                list.get(i).afficherEmp();
            }
        }
    }

    public void AfficherTous(ArrayList<Cemploye> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).afficherEmp();
            System.out.println("_____________________________________________________________________________________________");
        }
    }

    public void NB10000(ArrayList<Cemploye> list) {
        int nombreEmploye = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSalaire() > 10000) {
                nombreEmploye += 1;
            }
        }
        String nb = "Le nombre des employés qui dépasse les 10000 est : " + nombreEmploye;
        System.out.println(nb);
    }

    public void Plusage(ArrayList<Cemploye> list) {
        int test = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() > list.get(i + 1).getAge()) {
                test = i;
            }
        }
        String plus = "l'employé le plus âgé est : " + list.get(test).getNom();
        System.out.println(plus);
    }

    public void Moinsage(ArrayList<Cemploye> list){
        int test = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() < list.get(i + 1).getAge()) {
                test = i;
            }
        }
        String moins = "l'employé le moins âgé est : " + list.get(test).getNom();
        System.out.println(moins);
    }
}