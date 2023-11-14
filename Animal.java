package TP1_EXO3;

/**
 * Classe Animal améliorée pour une meilleure gestion de l'alimentation et une plus grande clarté du code.
 * Modifications principales :
 * 1. Simplification de la méthode 'manger' pour une meilleure lisibilité et réduction de la redondance.
 * 2. Ajout de la méthode 'estNourritureCompatible' pour centraliser la logique de vérification de l'alimentation.
 * 3. Clarification du constructeur pour une initialisation explicite des attributs de l'animal.
 * Ces améliorations visent à rendre le code plus maintenable et extensible.
 */

public class Animal extends EtreVivant {
    private TypeAnimal typeAnimal;
    private Sexe sexe;
    private int age;
    private int taille;
    private int poids;

    /**
     * Constructeur pour Animal.
     * @param typeAnimal 
     * @param sexe 
     * @param age 
     * @param taille 
     * @param poids 
     */
    public Animal(TypeAnimal typeAnimal, Sexe sexe, int age, int taille, int poids) {
        super();
        this.typeAnimal = typeAnimal;
        this.sexe = sexe;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
    }

    /**
     * Fait manger l'animal. Vérifie si la nourriture est compatible.
     * @param nourriture L'être vivant à manger.
     * @throws IllegalMangerException Si la nourriture n'est pas compatible.
     */
    public void manger(EtreVivant nourriture) throws IllegalMangerException {
        if (!estNourritureCompatible(nourriture)) {
            throw new IllegalMangerException("Nourriture incompatible avec l'alimentation de l'animal.");
        }

        nourriture.mourir();
    }

    /**
     * Vérifie si la nourriture est compatible avec l'alimentation de l'animal.
     * @param nourriture La nourriture à vérifier.
     * @return true si compatible, false sinon.
     */
    private boolean estNourritureCompatible(EtreVivant nourriture) {
        switch (this.typeAnimal.getAlimentation()) {
            case CARNIVORE:
                return nourriture instanceof Animal && nourriture.isVivant();
            case CHAROGNARD:
                return nourriture instanceof Animal && !nourriture.isVivant();
            case HERBIVORE:
                return nourriture instanceof Vegetal;
            case OMNIVORE:
                return nourriture instanceof Animal || nourriture instanceof Vegetal;
            default:
                return false;
        }
    }
	
	// ======================== GETTERS ========================
	
	/**
	 * getter
	 * @return animal
	 */
	public TypeAnimal getAnimal() {
		return this.getAnimal();
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
		this.typeAnimal = animal;
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
				+ ", typeAnimal=" + this.typeAnimal
				+ ", Alimentation=" + this.typeAnimal.alimentation
				+ ", sexe=" + this.sexe 
				+ ", age=" + this.age 
				+ ", taille=" + this.taille 
				+ ", poids=" + this.poids 
				+ "]";
	}
	
}
