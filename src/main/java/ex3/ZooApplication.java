package ex3;

import java.util.ArrayList;
import java.util.Arrays;

import ex3.animal.espece.Boa;
import ex3.animal.espece.Gazelle;
import ex3.animal.espece.Requin;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Zone aquarium = new Zone("Aquarium", .2);
		Zone fermeReptile = new Zone("Ferme Reptile", .1);
		Zone savane = new Zone("Savane Africaine", 10);
		Zone carnivore = new Zone("Carnivore",10);
		
		savane.addAnimal(new Gazelle());
		savane.addAnimal(new Gazelle());
		savane.addAnimal(new Gazelle());
		savane.addAnimal(new Gazelle());
		aquarium.addAnimal(new Requin());
		aquarium.addAnimal(new Requin());
		fermeReptile.addAnimal(new Boa());
		fermeReptile.addAnimal(new Boa());
		
		Zone[] zones = {aquarium, fermeReptile, savane, carnivore};
		zoo.setZones(new ArrayList<Zone>(Arrays.asList(zones)));
		
		zoo.afficherListeAnimaux();
	}

}
