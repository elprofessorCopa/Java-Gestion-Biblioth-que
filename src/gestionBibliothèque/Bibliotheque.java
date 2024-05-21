package gestionBibliothèque;

public class Bibliotheque {
    private Document[] documents;  // Tableau pour stocker les documents
    private int capacite;          
    private int nombreDocuments;   

    
    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.documents = new Document[capacite];  // Initialise le tableau pour stocker les documents
        this.nombreDocuments = 0;                 
    }

    // Méthode pour afficher tous les documents de la bibliothèque
    public void afficherDocuments() {
        for (int i = 0; i < nombreDocuments; i++) {
            System.out.println(documents[i].toString());
        }
    }

    // Méthode pour récupérer un document à une position donnée
    public Document document(int i) {
        if (i >= 0 && i < nombreDocuments) {
            return documents[i];
        } else {
            return null;  // Retourne null si la position est invalide
        }
    }

    // Méthode pour ajouter un document à la bibliothèque
    public boolean ajouter(Document doc) {
        if (nombreDocuments < capacite) {
            documents[nombreDocuments++] = doc;  
            return true;  
        } else {
            return false; // Capacité maximale atteinte, ajout échoué
        }
    }

    // Méthode pour supprimer un document de la bibliothèque
    public boolean supprimer(Document doc) {
        for (int i = 0; i < nombreDocuments; i++) {
            if (documents[i].equals(doc)) {
                // Déplace les éléments du tableau pour supprimer le document
                for (int j = i; j < nombreDocuments - 1; j++) {
                    documents[j] = documents[j + 1];
                }
                nombreDocuments--;  // Décrémente le nombre de documents après la suppression
                return true;  // Suppression réussie
            }
        }
        return false; // Document non trouvé, suppression échouée
    }

    // Méthode pour afficher les auteurs des livres dans la bibliothèque
    public void afficherAuteurs() {
        for (int i = 0; i < nombreDocuments; i++) {
            if (documents[i] instanceof Livre) {
                Livre livre = (Livre) documents[i];
                System.out.println("Auteur: " + livre.getAuteur());
            }
        }
    }
}
