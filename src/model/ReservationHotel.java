package model;

public class ReservationHotel extends Reservation{
	private int jour;
	private int mois;
	private int nbLit1;
	private int nbLit2;
	private int noChambre;
	public ReservationHotel(int jour, int mois, int nbLit1, int nbLit2, int noChambre) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.nbLit1 = nbLit1;
		this.nbLit2 = nbLit2;
		this.noChambre = noChambre;
	}
	
}
