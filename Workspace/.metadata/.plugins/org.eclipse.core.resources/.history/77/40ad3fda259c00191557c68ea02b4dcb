package Bank;

public class Customer {
	private int id;
	private String name;
	private String address;
	private int accountNo;
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, String address, int accountNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.accountNo = accountNo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public void openAccount() {
		
	}
	public void  closeAccount() {
		
	}
	public void depositeMoney(int money) {
		if(money>0) {
			this.account.setBalance(account.getBalance() + money);
		} else {
			System.out.println("Wrong input data");
		}
	}
	public void withdrawMoney(int money) {
		if((money>0)&&(money<this.account.getBalance()) ) {
			this.account.setBalance(account.getBalance() - money);
		} else {
			System.out.println("Wrong input data");
		}
	}

}
