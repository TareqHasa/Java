
public class Samurai extends Human {
	public static int count=0;
	public Samurai() {
		this.health=200;
		count++;
	}
	public Samurai(String name) {
		this.name=name;
		this.health=200;
		count++;
	}
	
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth()/2);
		this.setHealth(this.health/2);
		
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()*(1+(1/2)));
	}
	
	public static int howMany() {
		return count;
	}
}
