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
			String nameCus = "Custommer1_"+String.valueOf(i+1);
			String addressCus = "Hanoi1_"+String.valueOf(i+1);
			Customer cus = new Customer(idCus,nameCus,addressCus,i+1);
			Account acc = new Account(i+1,100,i+1);
			cus.setAccount(acc);
			customers1.add(cus);

		}

		banks.get(0).setCustomers(customers1);
		print("Number Customer 2: ");
		int nCus1 = scanner.nextInt();
		for(int i =0; i<nCus1; i++) {
			int idCus = i+1;
			String nameCus = "Customer2_"+String.valueOf(i+1);
			String addressCus = "Hanoi2_"+String.valueOf(i+1);
			Customer cus = new Customer(idCus,nameCus,addressCus, i+1);
			
			Account acc = new Account(i+1,100,i+1);
			cus.setAccount(acc);
			customers2.add(cus);

		}
		banks.get(1).setCustomers(customers2);

		
		scanner.nextLine();

		print("Chuyen tien  ");
		print("Vui long nhap ten ban: ");
		String customerNameFrom = scanner.nextLine();
		print("Vui long nhap ten ngan hang: ");
		String bankNameFrom = scanner.nextLine();
		print("Ten nguoi huong:");
		String customerNameTo = scanner.nextLine();
		print("Nhap ten ngan hang cua nguoi huong:");
		String bankNameTo = scanner.nextLine();
		print("Nhap so tien can chuyen");
		int numberMoney = scanner.nextInt();
		
		int numberTransaction =0;
		Customer cusFrom = null;
		Customer cusTo = null;
		for(int i=0; i<banks.size(); i++) {
			if(banks.get(i).getName().equals(bankNameFrom)) {
				cusFrom = banks.get(i).getCustomerFromName(customerNameFrom);
				
			}else if(banks.get(i).getName().equals(bankNameTo)) {
				cusTo = banks.get(i).getCustomerFromName(customerNameTo);
			} 
			if(cusFrom != null && cusTo !=null) {
				break;
			} 
			
		}
		if(cusFrom == null ) {
			print("Khong tim thay ten khach hang");
		}
		if(cusTo == null) {
			print("Khong tim thay ten nguoi huong");
		}
		print("So tien cua ban  truoc khi chuyen la : "+cusFrom.getAccount().getBalance());
		print("So tien cua ban  ban truoc khi chuyen la : "+cusTo.getAccount().getBalance());
		
		
		
		cusFrom.withdrawMoney(numberMoney);
		cusTo.depositeMoney(numberMoney);
		
		print("So tien cua ban  sau khi chuyen la : "+cusFrom.getAccount().getBalance());
		print("So tien cua ban  ban sau khi chuyen la : "+cusTo.getAccount().getBalance());
		
		scanner.close();

	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(String s) {
		System.out.println(s);
	}

}
