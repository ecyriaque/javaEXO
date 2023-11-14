package TP1_EXO3;

/**
 * Classe représentant un végétal dans l'écosystème.
 * Hérite de la classe EtreVivant.
 */
public class Vegetal extends EtreVivant {
    private String nom;

    /**
     * Constructeur pour Vegetal.
     * @param nom Nom du végétal.
     */
    public Vegetal(String nom, int hauteur) {
        super();
        this.nom = nom;

    }

	/**
	 * toString
	 */
    @Override
    public String toString() {
        // Implémentation de la méthode toString pour afficher les informations du végétal.
        return "Vegetal{" +
               "nom='" + nom + '\'' +
               ", id=" + getId() +
               '}';
    }
	
}
