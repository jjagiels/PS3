package ps3;

public class Test {
	public static void main (String[] args) throws InsufficientFundsException{
		Account account1 = new Account(1122, 20000, 4.5);
		
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.printf("Your balance is: %1.2f", account1.getBalance());
		System.out.printf("%nYour monthly interest is: %1.1f%%", account1.getMonthlyInterestRate());
		System.out.printf("%nYour account was created at: %s", account1.getDateCreated());
		System.out.printf("%n------------------------------------");
		
		
		Account account2 = new Account(48481, 5000, 10.0);
		
		try{
			account2.withdraw(5100);
		}
		catch(InsufficientFundsException except){
			System.out.println("You don't have enough funds to withdraw that amount.");
			except.printStackTrace();
		}
	}
	

}
