package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create bank;
		int n;
		// Create account  and customer for bank 1;
		Scanner scanner = new Scanner(System.in);

		print("Number Bank: ");
		n = scanner.nextInt();
      // Init bank
		List<Bank> banks = new ArrayList<Bank>();
		for(int i=0; i<n; i++) {
			print("Bank: "+(i+1));
			print("Bank name: ");
			scanner.nextLine();
			String bankName = scanner.nextLine();
			print("Address: ");
			String address = scanner.nextLine();
			print("ID: ");
			int id = scanner.nextInt();
			Bank bank = new Bank(id, bankName, address);
			banks.add(bank);
		}
		
		int exit = 0;
		int option = 0;
		while(exit == 0) {
			print("Please choose below items: ");
			print("1. Create Account\n");
			print("2. Transfer money \n");
			print("3. Exit \n");
			option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1: 
				print("Input Bank:");
				String bankName = scanner.nextLine();
				Bank bank = null;
				for(int i =0; i< banks.size(); i++) {
					if(banks.get(i).getName().equals(bankName)) {
						bank = banks.get(i);
						break;
					}
				}
				if(bank != null) {
				bank.getCustomers().add(createAccount());
				} else {
					print("Bank name is not exist!");
				}
				break;
			case 2:
				print("Transfer Money:");
				transferMoney(banks);
				break;
			default:
				print("Exit!");
				exit = 1;
				break;
			}
		}
		scanner.close();

	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(String s) {
		System.out.println(s);
	}
	public static Customer createAccount() {
		Scanner scanner1 = new Scanner(System.in);
		print("Name: ");
		String name = scanner1.nextLine();
		print("id: ");
		int id = scanner1.nextInt();
		scanner1.nextLine();
		print("Address: ");
		String add = scanner1.nextLine();
		print("Account number: ");
		int accNo = scanner1.nextInt();
		scanner1.nextLine();
		print("Account balance: ");
		int balance = scanner1.nextInt();
		scanner1.nextLine();
		Customer cus = new Customer(id, name, add, accNo);
		cus.createAccount();
		cus.getAccount().setAccountNo(accNo);
		cus.getAccount().setBalance(balance);
		return cus;

	}
	public static void transferMoney(List<Bank> banks) {
		Scanner scanner2 = new Scanner(System.in);
		print("Input Customer name: ");
		String fromCusName = scanner2.nextLine();
		print("Input Source Bank Name:");
		String fromBankName = scanner2.nextLine();
		print("Input Source Account Number: ");
		int fromAccNo = scanner2.nextInt();
		scanner2.nextLine();
		print("Input Distint Name: ");
		String toCusName = scanner2.nextLine();
		print("Input Distint Bank Name: ");
		String tobankName = scanner2.nextLine();
		print("Input Distint Account Number: ");
		int toAccNo = scanner2.nextInt();
		scanner2.nextLine();
		print("Input Money");
		int money = scanner2.nextInt();
		
		Customer fromCus = null;
		Customer toCus = null;
		for(int i=0; i<banks.size(); i++) {
			if(banks.get(i).getName().equals(fromBankName)) {
				fromCus = banks.get(i).getCustomerFromName(fromCusName);
				
			}else if(banks.get(i).getName().equals(tobankName)) {
				toCus = banks.get(i).getCustomerFromName(toCusName);
			} 
			if(fromCus != null && toCus !=null) {
				break;
			} 
			
		}
		if(fromCus == null ) {
			print("The Source Customer is not exist!");
		}
		if(toCus == null) {
			print("The Distint Customer is not exist!");
		}
		print(" The balance before transfer of customer: "+fromCus.getName()+" is "+fromCus.getAccount().getBalance()+"\n");
		print(" The balance before transfer of customer: "+toCus.getName()+" is "+toCus.getAccount().getBalance()+"\n");
		
		if(fromCus != null && toCus!=null) {
			fromCus.withdrawMoney(money);
			toCus.depositeMoney(money);
		}
		print(" The balance after transfer of customer: "+fromCus.getName()+"is "+fromCus.getAccount().getBalance()+"\n");
		print(" The balance after transfer of customer: "+toCus.getName()+"is "+toCus.getAccount().getBalance()+"\n");
		
		
	}

}
