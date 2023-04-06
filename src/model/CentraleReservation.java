package model;

public class CentraleReservation {
	private EntiteReservable[] entiteAReserver; // soit uniquement tables, soit uniquement chambres, soit uniquement places
	private int nbEntite;
	public CentraleReservation(EntiteReservable[] entiteAReserver, int nbEntite) {
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
		return new int[0];
	}
	
	public Reservation reserver(int nbEntite, Formulaire form) {
		return null;
	}
}
