package jeu;

import utile.Personnage;

public class Joueur {

	// Les constantes statiques correspondant aux points du jeu
	private static final int TROUVE_ID = 10;
	private static final int COUT_ESSAI = 1;
	private static final int SCORE_INIT = 30;
	private static final int GAIN_PARTIE = 10;
	private static final int PERTE_PARTIE = 0;
	// Les attributs d'un joueur
	private String identite = "";
	private int score;
	
	//Constructeur affectant une identit� au joueur
	public Joueur() {
		this.identite = setNouvelleIdentite();
		this.score = initScore();
	}
	
	//Accesseurs, il n'y a pas besoin de mutateur car seule Joueur manipule ses attributs.
	public String getIdentite() {
		return identite;
	}
	public int getScore() {
		return score;
	}
	

	/**
	 * Ajoute les points associ�s � une d�couverte de sa propre identit�
	 * et affecte une nouvelle identit� au joueur
	 */
	public void gererIdTrouvee() {
		this.score += TROUVE_ID;
		this.identite = setNouvelleIdentite();
	}


	/**
	 * Compter une tentative r�t�e de d�couverte de sa propre identit�
	 */
	public void compterTentative() {
		this.score -= COUT_ESSAI;
	}

	/**
	 * m�thode bool�enne mettant � jour le score apr�s une proposition du joueur et retournant si
	 * cette proposition �tait bonne ou non.
	 * @param proposition contient un nom de personnage propos� par le joueur
	 * @return si la proposition du joueur correspond � son identit�.
	 */
	public boolean isIdentiteTrouve(String proposition) {
		boolean rep=false;
		if (this.identite.equals(proposition)) {
			gererIdTrouvee();
			rep = true;
		}
		else {
			compterTentative();
		}
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a gagn� ou non
	 */
	public boolean isGagnant() {
		boolean rep=false;
		if (this.score == GAIN_PARTIE) {
			rep = true;
		}
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a perdu ou non
	 */
	public boolean isPerdant() {
		boolean rep=true;
		if (this.score == PERTE_PARTIE) {
			rep = true;
		}
		return rep;
	}
	
	//D�finition des m�thodes diverses
	/*
	 * fonction pour d�finir l'identit� du joueur
	 */
	public String setNouvelleIdentite() {
		return Personnage.donnerPerso();
	}
	/*
	 * Fonction d'initialisation du score d'un joueur
	 */
	private int initScore() {
		return Joueur.SCORE_INIT;
	}

	
	/*
	 * R��criture de la m�thode ToString()
	 */
	@Override
	public String toString() {
		return "Joueur [identite=" + identite + ", score=" + score + "]";
	}
	
}
