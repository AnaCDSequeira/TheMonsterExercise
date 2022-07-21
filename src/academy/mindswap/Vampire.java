package academy.mindswap;

public class Vampire extends Monster{



	public Vampire() {
		super(100, 40);
	}

	@Override
	public int attack() {
		if (!isDead()) {
			if (bite()) {
				setHealthPoints(getHealthPoints() + 2);
				//System.out.println(getHealthPoints());
			}
			return super.attack();
		}
		return 0;
	}

	public boolean bite() {
		return Math.random() <= 0.2;
	}


}
