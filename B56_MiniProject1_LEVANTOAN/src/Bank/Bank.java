package Bank;

import java.util.List;

public class Bank {

	private int bankID;
	private String name;
	private String location;

	public Bank(int bankID, String name, String location) {
		super();
		this.bankID = bankID;
		this.name = name;
		this.location = location;
	}
	
	List<Account> accounts;
	List<Customer> customers;

	public int getBankID() {
		return bankID;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
