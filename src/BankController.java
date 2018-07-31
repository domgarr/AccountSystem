
public class BankController {
	public static void main(String[] args){
		AccountLogic.initilizeAccountArray();
		BankController bC = new BankController();
		bC.loopMenu();
	}
	
	public void printMenu(){
		Account.accounts[0] = new Account();
		Account.accounts[0].setAccountHolder("DOmenic:");
		Account.accounts[0].setAccountNumber("123123123123123");
		
		Account.accounts[1] = new Account();
		Account.accounts[1].setAccountHolder("Alex:");
		
		System.out.println("1: Create Account");
	}
	
	public void loopMenu(){
		while(true){
			printMenu();
			int option = Integer.valueOf(IOHelper.ask("Enter a menu option: "));
			menuController(option);
		}
	}
	
	public void menuController(int option){
		switch(option){
		case 1: AccountLogic.createAccount();	
			break;
		case 2: AccountLogic.viewAccountByNumber();
			break;
		case 3: AccountLogic.viewAccountByHolderName();
			break;
		case 4: AccountLogic.viewAccountsByType();
			break;
		case 5: AccountLogic.showAccounts();
		
			break;
		case 6: System.exit(0);
			break;
		default: throw new IllegalArgumentException("No such option exists.");
		}
	}
	
	

}
