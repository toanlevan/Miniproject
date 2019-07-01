package Bank;

public class Account {

	private int accountNo;
	private int balance;
	private int customerID;

	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNo, int balance, int customerID) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.customerID = customerID;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
