package gestionBibliothèque;

public class Revue extends Document {
	private int mois ;
	private int annee;
	public Revue(int numEnreg,String titre,int mois,int annee) {
		super(numEnreg,titre);
		this.mois = mois;
		this.annee = annee;
	}
	@Override
	public String toString() {
		return "Revue [mois=" + mois + ", annee=" + annee + "]";
	}
	public int getMois() {
		return mois;
	}
	
	public int getAnnee() {
		return annee;
	}
	

}
