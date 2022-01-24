package ex3.animal.comportement;

public interface Herbivore {
	default String getComportement() {
		return "HERBIVORE";
	}
}
