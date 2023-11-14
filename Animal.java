package TP1_EXO3;
/**
 * classe héritée de EtreVivant représentant un animal
 * @author miot
 */
public class Animal extends EtreVivant {
	private TypeAnimal animal;
	private Sexe sexe;
	private int age;
	private int taille;
	private int poids;

	
	/**
	 * constructeur simple nécessaire au fonctionnement actuel du programme
	 * @param animal => voir classe TypeAnimal pour avoir la liste des animaux
	 * @param comestible ou pas (true ou false)
	 */
	public Animal(TypeAnimal animal, boolean comestible) {
		super(comestible);
		this.animal = animal;
	}
	
	/**
	 * constructeur complet avec sexe, âge, taille et poids en plus
	 * @param animal => voir classe TypeAnimal pour avoir la liste des animaux
	 * @param comestible ou pas (true ou false)
	 * @param sexe
	 * @param age
	 * @param taille
	 * @param poids
	 */
	public Animal(TypeAnimal animal, boolean comestible, Sexe sexe, int age, int taille, int poids) {
		this(animal, comestible);
		this.sexe = sexe;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}
	
	/**
	 * vérifie la compatibilité et la comestibilité de la nourriture puis la tue
	 * exception si la nourriture ne correspond pas à l'alimentation de l'animal
	 * @param nourriture (animale ou végétale)
	 * @throws IllegalMangerException
	 */
	public void manger(EtreVivant nourriture) throws IllegalMangerException {
		
		// vérification des modalités d'alimentation
		switch(this.animal.alimentation) {
		
			case CARNIVORE:
				if (nourriture instanceof Vegetal) {
					throw new IllegalMangerException("Un carnivore ne mange pas de végétaux !");
				}
				if (! nourriture.vivant) {
					throw new IllegalMangerException("Un carnivore ne mange pas d'animaux morts !");
				}
				break;
			
			case CHAROGNARD:
				if (nourriture instanceof Vegetal) {
					throw new IllegalMangerException("Un charognard ne mange pas de végétaux !");
				}
				if (nourriture.vivant) {
					throw new IllegalMangerException("Un charognard ne mange pas d'animaux vivants !");
				}
				break;
				
			case HERBIVORE:
				if (nourriture instanceof Animal) {
					throw new IllegalMangerException("Un herbivore ne mange pas d'animaux !");
				}
				break;
				
			case OMNIVORE:
				if ((nourriture instanceof Animal) && (! nourriture.vivant)) {
					throw new IllegalMangerException("Un omnivore ne mange pas d'animaux morts !");
				}
				break;
		}
		
		// si nourriture non comestible => contamination (empoisonnement)
		if (! nourriture.comestible) {
			this.setComestible(false);
		}
		
		nourriture.mourir();
	}
	
	// ======================== GETTERS ========================
	
	/**
	 * getter
	 * @return animal
	 */
	public TypeAnimal getAnimal() {
		return this.animal;
	}

	/**
	 * getter
	 * @return sexe
	 */
	public Sexe getSexe() {
		return this.sexe;
	}

	/**
	 * getter
	 * @return âge
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * getter
	 * @return taille
	 */
	public int getTaille() {
		return this.taille;
	}

	/**
	 * getter
	 * @return poids
	 */
	public int getPoids() {
		return this.poids;
	}

	// ======================== SETTERS ========================
	
	/**
	 * setter
	 * @param animal
	 */
	public void setAnimal(TypeAnimal animal) {
		this.animal = animal;
	}

	/**
	 * setter
	 * @param sexe
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	/**
	 * setter
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * setter
	 * @param taille
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	
	/**
	 * setter
	 * @param poids
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}
	// =========================================================
	
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Animal ["
				+ super.toString()
				+ ", typeAnimal=" + this.animal
				+ ", Alimentation=" + this.animal.alimentation
				+ ", sexe=" + this.sexe 
				+ ", age=" + this.age 
				+ ", taille=" + this.taille 
				+ ", poids=" + this.poids 
				+ "]";
	}
	
}
