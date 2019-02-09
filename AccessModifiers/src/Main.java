
public class Main {

	public static void main(String[] args) {
		Account newAccount = new Account("New1");
		newAccount.deposit(1000);
		newAccount.withdraw(500);
		newAccount.withdraw(-200);
		newAccount.deposit(-20);
		newAccount.calculateBalance();

	}

}
