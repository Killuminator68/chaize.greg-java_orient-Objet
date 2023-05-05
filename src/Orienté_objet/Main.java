package Orienté_objet;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création des auteurs, livres et emprunteurs
        Auteur auteur1 = new Auteur("J.K. Rowling", "31 juillet 1965", "Britannique");
        Livre livre1 = new Livre("Harry Potter à l'école des sorciers", auteur1, "1997", 1);
        Livre livre2 = new Livre("Harry Potter et la chambre des secrets", auteur1, "1998", 2);
        Auteur auteur2 = new Auteur("Victor Hugo", "26 février 1802", "Français");
        Livre livre3 = new Livre("Les Misérables", auteur2, "1862", 3);
        Emprunteur emprunteur1 = new Emprunteur("Jean Dupont", "3 rue des Fleurs", "0123456789");

        // Création de la bibliothèque
        Bibliothèque bibliothèque = new Bibliothèque();

        // Ajout des auteurs, livres et emprunteurs à la bibliothèque
        bibliothèque.ajouterAuteur(auteur1);
        bibliothèque.ajouterAuteur(auteur2);
        bibliothèque.ajouterLivre(livre1);
        bibliothèque.ajouterLivre(livre2);
        bibliothèque.ajouterLivre(livre3);
        bibliothèque.ajouterEmprunteur(emprunteur1);

        // Affichage des livres, auteurs et emprunteurs de la bibliothèque
        System.out.println("Liste des livres de la bibliothèque :");
        bibliothèque.afficherLivres();
        System.out.println("\nListe des auteurs de la bibliothèque :");
        bibliothèque.afficherAuteurs();
        System.out.println("\nListe des emprunteurs de la bibliothèque :");
        bibliothèque.afficherEmprunteurs();

        // Emprunt d'un livre
        System.out.println("\nEmprunt du livre " + livre1.getTitre() + " par " + emprunteur1.getNom());
        bibliothèque.emprunterLivre(livre1.getNumeroIdentification(), emprunteur1.getNom(), new Date());
        System.out.println("\nListe des livres de la bibliothèque après emprunt :");
        bibliothèque.afficherLivres();

        // Retour d'un livre
        System.out.println("\nRetour du livre " + livre1.getTitre());
        bibliothèque.retournerLivre(livre1.getNumeroIdentification(), new Date());
        System.out.println("\nListe des livres de la bibliothèque après retour :");
        bibliothèque.afficherLivres();

        // Suppression d'un livre, auteur et emprunteur
        System.out.println("\nSuppression du livre " + livre2.getTitre());
        bibliothèque.supprimerLivre(livre2);
        System.out.println("\nSuppression de l'auteur " + auteur2.getNom());
        bibliothèque.supprimerAuteur(auteur2);
        System.out.println("\nSuppression de l'emprunteur " + emprunteur1.getNom());
        bibliothèque.supprimerEmprunteur(emprunteur1);
        System.out.println("\nListe des livres de la bibliothèque après suppression :");
        bibliothèque.afficherLivres();
        System.out.println("\nListe des auteurs de la bibliothèque après suppression :");
        bibliothèque.afficherAuteurs();
        System.out.println("\nListe des emprunteurs de la bibliothèque après suppression :");
        bibliothèque.afficherEmprunteurs();

        // Modification d'un livre, auteur et emprunteur
        System.out.println("\nModification du livre " + livre3.getTitre());
        bibliothèque.modifierLivre(livre3, "Les Misérables - Nouvelle édition", auteur2, "1862", 3);
        System.out.println("\nModification de l'auteur " + auteur1.getNom());
        bibliothèque.modifierAuteur(auteur1, "Joanne Rowling", "31 juillet 1965", "Britannique");
        System.out.println("\nModification de l'emprunteur " + emprunteur1.getNom());
        bibliothèque.modifierEmprunteur(emprunteur1, "Jeanne Dupont", "3 rue des Roses", "9876543210");
        System.out.println("\nListe des livres de la bibliothèque après modification :");
        bibliothèque.afficherLivres();
        System.out.println("\nListe des auteurs de la bibliothèque après modification :");
        bibliothèque.afficherAuteurs();
        System.out.println("\nListe des emprunteurs de la bibliothèque après modification :");
        bibliothèque.afficherEmprunteurs();
    }
}
        
        


