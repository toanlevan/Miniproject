package Bank;

import java.util.ArrayList;
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
		customers = new ArrayList<Customer>();
	}
	
	List<Customer> customers;

	public int getBankID() {
		return bankID;
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
	
	public Customer getCustomerFromName(String name) {
		Customer result = null;
		for(int i=0;i<this.customers.size(); i++) {
			if(customers.get(i).getName().equals(name)) {
				result = customers.get(i);
			}
		}
		return result;
	}
}
