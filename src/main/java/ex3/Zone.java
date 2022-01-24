package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.animal.Animal;

public class Zone {
	
	private String nom;
	private List<Animal> animaux;
	private double consommation;
	
	public Zone(String nom, double consommation) {
		super();
		this.nom = nom;
		this.consommation = consommation;
		this.animaux = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal.getNom());
		}
	}
	
	public double calculercalculerKgsNourritureParJour() {
		return this.animaux.size() * this.consommation;
	}
	
	public int compterAnimaux() {
		return animaux.size();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Animal> getAnimaux() {
		return animaux;
	}
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	

}
