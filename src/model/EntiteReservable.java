package model;

public class EntiteReservable {
	private int noId;
	private CalendrierAnnuel calendrier;
	public EntiteReservable(int noId, CalendrierAnnuel calendrier) {
		super();
		this.noId = noId;
		this.calendrier = calendrier;
	}
	
	public int getNoId() {
		return noId;
	}
	
	public void setNoId(int noId) {
		this.noId = noId;
	}
	
	public CalendrierAnnuel getCalendrier() {
		return calendrier;
	}
	
	public boolean estLibre(Formulaire form) {
		return false;
	}
	
	public boolean compatible(Formulaire form) {
		return false;
	}
	
	public Reservation reserver(Formulaire form){
		Reservation reserv = null;
		return reserv;
	}
	
}
