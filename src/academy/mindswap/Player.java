package academy.mindswap;

public class Player {


	Monster[] monsters;

	public int attack(){
		Monster m = pickMonster();

		return m.attack();
	}

	public void defend(int amount){
		Monster m = pickMonster();
		m.defend(amount);

	}
}
