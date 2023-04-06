package model;

public class ReservationRestaurant extends Reservation{ 
	private int noService; // Service 1 ou 2
	private int noTableRes;
	public ReservationRestaurant(int jour, int mois, int noService, int noTableRes) {
		super(jour, mois);
		this.noService = noService;
		this.noTableRes = noTableRes;
	}
	public int getNoService() {
		return noService;
	}
	public int getNoTableRes() {
		return noTableRes;
	}
	
}
