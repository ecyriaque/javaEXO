package TP1_EXO3;

/**
 * énumération d'animaux avec leur alimentation associée
 * @author miot
 */
public enum TypeAnimal {
	
	BICHE(Alimentation.HERBIVORE),
	CORBEAU(Alimentation.CHAROGNARD),
	LOUP(Alimentation.CARNIVORE),
	OURS(Alimentation.OMNIVORE);
	
	public Alimentation alimentation;
	
	/**
	 * constructeur associant un animal avec son alimentation
	 * @param alimentation => voir classe Alimentation pour avoir la liste des alimentations possibles d'un animal
	 */
	private TypeAnimal(Alimentation alimentation) {
		this.alimentation = alimentation;
	}
	
}
