package model;

public class ReservationRestaurant extends Reservation{
	private int jour;
	private int mois;
	private int noService; // Service 1 ou 2
	private int noTableRes;
	public ReservationRestaurant(int jour, int mois, int noService, int noTableRes) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.noService = noService;
		this.noTableRes = noTableRes;
	}
}
