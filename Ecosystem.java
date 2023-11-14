package TP1_EXO3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un écosystème.
 * Gère les interactions entre les différents êtres vivants (animaux et végétaux).
 */
public class Ecosystem {
	private int id;
	private String nom;
    private List<EtreVivant> etresVivants; // Liste pour stocker tous les êtres vivants de l'écosystème

    /**
     * Constructeur pour Ecosysteme.
     * Initialise la liste des êtres vivants.
     */
    public Ecosystem() {
        etresVivants = new ArrayList<>();
    }




	/**
	 * donne un être vivant à manger à un animal puis le fait disparaître
	 * @param animal qui mange
	 * @param etreVivant (animal ou végétal) qui est mangé
	 * @throws IllegalMangerException
	 */
	public void manger(Animal animal, EtreVivant etreVivant) throws IllegalMangerException {
		animal.manger(etreVivant);	
		this.removeEtreVivant(etreVivant); // un être vivant mangé disparaît de l'écosystème
	}
	
	// ======================== GESTION ÊTRES VIVANTS ========================
	
    /**
     * Ajoute un être vivant à l'écosystème.
     * @param etre L'être vivant à ajouter (Animal ou Vegetal).
     */
    public void ajouterEtreVivant(EtreVivant etre) {
        etresVivants.add(etre);
    }
	
	public void removeEtreVivant(EtreVivant etreVivant) {
		etresVivants.removeIf(e -> e.getId() == etreVivant.getId());
	}

	public EtreVivant findEtreVivant(int idEtreVivant) {
		for (EtreVivant etre : etresVivants) {
			if (etre.getId() == idEtreVivant) {
				return etre;
			}
		}
		return null;
	}

	/**
	 * affiche tous les être vivants de l'écosystème 
	 */
	public void showEtresVivants() {
		System.out.println(this.etresVivants);
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
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Getter pour obtenir la liste des êtres vivants de l'écosystème.
	 * Retourne une copie de la liste pour éviter la modification directe de la liste originale.
	 * @return Une copie de la liste des êtres vivants.
	 */
	public List<EtreVivant> getEtresVivants() {
	    return new ArrayList<>(this.etresVivants);
	}
	// =========================================================

    /**
     * Retourne une représentation textuelle de l'écosystème.
     * @return String représentant l'état actuel de l'écosystème.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ecosysteme{\n");
        for (EtreVivant etre : etresVivants) {
            sb.append(etre.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
	
}
