package ex1;

import java.util.Date;

/** Classe modélisant une entreprise */
public class Entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	/** Plafond de capital */
	public static final int capitalMax = 3000000;
	
	/** Permet d'afficher le statut de l'entreprise */
	public void afficherStatut(){
		
	}
	
}
