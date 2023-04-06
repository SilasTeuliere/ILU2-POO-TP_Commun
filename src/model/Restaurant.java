package model;

public class Restaurant {
	private CentraleReservation centrale;
	
	public Restaurant(CentraleReservation centrale) {
		super();
		this.centrale = centrale;
	}
	public void ajouterTable(int nbChaise) {
	}
	public int[] donnerPossibilite(FormulaireRestaurant formulaireRestaurant) {
		return centrale.donnerPossibilite(formulaireRestaurant);
	}
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaireRestaurant) {
		return centrale.reserver(numEntite, formulaireRestaurant);
	}
	
	private class Table extends EntiteReservable{
		private int nbChaise;
		
		public Table(int noId, CalendrierAnnuel calendrier, int nbChaise) {
			super(noId, calendrier);
			this.nbChaise = nbChaise;
		}
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			return null;
		}
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			return false;
		}
	}
}
