package helha.matchmaking.be.manager;

import java.util.ArrayList;
import java.util.List;

import helha.matchmaking.be.data.Player;

public class GameManager {
	
	private Player[] players;
	
	private List<Player> trusted;
	private List<Player> unTrusted;
	
	private List<Player> level_0;
	private List<Player> level_1;
	private List<Player> level_2;
	 

	public GameManager(Player[] players) {
		this.players = players;
		
		this.trusted = new ArrayList<Player>();
		this.unTrusted = new ArrayList<Player>();
		
		this.level_0 = new ArrayList<>();
		this.level_1 = new ArrayList<>();
		this.level_2 = new ArrayList<>();
	}

	public void splitByTrustFactor() {
		level_0.forEach((player) -> {if(player.isTrustFactor()) trusted.add(player); else unTrusted.add(player);});
		level_1.forEach((player) -> {if(player.isTrustFactor()) trusted.add(player); else unTrusted.add(player);});
		level_2.forEach((player) -> {if(player.isTrustFactor()) trusted.add(player); else unTrusted.add(player);});
		
		System.out.println("[Game] Player Trust factor checked!");
	}
	
	public void checkPlayerLevel() {
		for (Player player : players) {
			switch (player.getLevel()) {
			case 0:
				level_0.add(player);
				break;
			case 1:
				level_1.add(player);
				break;
			case 2:
				level_2.add(player);
				break;
			}
		}
		
		System.out.println("[Game] Player level checked!");
	}
	
	public void simulate() throws IndexOutOfBoundsException {
		System.out.println("Total Players = " + players.length);
		
		System.out.println("LEVEL_0_PLAYERS_SIZE = " + level_0.size());
		for (int i = 0; i < level_0.size(); i++) {
			Player player = level_0.get(i);
			
			if ((i + 2) > level_0.size()) continue;
			
			Player target = level_0.get(i + 1);
			
			if (i % 2 != 0) {
				continue;
			}

			if (player.isTrustFactor()) {
				if (target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			} else {
				if (!target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			}
		}
		

		System.out.println("LEVEL_1_PLAYERS_SIZE = " + level_1.size());
		
		for (int i = 0; i < level_1.size(); i++) {
			Player player = level_1.get(i);
			
			if ((i + 2) > level_1.size()) continue;
			
			Player target = level_1.get(i + 1);
			
			if (i % 2 != 0) {
				continue;
			}

			if (player.isTrustFactor()) {
				if (target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			} else {
				if (!target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			}
		}

		System.out.println("LEVEL_2_PLAYERS_SIZE = " + level_2.size());
		
		for (int i = 0; i < level_2.size(); i++) {
			Player player = level_2.get(i);
			
			if ((i + 2) > level_2.size()) continue;
			
			Player target = level_2.get(i + 1);
			
			if (i % 2 != 0) {
				continue;
			}

			if (player.isTrustFactor()) {
				if (target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			} else {
				if (!target.isTrustFactor()) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(player.getName() + " VS " + target.getName());
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					player.getStatistics();
					target.getStatistics();
				}
			}
		}
	}
	
	public Player[] getPlayers() {
		return this.players;
	}

	public List<Player> getPlayersLevel_0() {
		return this.level_0;
	}

	public List<Player> getPlayersLevel_1() {
		return this.level_1;
	}

	public List<Player> getPlayersLevel_2() {
		return this.level_2;
	}

	public List<Player> getTrustedPlayers() {
		return this.trusted;
	}

	public List<Player> getUnTrustedPlayers() {
		return this.unTrusted;
	}
}
