
public class Human {
	int strength;
	int stealth;
	int intelligence;
	int health ;
	public Human() {
		this.strength=3;
		this.stealth=3;
		this.intelligence=3;
		this.health=100;	
	}
	
	public  int attackHuman() {
		int result = health-strength;
		return result;
	}
}
