package academy.mindswap;

public class Mummy extends Monster{

	private int acc =0;
	public Mummy() {
		super(100,10);
	}
	@Override
	public int attack() {
		if (!isDead()) {
			acc++;
			if (acc == 3){
				unroll();
				System.out.println("ROLING ROLING ROLING YEHHH "+ getHealthPoints());
				return 0;
			}
		}
		return super.attack();
	}

	public void unroll() {
		acc = 0;
		setHealthPoints(getHealthPoints() - 10);
		}
	}

