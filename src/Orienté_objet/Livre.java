package Orienté_objet;

import java.util.Date;

public class Livre {
    private String titre;
    private Auteur auteur;
    private String datePublication;
    private int numeroIdentification;
    private boolean disponible;
    private Emprunteur emprunteur;
    private Date dateEmprunt;

    // Constructeur de la classe Livre
    public Livre(String titre, Auteur auteur, String datePublication, int numeroIdentification) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.numeroIdentification = numeroIdentification;
        this.disponible = true;
        this.dateEmprunt = null;
        this.emprunteur = null;
    }

    // Getter et setter pour l'attribut titre
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Getter et setter pour l'attribut auteur
    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    // Getter et setter pour l'attribut datePublication
    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    // Getter et setter pour l'attribut numeroIdentification
    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    // Getter et setter pour l'attribut disponible
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Getter et setter pour l'attribut emprunteur
    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    // Getter et setter pour l'attribut dateEmprunt
    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    // Méthode toString pour afficher les informations d'un livre
    @Override
    public String toString() {
        return "Livre [titre=" + titre + ", auteur=" + auteur.getNom() + ", datePublication=" + datePublication
                + ", numeroIdentification=" + numeroIdentification + ", disponible=" + disponible + ", emprunteur="
                + (emprunteur == null ? "Aucun" : emprunteur.getNom()) + ", dateEmprunt="
                + (dateEmprunt == null ? "Aucune" : dateEmprunt) + "]";
    }
}
