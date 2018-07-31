import java.util.Arrays;

public class AccountLogic {
	
	public static void createAccount(){
		Account newAccount = new Account();
		try{
			newAccount.setAccountNumber(IOHelper.ask("Please enter your account number: "));
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		try{
			newAccount.setAccountHolder(IOHelper.ask("Please enter your full name: "));
			
		}catch(Exception e){
			
		}
		
		try{
			newAccount.setAccountType(IOHelper.ask("Please enter the type of account you wish to open: (Checkings/Savings): "));
		}catch(Exception e){
			
		}
		
		try{
			newAccount.setBalance(Double.valueOf(IOHelper.ask("Please enter an initial deposit: ")));
		}catch(Exception e){
			
		}
		addAccount(newAccount);
	}
	
	public static void addAccount(Account newAccount){
		if(newAccount == null){
			return;
		}
		
		Account[] accRef = Account.accounts;
		
		for(int i = 0 ; i < accRef.length ; i++){
			if( accRef[i].getAccountNumber() == null){
				System.out.println("EHCK");
				accRef[i] = newAccount; 
				System.out.println("Account successfully created.");
				System.out.println(Arrays.toString(accRef));
				return;
			}
		}
	}
	
	public static void showAccounts(){
		Arrays.sort(Account.accounts);
		for(Account a : Account.accounts){
			if(a.getAccountHolder() != null){
				System.out.println(a.getAccountHolder());
			}
		}
	}
	
	public static void initilizeAccountArray(){
Account[] accRef = Account.accounts;
		
		for(int i = 0 ; i < accRef.length ; i++){
				accRef[i] = new Account(); 
			
		}
	}
	
	public static void viewAccountByNumber(){
		try{
			Account a = getAccountByNumber(IOHelper.ask("Insert an existing account number: "));
			System.out.println(a.toString());
		}catch(Exception e){
			
		}
	}
	
	public static Account getAccountByNumber(String accountNumber){
		for(Account a : Account.accounts){
			if(a.getAccountNumber().compareTo(accountNumber) == 0){
				return a;
			}
		}
		return null;
	}
	
	public static Account getAccountByHolderName(String holderName){
		for(Account a : Account.accounts){
			if(a.getAccountHolder().compareTo(holderName) == 0){
				return a;
			}
		}
		return null;
		}
	
	public static void viewAccountByHolderName(){
		try{
			Account a = getAccountByHolderName(IOHelper.ask("Insert an existing holder's name: "));
			System.out.println(a.toString());
		}catch(Exception e){
			
		}
	}

	public static void viewAccountsByType(){
		try{
			Account[] accs = getAccountsByType(IOHelper.ask("Insert the type of accounts you wish to see: "));
			System.out.println(Arrays.toString(accs));
		}catch(Exception e){
			
		}
		
	}
	
	public static Account[] getAccountsByType(String accountType){
		Account[] accs = new Account[20];
		int counter = 0;
		
		for(Account a : Account.accounts){
			if(a.getAccountType().compareTo(accountType) == 0){
				accs[counter] = a;
				counter++;
			}
		}
		return accs;
	}
}
