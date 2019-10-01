import java.io.*;
import java.util.*;
import java.util.ArrayList;

class MAIN{

	public static void main(String[] args){

		Bank bank = new Bank("National Australia Bank");
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide","Tim",50.05);
		bank.addCustomer("Adelaide","Mike",156.20);
		bank.addCustomer("Adelaide","Percy",78.05);

		bank.addBranch();
	}


}

class Customer{

	private String name;
	private double balance;
	private ArrayList<Double> transactions;

	Customers(String name,double balance){
		
		transactions = new ArrayList<Double>();
		this.name = name;
		addTransactions(balance);		
	}

	public void addTransactions(double amount){

		this.transactions.add(amount);		
	}
		
	public String getName(){

		return name;
	}

	public ArrayList<Double> getTransactionsList(){

		return transactions;
	}

}

class branch{

	private String name;
	private ArrayList<Customer> customers;

	branch(String name){
	
		customers = new ArrayList<Customer>();
		this.name = name;
			
	}

	public void getName(){
		return name;
	}

	public boolean newCustomer(String customerName,double amount){

		//Customer existingCustomer = findCustomer(customerName);	
		if(findCustomer(customerName) == NULL){
			existingCustomer.add(new Customer(customerName, amount));
			return true;
		}	
			return false;
	}


	public boolean addCustomerTransaction(String customerName, double amount){

		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null){
		
			existingCustomer.addTransaction(amount);		
			return true;
		}
			return false;
	}

	public ArrayList<Customer> getCustomerArray(){
		return customers; 
	}
	
	private Customer findCustomer(String customerName){

		for(int i=0;i<this.customers.size();++i){

			Customer checkCustomer = this.customers.get(i);
			if(checkCustomer.getName() == customerName){

				return checkCustomer;
			}
				return null;
		}
	}

}//end of branch class


class Bank{

	private branchName;
	private ArrayList<branch> branches;

	public Bank(String branchName){
		this.branchName = branchName;
		branches = new ArrayList<branch>();	
	}

	public String getName(){

		return branchName;
	}

	public boolean addBranch(String branchName){

		if(findBranch(branchName) == null){
			branches.add(new branch(branchName);
			return true;
		}

			return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double amount){

		branch b = findBranch(branchName);
		if(b != null){
			return b.newCustomer(customerName,amount);
		}
			return false;
	
	}

	public boolean addCustomerTransaction(String branchName, Sting customerName, double amount){

		branch b = findBranch(branchName);
		if(b != null){
			return b.addCustomerTransaction(customerName,amount);
		}
			return false;
	}   	

	private branch findBranch(String branchName){

		for(int i=0;i<branches.size();++i){

			branch checkbranch = this.branches.get(i);
			if(checkbranch.getName() == branchName){
				
				return checkbranch; 
			}		
		}
			return null;
	}

	public boolean listCustomer(String branchName,boolean showTransaction){

		branch b = findBranch(branchName);
		if(b != null){
		
			System.out.println("Customers details branch " + b.getName());
			ArrayList<Customer> branchCustomers = b.getCustomerArray();
			for(int i=0;i<branchCustomers.size();++i){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
				if(showTransactions){
					System.out.println("Transactions:-");
					ArrayList<Double> transactions = branchCustomer.getTransactionsList();
					for(int j=0;j<transactions.size();++j){

						System.out.println("[" + (j+1) + "]" + transactions.get(i));
					}
				}
			}
				return true;	
   									
		}

			return false;
	}


} 