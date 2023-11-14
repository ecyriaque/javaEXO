package TP1_EXO3;

/**
 * classe gérant les exceptions des animaux qui mangent
 * @author miot
 */
public class IllegalMangerException extends Exception {
	
	/**
	 * exception avec un texte pour l'utilisateur
	 * @param texte
	 */
	public IllegalMangerException(String texte) {
		super(texte);
	}
	
}
