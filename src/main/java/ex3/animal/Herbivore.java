package ex3.animal;

public interface Herbivore {
	default String getComportement() {
		return "HERBIVORE";
	}
}
