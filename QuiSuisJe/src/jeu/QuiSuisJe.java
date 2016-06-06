package jeu;

import controleur.Controleur;

public class QuiSuisJe {

	public static void main(String[] args) {
		
		Controleur c = new Controleur();
		c.jouer();
		
		// Question 3 : créer une instance de joueur et l'afficher
		//Joueur j1 = new Joueur();
		//System.out.println(j1);
		
		// notre usage simplifié de fenêtres de dialogues nécessite de forcer l'arrêt complet du programme,
		// même une fois que la méthode main est "terminée".
		System.exit(0);
	}

}
