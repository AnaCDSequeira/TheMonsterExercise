package academy.mindswap;

public class Main {
	public static void main(String[] args) {
		Werewolf w = new Werewolf();
		Vampire v = new Vampire();
		Mummy m = new Mummy();

//		System.out.println(w.attack());

	/*	w.defend(w.attack());
		System.out.println(w.getHealthPoints());*/

//		System.out.println(v.attack());

		System.out.println(m.getHealthPoints());
		m.defend(m.attack());
		System.out.println(m.getHealthPoints());
		m.defend(m.attack());
		System.out.println(m.getHealthPoints());
		m.defend(m.attack());


	}
}
