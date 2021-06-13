
public class Ninja extends Human {
	protected int stealth;
	public Ninja() {
		this.stealth=10;
	}
	public Ninja(String name) {
		this.name=name;
		this.stealth=10;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public void steal(Human human) {
		human.setHealth(human.getHealth()-this.stealth);
		this.setHealth(this.health+this.stealth);
	}
	public void runAway() {
		this.setHealth(getHealth()-10);
	}
}
