package ex3.animal.comportement;

public interface Carnivore {
	
	default String getComportement(){
		return "CARNIVORE";
	}

}
