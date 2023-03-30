package model;

public class CalendrierAnnuel {
	private int jour;
	private int mois;
	public CalendrierAnnuel(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}
	
	public boolean estLibre(int jour, int mois) {
		
		return true;
	}
	
	public boolean reserver(int jour, int mois) {
		
		return true;
	}
	
	/*private enum Mois{
		
		JANVIER("Janvier", 31),
		FEVRIER("Fevrier", 28),
		MARS("Mars", 31),
		AVRIL("Avril", 30),
		MAI("Mai", 31),
		JUIN("Juin", 30),
		JUILLET("Juillet", 31),
		AOUT("Aout", 31),
		SEPTEMBRE("Septembre", 30),
		OCTOBRE("Octobre", 31),
		NOVEMBRE("Novembre", 30),
		DECEMBRE("Decembre", 31);
		
		private String nom;
		private int nbJours;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.nbJours = nbJours;
		}

		public String getNom() {
			return nom;
		}

		public int getNbJours() {
			return nbJours;
		}
		
		private boolean estLibre(int jour) throws IllegalStateException {
			return false;
		}
		
		private void reserver(int jour) {
		}
		
	}*/
	
	
	
}
