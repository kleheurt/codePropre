package ex3;

import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void afficherListeAnimaux(){
		for (Zone zone : zones) {
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
}
