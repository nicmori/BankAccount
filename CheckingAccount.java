
public class CheckingAccount implements IBankAccount {

	private float balance;
	private int accountNumber;
	
	static int accountCount;
	
	public CheckingAccount() {
		balance = 0;
		accountNumber = 1 + accountCount;
		accountCount += 1;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void print_status() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account type: Checking");
		System.out.println("Balance: " + balance);
	}


}
