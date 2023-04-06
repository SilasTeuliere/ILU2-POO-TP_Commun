package model;

public class FormulaireHotel extends Formulaire{
	private int nbLit1;
	private int nbLit2;
	private int noChambre;
	
	public FormulaireHotel(int jour, int mois, int nbLit1, int nbLit2, int noChambre) {
		super(jour, mois);
		this.nbLit1 = nbLit1;
		this.nbLit2 = nbLit2;
		this.noChambre = noChambre;
	}
	public int getNbLit1() {
		return nbLit1;
	}
	public int getNbLit2() {
		return nbLit2;
	}
	public int getNoChambre() {
		return noChambre;
	}
	
}
