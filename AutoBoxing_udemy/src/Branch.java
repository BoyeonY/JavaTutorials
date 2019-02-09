import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customers; // we can have a separate list of customers for each branch
	
	//constructor
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
		
	}
	
	//getter
	public String getName() {
		return name;
	}
	//
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	public boolean newCustomer(String customerName, double initialAmount) {
		if(findcustomer(name) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
			
		}else 
			return false;
	}
	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findcustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		} return false;
	}
	
	
	private Customer findcustomer(String name) {
		for(int i=0; i<this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if(this.customers.get(i).getName().equals(name)) {
				return checkedCustomer;
			}
		}
		return null;
	}
}
