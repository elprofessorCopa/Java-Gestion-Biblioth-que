package gestionBibliothèque;

public class Document {
	 private int numEnreg;
	private String titre;
	
	public Document(int numEnreg,String titre) {
		this.numEnreg = numEnreg;
		this.titre = titre;
	}
	
	

	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}

	public int getNumEnreg() {
		return numEnreg;
	}

	
	public String getTitre() {
		return titre;
	}

	
	
}
