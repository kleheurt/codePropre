package ex1;

import java.util.Date;

/** Classe modélisant une entreprise
 * @author DIGINAMIC */
public class Entreprise {

	/** numéro de siret */
	public int siret;
	
	/** nom de l'entreprise */
	public String nom;
	
	/** adresse de l'entreprise */
	public String adresse;
	
	/** date de création*/
	public Date dateCreation;
	
	/** Plafond de capital */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Permet d'afficher le statut de l'entreprise */
	public void afficherStatut(){
		
	}
	
}
