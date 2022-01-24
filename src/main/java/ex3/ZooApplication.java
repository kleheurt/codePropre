package ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Zone aquarium = new Zone("Aquarium", .2);
		Zone fermeReptile = new Zone("Ferme Reptile", .1);
		Zone savane = new Zone("Savane Africaine", 10);
		Zone carnivore = new Zone("Carnivore",10);
		
		savane.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		savane.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		savane.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		savane.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		aquarium.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		aquarium.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		fermeReptile.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		fermeReptile.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));
		
		Zone[] zones = {aquarium, fermeReptile, savane, carnivore};
		zoo.setZones(new ArrayList<Zone>(Arrays.asList(zones)));
		
		zoo.afficherListeAnimaux();
	}

}
