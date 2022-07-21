package academy.mindswap;

public class Game {

	Player p1;
	Player p2;

	public void play(){

		p1.defend(p2.attack());
		p2.defend(p1.attack());

	}
}
