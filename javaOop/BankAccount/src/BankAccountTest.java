
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2= new BankAccount();
		
		account1.dposit("checking", 100);
		account1.dposit("saving", 100);
		System.out.println(account1.getCheckingBalance());
		System.out.println(BankAccount.getAmmountOfMoney());
	}

}
