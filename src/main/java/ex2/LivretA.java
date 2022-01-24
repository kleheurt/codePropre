package ex2;

public class LivretA extends CompteBancaire {
	
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde,0);
		this.tauxRemuneration = tauxRemuneration;
		
	}
	
	public void appliquerRemuAnnuelle() {
			this.solde = solde + solde * tauxRemuneration / 100;
	}
	
	@Override
	public String getType() {
		return "LA";
	}
	
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}


}
