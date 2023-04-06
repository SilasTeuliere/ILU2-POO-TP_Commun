package model;

public class ReservationSpectacle extends Reservation { 
	private int noZone; // Service 1 ou 2
	private int noChaiseRes;
	public ReservationSpectacle(int jour, int mois, int noZone, int noChaiseRes) {
		super(jour, mois);
		this.noZone = noZone;
		this.noChaiseRes = noChaiseRes;
	}
	public int getNoZone() {
		return noZone;
	}
	public int getNoChaiseRes() {
		return noChaiseRes;
	}
	
}
