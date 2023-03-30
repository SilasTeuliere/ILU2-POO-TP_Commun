package model;

public class ReservationSpectacle extends Reservation{
	private int jour;
	private int mois;
	private int noZone; // Service 1 ou 2
	private int noChaiseRes;
	public ReservationSpectacle(int jour, int mois, int noZone, int noChaiseRes) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.noZone = noZone;
		this.noChaiseRes = noChaiseRes;
	}
}
