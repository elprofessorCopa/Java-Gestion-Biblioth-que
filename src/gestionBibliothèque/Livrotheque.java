package gestionBibliothèque;

public class Livrotheque {

    private Livre[] livres;     
    private int capacite;         
    private int nombreLivres;     

    
    public Livrotheque(int capacite) {
        this.capacite = capacite;
        this.livres = new Livre[capacite];  
        this.nombreLivres = 0;               // Aucun livre au début
    }

    
    public void afficherAuteurs() {
        System.out.println("Auteurs des livres dans la Livrotheque:");
        for (int i = 0; i < nombreLivres; i++) {
            System.out.println("Auteur: " + livres[i].getAuteur());
        }
    }

    
    public boolean ajouterLivre(Livre livre) {
        if (nombreLivres < capacite) {
            livres[nombreLivres++] = livre;  // Ajoute le livre et incrémente le nombre de livres
            return true;  
        } else {
            return false; // Capacité maximale atteinte, ajout échoué
        }
    }

    
}

