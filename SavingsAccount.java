
public class SavingsAccount implements IBankAccount {

	private float balance;
	private int accountNumber;
	
	static int accountCount;

	private float interestRate;
	
	public SavingsAccount (float interest_rate) {
		balance = 0;
		accountNumber = 1 + accountCount;
		accountCount += 1;
		
		interestRate = interest_rate;
	}

	@Override
	public int get_account_number() {
		return accountNumber;
	}

	@Override
	public float get_balance() {
		return balance;
	}

	@Override
	public boolean deposit(float amount) {
		if (amount > 0){
			balance += amount;
			return true;
		} else {
			System.out.println("Deposit cancelled.");
			return false;
		}
	}

	@Override
	public boolean withdraw(float amount) {
		if (amount < balance) {
			balance = balance - amount;
			return true;
		} else {
			System.out.println("Withdrawal cancelled.");
			return false;
		}
	}

	@Override
	public void advance_time(int months) {
		
		double iRate = interestRate;
		double rated = 1 + ((iRate/100)/12);
		double power = Math.pow(rated, months);
		balance = (float) (balance * power);
				
	}

	@Override
	public void print_status() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account type: Savings");
		System.out.println("Balance: " + balance);
		System.out.println("Interest rate: 0.05");

	}

}
