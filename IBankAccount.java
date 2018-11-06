
public interface IBankAccount {

	
	public int get_account_number();
	public float get_balance();
	public boolean deposit(float amount);
	public boolean withdraw(float amount);
	public void advance_time(int months);
	public void print_status();
	
}
