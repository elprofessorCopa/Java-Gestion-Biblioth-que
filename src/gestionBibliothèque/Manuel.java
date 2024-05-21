package gestionBibliothèque;

public class Manuel extends Livre {
	int niveau;
	public Manuel(int numEnreg,String titre,String auteur,int nbrPages,int niveau) {
		super(numEnreg,titre,auteur,nbrPages);
		this.niveau = niveau;
		
	}
	@Override
	public String toString() {
		return "Manuel [niveau=" + niveau + "]";
	}
	public int getNiveau() {
		return niveau;
	}
	
	
	

}
