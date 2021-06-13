
public class Wizard extends Human {
	public Wizard() {
		this.health=50;
		this.intelligence=8;
	}
	public Wizard(String name) {
		this.name=name;
		this.health=50;
		this.intelligence=8;
	}
	
	public void heal(Human human) {
		human.setHealth(human.getHealth()+this.intelligence);
		System.out.printf("%s heald %s by %d the hp now  ",getName(),human.getName(),intelligence );
	}
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(this.intelligence*3));
		System.out.println(this.name+" damaged "+human.getName()+" by "+this.intelligence*3);
	}
	}

