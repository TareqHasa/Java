import java.util.Random;
public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	private static int numberOfAccounts=0;
	private static double ammountOfMoney=0;
	
	private String randomNumber() {
		String number = new String();
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int r=rand.nextInt(10);
			number+=r;	
		}
		return number;
	}
	
	public BankAccount() {
		this.accountNumber=randomNumber();
		this.checkingBalance=0;
		this.savingBalance=0;
		BankAccount.numberOfAccounts++;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public static double getAmmountOfMoney() {
		return ammountOfMoney;
	}
	
	public void dposit(String name,int money) {
		if (name=="checking") {
			this.checkingBalance= getCheckingBalance()+money;
			System.out.println(getAccountNumber()+" deposited by "+ money+" in Checking Balanc");
			ammountOfMoney+=money;
		} else if (name == "saving") {
			this.savingBalance=getSavingBalance()+money;
			System.out.println(getAccountNumber()+" deposited by "+ money+" in Saving Balanc");
			ammountOfMoney+=money;
		}else {
			System.out.println("you have two option 'saving' or 'checking'");
		}
		
	}
	
	public void withdraw(String name,int money) {
		if (name=="checking") {
			if (this.getCheckingBalance()>money) {
				this.checkingBalance= this.getCheckingBalance()-money;
				System.out.println(getAccountNumber()+" withdarw  "+ money+" from chiking balance");
				ammountOfMoney-=money;
			}else {
				System.out.println("none sufficient fund");
			}		
		}else if (name=="saving") {
			if (this.getSavingBalance()>money) {
				this.checkingBalance= this.getSavingBalance()-money;
				System.out.println(getAccountNumber()+" withdarw  "+ money+" from saving balanc");
				ammountOfMoney-=money;
			}else {
				System.out.println("none sufficient fund");
			}
		}
		
	} 
	

}
