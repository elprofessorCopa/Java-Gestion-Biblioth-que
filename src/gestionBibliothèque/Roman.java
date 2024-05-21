package gestionBibliothèque;

public class Roman extends Livre{
	int prixLitt;
	public Roman(int numEnreg,String titre,String auteur,int nbrPages,int prixLitt) {
		super(numEnreg,titre,auteur,nbrPages);
		this.prixLitt = prixLitt;
		
	}
	@Override
	public String toString() {
		return "Roman [prixLitt=" + prixLitt + "]";
	}
	public int getPrixLitt() {
		return prixLitt;
	}
	
	

}
