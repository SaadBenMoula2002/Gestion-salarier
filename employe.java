import java.util.ArrayList;
import java.util.Scanner;
public class employe {
    public static void main(String[] args) {
        ArrayList<Cemploye> employe = new ArrayList<>();
        int matricule = 0, number = 0;
        methodes M = new methodes();

        while (true) {

// MENU DU PROGRAMME

            System.out.println("_____________________________________________________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t  MENU DU PROGRAMME ");
            System.out.println("_____________________________________________________________________________________________");
            System.out.println("1- Ajouter un nouvel employé");
            System.out.println("2- Modifier un employé");
            System.out.println("3- Supprimer un employé");
            System.out.println("4- Afficher un employé");
            System.out.println("5- Afficher tous les employés");
            System.out.println("6- Calculer le nombre des employés ayant un salaire qui dépasse 10000");
            System.out.println("7- Afficher l'employé le plus âgé");
            System.out.println("8- Afficher l'employé le moins âgé");
            System.out.println("9- Quitter");

            Scanner input = new Scanner(System.in);
            System.out.println("_____________________________________________________________________________________________");
            try {
                System.out.print("Donner votre choix: ");
                number = input.nextInt();
                System.out.println("Entrer le matricule de l'employé : ");
                matricule = input.nextInt();
            } catch (Exception e) {
                System.out.print("ERREUR de saisie entrer un entier !\n");
                number = 0;
            }
// AJOUTER
            if (number == 1) {
                M.Ajouter(employe, matricule);
            }
// MODIFIER
            if (employe.isEmpty()) {
                System.out.println("Aucun employé existe dans votre base de donnée");
            } else if (employe.get(employe.size() - 1).getMatricule() != matricule) {
                System.out.println("!!!!!!! MATRICULE INEXISTANT !!!!!!!!");
            } else {
                if (number == 2) {
                    M.Modifier(employe, matricule);
                }
// SUPPRIMER
                else if (number == 3) {
                    M.Supprimer(employe, matricule);
                }
// AFFICHER 1
                else if (number == 4) {
                    M.Afficher(employe, matricule);
                }
// AFFICHER PLUSIEURS
                else if (number == 5) {
                    M.AfficherTous(employe);
                }
// SALAIRE PLUS DE 10000
                else if (number == 6) {
                    M.NB10000(employe);
                }
// PLUS AGE
                else if (number == 7) {
                    M.Plusage(employe);
                }
// MOINS AGE
                else if (number == 8) {
                    M.Moinsage(employe);
                }
            }
// SORTIR
            if (number == 9) {
                break;
            } else {
                System.out.println("choix inexistant veillez réessayer ou matricule non conforme");
            }
        }
    }
}