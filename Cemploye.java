class Cemploye{
     // ATTRIBUTS

        private int matricule;
        private String nom;
        private String prenom;
        private int age;
        private int salaire;

     //  CONSTRUCTEURS

        public Cemploye(){
                System.out.println("Employé Ajouter");
                nom = "aucun";
                prenom = "aucun";
                age = 0;
                salaire = 0;
                matricule = 0;
        }
        public Cemploye(int matricule, String nom, String prenom, int age, int salaire){
                System.out.println("Employé Ajouter");
                this.nom = nom;
                this.prenom = prenom;
                this.salaire = salaire;
                this.matricule = matricule;
                this.age = age;
        }
        public Cemploye(Cemploye emp){
                System.out.println("Employé Ajouter");
                this.nom = emp.nom;
                this.prenom = emp.prenom;
                this.salaire = emp.salaire;
                this.matricule = emp.matricule;
                this.age = emp.age;
        }

     // ACCESSEURS

        public int getMatricule() {
                return matricule;
        }

        public String getNom() {
                return nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public int getAge() {
                return age;
        }

        public int getSalaire() {
                return salaire;
        }

        public void setMatricule(int matricule) {
                this.matricule = matricule;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setSalaire(int salaire) {
                this.salaire = salaire;
        }

     // METHODES
        public void afficherEmp(){
                String s = "le nom de l'employé est :" + this.nom + "\nle prenom de l'employé est :" + this.prenom + "\nl'âge de l'employé est :" + this.age + "\nle salaire de l'employé est : "+ this.salaire;
                System.out.println(s);
        }
}
