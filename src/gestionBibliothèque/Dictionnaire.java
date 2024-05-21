package gestionBibliothèque;

public class Dictionnaire extends Document{
	private String langue;
	public Dictionnaire(int numEnreg,String titre,String langue) {
		super(numEnreg,titre);
		this.langue = langue;
		
	}
	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + "]";
	}
	public String getLangue() {
		return langue;
	}
	
	


}
