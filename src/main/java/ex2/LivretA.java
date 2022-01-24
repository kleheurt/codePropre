package ex2;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
		this.decouvert = 0;
	}
	
	public void appliquerRemuAnnuelle() {
			this.solde = solde + solde * tauxRemuneration / 100;
	}
	
	@Override
	public String getType() {
		return "LA";
	}

}
