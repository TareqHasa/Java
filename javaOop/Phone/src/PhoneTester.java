
public class PhoneTester {

	public static void main(String[] args) {
		Galaxy galaxyS9= new Galaxy("S9", 100, "Verizon", "Ring Ring Ring");
		IPhone iPhoneX=new IPhone("X", 100, "AT&T", "Zing");
	
			galaxyS9.displayInfo();
			System.out.println(galaxyS9.ring());
			System.out.println(galaxyS9.unlock());
			
			iPhoneX.displayInfo();
			System.out.println(iPhoneX.ring());
			System.out.println(iPhoneX.unlock());
	}

}
