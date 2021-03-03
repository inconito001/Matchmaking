package helha.matchmaking.be;

import helha.matchmaking.be.data.Player;
import helha.matchmaking.be.manager.GameManager;
import helha.matchmaking.be.view.View;

public class Program {
	
	public static void main(String... args) {
		//Cr�ation de la partie visuelle
		View view = new View();
		
		//On envoie le Titre du jeu
		view.sendTitle();
		
		//Cr�ation de l'espace m�moire pour accueillir 10 objets "Player"
		Player[] players = new Player[100];
		
		//Attribution � chaque emplacement dans le tableau "players"
		//Un nouveau Player pour chaque emplacement disponible.
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
	
		//Cr�ation d'un model permettant de g�rer le matchmaking.
		GameManager game = new GameManager(players);
		
		//On v�rifie avant tout le niveau de chaque joueur.
		game.checkPlayerLevel();
		
		//Ensuite, on les classes selon leur facteur de confiance.
		game.splitByTrustFactor();
		
		game.simulate();
	}
}
