package TP1_EXO3;

/**
 * Classe abstraite EtreVivant améliorée pour une gestion robuste des êtres vivants dans l'écosystème.
 * Modifications principales :
 * 1. Introduction d'un système d'ID uniques pour chaque instance, assurant une identification distincte.
 * 2. Simplification du constructeur pour une initialisation cohérente et automatique des attributs essentiels.
 * 3. Ajout de méthodes pour la gestion de l'état de vie (mourir, estVivant), renforçant la logique d'état.
 * Ces changements visent à renforcer l'intégrité des données et la clarté du code pour les êtres vivants.
 */

public abstract class EtreVivant {
    private static int dernierId = 0; // Compteur pour générer des ID uniques
    private int id;
    protected boolean vivant;
    protected boolean comestible;

    /**
     * Constructeur de EtreVivant.
     * Initialise un être vivant avec un ID unique et le marque comme vivant.
     */
    public EtreVivant() {
        this.id = genererIdUnique();
        this.vivant = true;
        this.comestible = true; // Par défaut, considéré comme comestible
    }

    /**
     * Génère un ID unique pour chaque être vivant.
     * @return Un ID entier unique.
     */
    private synchronized int genererIdUnique() {
        return ++dernierId;
    }

	
	/**
	 * bascule à l'état de mort
	 */
	public void mourir() {
		this.setVivant(false);
	}
	
	// ======================== GETTERS ========================
	
	/**
	 * getter
	 * @return id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * getter
	 * @return si l'être vivant est vivant ou pas
	 */
	public boolean isVivant() {
		return this.vivant;
	}

	/**
	 * getter
	 * @return si l'animal est comestible ou pas
	 */
	public boolean isComestible() {
		return this.comestible;
	}

	// ======================== SETTERS ========================
	
	/**
	 * setter
	 * @param vivant
	 */
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	
	/**
	 * setter
	 * @param comestible
	 */
	public void setComestible(boolean comestible) {
		this.comestible = comestible;
	}
	
	// =========================================================

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "id=" + this.id + "vivant=" + this.vivant + ", comestible=" + this.comestible;
	}
	
}
