
public class HumanTest {

	public static void main(String[] args) {
		Human human1=new Human("tqriq");
		Human human2=new Human("kitane");
		Wizard wizard1=new Wizard("hasan");
		Ninja ninja1=new Ninja("jack");
		System.out.println(human1.getHealth());
		wizard1.heal(human1);
		System.out.println(human1.getHealth());
		
		System.out.println(human2.getHealth());
		wizard1.fireball(human2);
		System.out.println(human2.getHealth());

		System.out.println(human1.getHealth());
		ninja1.steal(human1);
		System.out.println(human1.getHealth());
		System.out.println(ninja1.getHealth());
		ninja1.runAway();
		System.out.println(ninja1.getHealth());
		
		Samurai samurai1=new Samurai("jack");
		Samurai samurai2=new Samurai("tala");
		Samurai samurai3=new Samurai("oli");
		Samurai samurai4=new Samurai("wood");
		
		System.out.println(Samurai.count);

	}

}
