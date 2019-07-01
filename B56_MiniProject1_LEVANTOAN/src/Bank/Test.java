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
		List<Account> accounts1 = new ArrayList<Account>();
		List<Account> accounts2 = new ArrayList<Account>();
		List<Customer> customers1 = new ArrayList<Customer>();
		List<Customer> customers2 = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);

		print("Number Bank: ");
		n = scanner.nextInt();

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


		print("Number Customer 1: ");
		int nCus = scanner.nextInt();
		scanner.nextLine();
		for(int i =0; i<nCus; i++) {
			int idCus=i+1;
			String nameCus = "Custommer1_"+i+1;
			String addressCus = "Hanoi1_"+i+1;
			Customer cus = new Customer(idCus,nameCus,addressCus,i+1);
			customers1.add(cus);
			Account acc = new Account(i+1,100,i+1);
			accounts1.add(acc);

		}

		banks.get(0).setAccounts(accounts1);
		banks.get(0).setCustomers(customers1);
		print("Number Customer 2: ");
		int nCus1 = scanner.nextInt();
		for(int i =0; i<nCus1; i++) {
			int idCus = i+1;
			String nameCus = "Customer2_"+(i+1);
			String addressCus = "Hanoi2_"+(i+1);
			Customer cus = new Customer(idCus,nameCus,addressCus, i+1);
			customers2.add(cus);
			Account acc = new Account(i+1,100,i+1);
			accounts1.add(acc);

		}
		banks.get(1).setAccounts(accounts2);
		banks.get(1).setCustomers(customers2);


		for(int i=0; i<n; i++) {
			print(banks.get(i).getBankID()+ " , " +banks.get(i).getName() +" , " + banks.get(i).getLocation());
		}

		scanner.close();


	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(String s) {
		System.out.println(s);
	}

}
