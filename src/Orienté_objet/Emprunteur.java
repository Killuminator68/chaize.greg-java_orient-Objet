package Orienté_objet;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {
    private String nom;
    private String adresse;
    private String numeroTelephone;
    private List<Livre> livresEmpruntes;

    // Constructeur de la classe Emprunteur
    public Emprunteur(String nom, String adresse, String numeroTelephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        livresEmpruntes = new ArrayList<>();
    }

    // Getter et setter pour l'attribut nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et setter pour l'attribut adresse
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter et setter pour l'attribut numeroTelephone
    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    // Méthode pour ajouter un livre à la liste des livres empruntés
    public void addLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    // Méthode pour supprimer un livre de la liste des livres empruntés
    public void removeLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    // Méthode pour obtenir la liste des livres empruntés
    public List<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    // Méthode toString pour afficher les informations d'un emprunteur
    @Override
    public String toString() {
        return "Emprunteur [nom=" + nom + ", adresse=" + adresse + ", numeroTelephone=" + numeroTelephone + "]";
    }
}
