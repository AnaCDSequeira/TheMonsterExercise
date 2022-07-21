package academy.mindswap;

public abstract class Monster {

	private int healthPoints;
	private final int POWER_ATTACK;

	public Monster(int healthPoints, int powerAttack) {
		this.healthPoints = healthPoints;
		this.POWER_ATTACK = powerAttack;
	}

	public int attack() {
		if(isDead()){
			System.out.println("cant play");
			return 0;
		}  //true
		return POWER_ATTACK;
	}

	public int getHealthPoints() {
		return healthPoints;
	}


	public void defend (int powerAttack) {
		if (isDead()) {
			System.out.println("Your monster is dead.");
			return;
		}
		healthPoints -= powerAttack;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public boolean isDead() {
		if (healthPoints <= 0) {
			return true;
		}
		return false;
	}
}
