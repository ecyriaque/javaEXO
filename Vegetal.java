package TP1_EXO3;

/**
 * classe héritée de EtreVivant représentant un végétal
 * NB : identique à EtreVivant mais comportement des végétaux à définir en cas d'évolution du programme
 * @author miot
 */
public class Vegetal extends EtreVivant {
	
	/**
	 * constructeur
	 * @param comestible ou pas (true ou false)
	 */
	public Vegetal(boolean comestible) {
		super(comestible);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Vegetal [" + super.toString() + "]";
	}
	
}
