package ex3.animal.espece;

import ex3.animal.Animal;
import ex3.animal.comportement.Herbivore;
import ex3.animal.type.Mammifere;

public class Gazelle extends Animal implements Mammifere, Herbivore {

	public Gazelle() {
		super("Gazelle");
	}

}
