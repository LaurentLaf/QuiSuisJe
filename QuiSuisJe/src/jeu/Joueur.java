package jeu;

public class Joueur {

	// Les constantes statiques correspondant aux points du jeu
	private static final int TROUVE_ID = 10;
	private static final int COUT_ESSAI = 1;
	private static final int SCORE_INIT = 30;
	private static final int GAIN_PARTIE = 10;
	// Les attributs d'un joueur

	//Constructeur affectant une identité au joueur

	//Accesseurs, il n'y a pas besoin de mutateur car seule Joueur manipule ses attributs.

	/**
	 * Ajoute les points associés à une découverte de sa propre identité
	 * et affecte une nouvelle identité au joueur
	 */
	private void gererIdTrouvee() {
		// TODO
	}

	/**
	 * Compter une tentative râtée de découverte de sa propre identité
	 */
	private void compterTentative() {
		// TODO
	}

	/**
	 * méthode booléenne mettant à jour le score après une proposition du joueur et retournant si
	 * cette proposition était bonne ou non.
	 * @param proposition contient un nom de personnage proposé par le joueur
	 * @return si la proposition du joueur correspond à son identité.
	 */
	public boolean isIdentiteTrouve(String proposition) {
		boolean rep=false;
		// TODO
		return rep;
	}

	/**
	 * fonction booléenne liée au score
	 * @return si le joueur a gagné ou non
	 */
	public boolean isGagnant() {
		boolean rep=false;
		// TODO
		return rep;
	}

	/**
	 * fonction booléenne liée au score
	 * @return si le joueur a perdu ou non
	 */
	public boolean isPerdant() {
		boolean rep=true;
		// TODO
		return rep;
	}

}
