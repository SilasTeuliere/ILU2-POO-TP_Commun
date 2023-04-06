package model;

public class centraleReservation {
	private EntiteReservable[] entiteAReserver; // soit uniquement tables, soit uniquement chambres, soit uniquement places
	private int nbEntite;
	public centraleReservation(EntiteReservable[] entiteAReserver, int nbEntite) {
		super();
		this.entiteAReserver = entiteAReserver;
		this.nbEntite = nbEntite;
	}
	public EntiteReservable[] getEntiteAReserver() {
		return entiteAReserver;
	}
	public int getNbEntite() {
		return nbEntite;
	}
	
	public int ajouterEntite(EntiteReservable newEntite) {
		return nbEntite;
	}
	
	public int[] donnerPossibilite(Formulaire form) {
		return null;
	}
	
	public Reservation reserver(int nbEntite, Formulaire form) {
		return null;
	}
}
