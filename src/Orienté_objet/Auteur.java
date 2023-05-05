package Orienté_objet;

public class Auteur {
    // Attributs de la classe Auteur
    private String nom;
    private String dateNaissance;
    private String nationalite;

    // Constructeur de la classe Auteur
    public Auteur(String nom, String dateNaissance, String nationalite) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.nationalite = nationalite;
    }

    // Getter pour l'attribut nom
    public String getNom() {
        return nom;
    }

    // Setter pour l'attribut nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour l'attribut dateNaissance
    public String getDateNaissance() {
        return dateNaissance;
    }

    // Setter pour l'attribut dateNaissance
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // Getter pour l'attribut nationalite
    public String getNationalite() {
        return nationalite;
    }

    // Setter pour l'attribut nationalite
    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'auteur
    @Override
    public String toString() {
        return "Auteur [nom=" + nom + ", dateNaissance=" + dateNaissance + ", nationalite=" + nationalite + "]";
    }
}
