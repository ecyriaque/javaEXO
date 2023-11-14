package TP1_EXO3;

import java.util.HashMap;

/**
 * classe représentant un écosytème avec des animaux et des végétaux
 * @author miot
 */
public class Ecosystem {
	private int id;
	private String nom;
	private HashMap<Integer, EtreVivant> etresVivants;
	
	private static int nextId = 0;

	/**
	 * constructeur
	 * @param nom donné à l'écosystème
	 */
	public Ecosystem(String nom) {
		this.id = ++nextId;
		this.nom = nom;
		this.etresVivants = new HashMap<Integer, EtreVivant>();
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
	 * ajoute un être vivant à l'écosystème
	 * @param etreVivant (animal ou végétal) à ajouter à l'écosytème
	 */
	public void ajouterEtreVivant(EtreVivant etreVivant) {
		this.etresVivants.put(etreVivant.getId(), etreVivant);
	}
	
	/**
	 * retire un être vivant de l'écosystème
	 * @param etreVivant (animal ou végétal) à retirer de l'écosytème
	 */
	public void removeEtreVivant(EtreVivant etreVivant) {
		this.etresVivants.remove(etreVivant.getId(), etreVivant);
	}
	
	/**
	 * trouve un être vivant associé à un id
	 * @param idEtreVivant (numéro de ID)
	 * @return être vivant correspondant à l'id
	 */
	public EtreVivant findEtreVivant(int idEtreVivant) {
		return this.etresVivants.get(idEtreVivant);
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
	 * getter
	 * @return liste des êtres vivants de l'écosystème
	 */
	public HashMap<Integer, EtreVivant> getEtresVivants() {
		return this.etresVivants;
	}
	
	// =========================================================

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Ecosystem ["
				+ "id=" + this.id 
				+ ", nom=" + this.nom 
				+ ", etresVivants=" + this.etresVivants 
				+ "]";
	}
	
}
