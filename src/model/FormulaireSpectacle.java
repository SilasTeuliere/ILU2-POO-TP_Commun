package model;

public class FormulaireSpectacle extends Formulaire{
	private int noZone; 
	private int noPlaceRes;
	public FormulaireSpectacle(int jour, int mois, int noZone, int noPlaceRes) {
		super(jour, mois);
		this.noZone = noZone;
		this.noPlaceRes = noPlaceRes;
	}
	public int getNoZone() {
		return noZone;
	}
	public int getNoPlaceRes() {
		return noPlaceRes;
	}
	
}
