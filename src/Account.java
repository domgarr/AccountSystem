
public class Account implements Comparable<Account> {
	public static Account[] accounts = new Account[20];
	
	
	private String  accountNumber;
	private String accountHolder;
	private String accountType;
	private double balance;
	
	public enum AccountType {CHECKINGS, SAVINGS}
	
	public Account() {
		this.balance = 0;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance <= 0  ){
			throw new IllegalArgumentException();
		}
		this.balance += balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) throws IllegalArgumentException {
		if(accountNumber.length() < 10){
			throw new IllegalArgumentException();
		}
		 this.accountNumber = accountNumber;
	}

	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account account) {
		
		if(account.getAccountHolder() == null || this.accountHolder == null){
			return 1;
		}
		if(this.accountHolder.compareTo(account.accountHolder) > 0)
			return 1;
		else 
			return -1;
	}
	
	
	
	
	
	
	
	
	
	
}
