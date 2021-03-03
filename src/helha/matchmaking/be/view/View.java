package helha.matchmaking.be.view;

import helha.matchmaking.be.data.Player;
import helha.matchmaking.be.manager.GameManager;

public class View {
	
	public void sendTitle() {
		System.out.println("-----------------------------");
		System.out.println("        MatchMaking");
		System.out.println("-----------------------------");
	}
	
	public void sendPlayers(GameManager game) {
		for (Player player : game.getPlayers()) {
			System.out.println("====================================================");
			System.out.println("Name= " + player.getName());
			System.out.println("TrustFactor= " + player.isTrustFactor());
			System.out.println("Kills= " + player.getKills());
			System.out.println("Deaths= " + player.getDeaths());
			System.out.println("Ratio= " + player.getRatio());
			System.out.println("====================================================");
		}
	}

}
