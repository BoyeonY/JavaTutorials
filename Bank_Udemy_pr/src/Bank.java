import java.util.ArrayList;

public class Bank {
//name
	private String name;
//arraylist branch
	private ArrayList<Branch> branch;
//constructor
public Bank(String name) {
	this.name = name;
	this.branch = new ArrayList<Branch>();
}

//getter

public String getName() {
	return name;
}
public ArrayList<Branch> getBranch() {
	return branch;
}
	
public Branch findBranch(String branchName) {
	for(int i = 0; i<this.branch.size(); i++) {
		Branch existingBranch = this.branch.get(i);
		if(existingBranch.getName().equals(branchName))
			return existingBranch;
	}return null;
}
public boolean addBranch(String name) {
	if(findBranch(name) == null) {
		this.branch.add(new Branch(name));
		return true;
	}else 
		return false;
}
public boolean addCustomer(String branchName, String name, double intinalamount) {
	Branch branch = findBranch(branchName);
	if(branch != null) {
		return branch.addiontaltransaction(name, intinalamount);
	}return false;
}	


public boolean addcustomerTransaction(String branchName, String name, double amount) {
	Branch branch = findBranch(branchName);
	if(branch != null) {
		return branch.addiontaltransaction(name, amount);
	}return false;
}

public boolean listCustomers(String branchName, boolean showTransactions) {
	Branch branch = findBranch(branchName);
	if(branch != null) {
		System.out.println("Customer details for branch" + branch.getName());
	
	ArrayList<Customer> branchCustomers = branch.getCustomers();
	for(int i=0; i<branchCustomers.size(); i ++) {
		Customer branchCustomer = branchCustomers.get(i);
		System.out.println("Customer"+branchCustomer.getName()+"["+i+"]");
		if(showTransactions) {
			System.out.println("Trancsations");
			ArrayList<Double> transactions = branchCustomer.getTransaction();
			for(int j=0; j<transactions.size(); j++) {
				System.out.println("["+(j+1)+"]"+transactions.get(j));
			}
		}
		
	}return true;
	}
	else
	return false;
}
}


