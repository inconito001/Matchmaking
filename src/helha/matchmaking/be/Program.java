package helha.matchmaking.be;

import helha.matchmaking.be.data.Player;
import helha.matchmaking.be.manager.GameManager;
import helha.matchmaking.be.view.View;

public class Program {
	
	public static void main(String... args) {
		//Création de la partie visuelle
		View view = new View();
		
		//On envoie le Titre du jeu
		view.sendTitle();
		
		//Création de l'espace mémoire pour accueillir 10 objets "Player"
		Player[] players = new Player[100];
		
		//Attribution à chaque emplacement dans le tableau "players"
		//Un nouveau Player pour chaque emplacement disponible.
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
	
		//Création d'un model permettant de gérer le matchmaking.
		GameManager game = new GameManager(players);
		
		//On vérifie avant tout le niveau de chaque joueur.
		game.checkPlayerLevel();
		
		//Ensuite, on les classes selon leur facteur de confiance.
		game.splitByTrustFactor();
		
		game.simulate();
	}
}
