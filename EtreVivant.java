package TP1_EXO3;

/**
 * classe abstraite représentant un être vivant (animal ou végétal)
 * @author miot
 */
public abstract class EtreVivant {
	private int id;
	protected boolean vivant;
	protected boolean comestible;
	
	private static int nextId = 0;
	
	/**
	 * constructeur
	 * @param comestible => true ou false pour indiquer si l'être vivant (animal ou végétal) est comestible ou non
	 */
	public EtreVivant(boolean comestible) {
		this.id = ++nextId;
		this.vivant = true;
		this.comestible = comestible;
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
