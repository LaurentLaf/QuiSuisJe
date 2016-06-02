package jeu;

public class Joueur {

	// Les constantes statiques correspondant aux points du jeu
	private static final int TROUVE_ID = 10;
	private static final int COUT_ESSAI = 1;
	private static final int SCORE_INIT = 30;
	private static final int GAIN_PARTIE = 10;
	// Les attributs d'un joueur

	//Constructeur affectant une identit� au joueur

	//Accesseurs, il n'y a pas besoin de mutateur car seule Joueur manipule ses attributs.

	/**
	 * Ajoute les points associ�s � une d�couverte de sa propre identit�
	 * et affecte une nouvelle identit� au joueur
	 */
	private void gererIdTrouvee() {
		// TODO
	}

	/**
	 * Compter une tentative r�t�e de d�couverte de sa propre identit�
	 */
	private void compterTentative() {
		// TODO
	}

	/**
	 * m�thode bool�enne mettant � jour le score apr�s une proposition du joueur et retournant si
	 * cette proposition �tait bonne ou non.
	 * @param proposition contient un nom de personnage propos� par le joueur
	 * @return si la proposition du joueur correspond � son identit�.
	 */
	public boolean isIdentiteTrouve(String proposition) {
		boolean rep=false;
		// TODO
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a gagn� ou non
	 */
	public boolean isGagnant() {
		boolean rep=false;
		// TODO
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a perdu ou non
	 */
	public boolean isPerdant() {
		boolean rep=true;
		// TODO
		return rep;
	}

}
