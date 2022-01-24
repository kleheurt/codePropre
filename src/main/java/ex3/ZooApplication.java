package ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Zone aquarium = new Zone("Aquarium");
		Zone fermeReptile = new Zone("Ferme Reptile");
		Zone savane = new Zone("Savane Africaine");
		Zone carnivore = new Zone("Carnivore");
		
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
	}

}
