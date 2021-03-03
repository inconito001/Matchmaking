package helha.matchmaking.be.data;

import java.util.Random;
import java.util.UUID;

import lombok.Data;

@Data
public class Player {
	
	private Random random;
	
    private String name;

    private boolean trustFactor;

	private int level;

	private int kills;

	private int deaths;
	private int ratio;

	public Player() {
		this.name = "Player_" + UUID.randomUUID();
		this.random = new Random();
		this.trustFactor = random.nextBoolean();
		
		this.level = random.nextInt(3);
		this.kills = random.nextInt(100) + 1;
		this.deaths = random.nextInt(100) + 1;
		
		this.ratio = this.kills / this.deaths;
	}
	
	public void getStatistics() {
		System.out.println("====================================================");
		System.out.println("Name= " + this.getName());
		System.out.println("TrustFactor= " + this.isTrustFactor());
		System.out.println("Level= " + this.getLevel());
		System.out.println("Kills= " + this.getKills());
		System.out.println("Deaths= " + this.getDeaths());
		System.out.println("Ratio= " + this.getRatio());
		System.out.println("====================================================");
	}
}