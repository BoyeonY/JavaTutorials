import java.util.ArrayList;

public class Customer {
	private String name;
	
	private ArrayList<Double> transaction = new ArrayList<Double>();
	
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transaction = new ArrayList<Double>();
		addTransaction(initialAmount); //add with initial money 
	}
	
	public void addTransaction(double amount) {
		this.transaction.add(amount);
	}
	
//	public static Customer createCustomer(String name, double initialAmount) {
//		return new Customer(name, initialAmount);
//	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransaction() {
		return transaction;
	}
	
	 
}
