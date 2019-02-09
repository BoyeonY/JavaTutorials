import java.util.ArrayList;

public class Branch {

	//name
	private String name;
	//arraylist customer
	private ArrayList<Customer> customers;
	//constructor
	public Branch(String name) {

		this.name = name;
		this.customers =  new ArrayList<Customer>();
	}	
	//getter
	public String getName() {
		return name;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	//findcustomer
	public Customer findcustomer(String name) {
		for(int i = 0; i<customers.size(); i++) {
			Customer checkedcustomer = this.customers.get(i);
			if(this.customers.get(i).getName().equals(name));
			return checkedcustomer;
		}return null;
	}
	//newcustomers
	public boolean newcustomers(String customerName,double initalamount) {
		if(findcustomer(customerName) == null) {
			this.customers.add(new Customer(customerName,initalamount));
			return true;
		}else
			return false;
	}
	//addtransaction
	public boolean addiontaltransaction(String name, double amount) {
		Customer existingcustomer = findcustomer(name);
		if(existingcustomer != null) {
			existingcustomer.addTransaction(amount);
			return true;
			
		}return false;
	}
	
}
