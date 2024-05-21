package gestionBibliothèque;

public class Livre extends Document{
	private String auteur;
	private int nbrPages;
	public Livre(int numEnreg,String titre,String auteur,int nbrPages) {
		super(numEnreg,titre);
		this.auteur = auteur;
		this.nbrPages = nbrPages;
	}
	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nbrPages=" + nbrPages + "]";
	}
	public String getAuteur() {
		return auteur;
	}
	
	public int getNbrPages() {
		return nbrPages;
	}
	

}
