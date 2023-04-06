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
	public void setCalendrier(CalendrierAnnuel calendrier) {
		this.calendrier = calendrier;
	}
	
	
}
