package gestionBibliothèque;
import java.util.ArrayList;

public class TestDocuments {

	public static void main(String[] args) {
		ArrayList<Document>documents = new ArrayList<>();
		 Livre livre1 = new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry", 100);
	        Livre livre2 = new Livre(2, "1984", "George Orwell", 300);
	        Roman roman1 = new Roman(3, "Harry Potter", "J.K. Rowling", 500, 5000);
	        Manuel manuel1 = new Manuel(4, "Mathématiques 101", "Professeur Math", 200, 10);
	        Revue revue1 = new Revue(5, "National Geographic", 12, 2022);
	        Dictionnaire dictionnaire1 = new Dictionnaire(6, "Oxford English Dictionary", "anglais");
	        documents.add(livre1);
	        documents.add(livre2);
	        documents.add(roman1);
	        documents.add(manuel1);
	        documents.add(revue1);
	        documents.add(dictionnaire1);
	        
	        for(int i=0;i<documents.size();i++) {
	        	System.out.println(documents.get(i).toString());
	        }
	        

	}

}
