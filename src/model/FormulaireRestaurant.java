package model;

public class FormulaireRestaurant extends Formulaire{ 
	private int noTable;
	private int nbPersonneConv;
	private int noService;
	
	public FormulaireRestaurant(int jour, int mois, int noTable, int nbPersonneConv, int noService) {
		super(jour, mois);
		this.noTable = noTable;
		this.nbPersonneConv = nbPersonneConv;
		this.noService = noService;
	}
	public int getNoTable() {
		return noTable;
	}
	public int getNbPersonneConv() {
		return nbPersonneConv;
	}
	public int getNoService() {
		return noService;
	}
	
}
