package Orienté_objet;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Bibliothèque {
    // Attributs de la classe Bibliothèque
    private List<Auteur> auteurs;
    private List<Livre> livres;
    private List<Emprunteur> emprunteurs;

    // Constructeur de la classe Bibliothèque
    public Bibliothèque() {
        auteurs = new ArrayList<>();
        livres = new ArrayList<>();
        emprunteurs = new ArrayList<>();
    }

    // Méthode pour ajouter un livre à la bibliothèque
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    // Méthode pour supprimer un livre de la bibliothèque
    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }

    // Méthode pour modifier les informations d'un livre
    public void modifierLivre(Livre livre, String titre, Auteur auteur, String datePublication, int numeroIdentification) {
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setDatePublication(datePublication);
        livre.setNumeroIdentification(numeroIdentification);
    }

    // Méthode pour afficher tous les livres de la bibliothèque
    public void afficherLivres() {
        for (Livre livre : livres) {
            System.out.println(livre.toString());
            System.out.println("---------------------------");
        }
    }

    // Méthode pour ajouter un auteur à la bibliothèque
    public void ajouterAuteur(Auteur auteur) {
        auteurs.add(auteur);
    }

    // Méthode pour supprimer un auteur de la bibliothèque
    public void supprimerAuteur(Auteur auteur) {
        auteurs.remove(auteur);
    }

    // Méthode pour modifier les informations d'un auteur
    public void modifierAuteur(Auteur auteur, String nom, String dateNaissance, String nationalite) {
        auteur.setNom(nom);
        auteur.setDateNaissance(dateNaissance);
        auteur.setNationalite(nationalite);
    }

    // Méthode pour afficher tous les auteurs de la bibliothèque
    public void afficherAuteurs() {
        for (Auteur auteur : auteurs) {
            System.out.println(auteur.toString());
            System.out.println("---------------------------");
        }
    }

    // Méthode pour ajouter un emprunteur à la bibliothèque
    public void ajouterEmprunteur(Emprunteur emprunteur) {
        emprunteurs.add(emprunteur);
    }

    // Méthode pour supprimer un emprunteur de la bibliothèque
    public void supprimerEmprunteur(Emprunteur emprunteur) {
        emprunteurs.remove(emprunteur);
    }

    // Méthode pour modifier les informations d'un emprunteur
    public void modifierEmprunteur(Emprunteur emprunteur, String nom, String adresse, String numeroTelephone) {
        emprunteur.setNom(nom);
        emprunteur.setAdresse(adresse);
        emprunteur.setNumeroTelephone(numeroTelephone);
    }
    
 // Méthode pour afficher tous les emprunteurs de la bibliothèque
    public void afficherEmprunteurs() {
        for (Emprunteur emprunteur : emprunteurs) {
            System.out.println(emprunteur.toString());
            System.out.println("---------------------------");
        }
    }

    // Méthode pour emprunter un livre de la bibliothèque
    public void emprunterLivre(int numeroIdentification, String nomEmprunteur, Date dateEmprunt) {
        Livre livre = null;
        for (Livre l : livres) {
            if (l.getNumeroIdentification() == numeroIdentification) {
                livre = l;
                break;
            }
        }
        if (livre != null && livre.isDisponible()) {
            Emprunteur emprunteur = null;
            for (Emprunteur e : emprunteurs) {
                if (e.getNom().equals(nomEmprunteur)) {
                    emprunteur = e;
                    break;
                }
            }
            if (emprunteur != null) {
                livre.setDisponible(false);
                livre.setDateEmprunt(dateEmprunt);
                livre.setEmprunteur(emprunteur);
                emprunteur.addLivre(livre);
                System.out.println("Le livre " + livre.getTitre() + " a été emprunté par " + emprunteur.getNom());
            } else {
                System.out.println("L'emprunteur " + nomEmprunteur + " n'existe pas.");
            }
        } else if (livre == null) {
            System.out.println("Le livre avec le numéro d'identification " + numeroIdentification + " n'existe pas.");
        } else {
            System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour l'emprunt.");
        }
    }

    // Méthode pour retourner un livre à la bibliothèque
    public void retournerLivre(int numeroIdentification, Date dateRetour) {
        Livre livre = null;
        for (Livre l : livres) {
            if (l.getNumeroIdentification() == numeroIdentification) {
                livre = l;
                break;
            }
        }
        if (livre != null && !livre.isDisponible()) {
            Emprunteur emprunteur = livre.getEmprunteur();
            livre.setDisponible(true);
            livre.setDateEmprunt(null);
            livre.setEmprunteur(null);
            emprunteur.removeLivre(livre);
            System.out.println("Le livre " + livre.getTitre() + " a été retourné par " + emprunteur.getNom() + " le " + dateRetour);
        } else if (livre == null) {
            System.out.println("Le livre avec le numéro d'identification " + numeroIdentification + " n'existe pas.");
        } else {
            System.out.println("Le livre " + livre.getTitre() + " n'a pas été emprunté.");
        }
    }
}