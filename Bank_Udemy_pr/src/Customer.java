import java.util.ArrayList;

public class Customer {
//name
	private String name;
//double array
	private ArrayList<Double> transaction = new ArrayList<Double>();
//Constructor
public Customer(String name, double initalAmount) {
	this.name = name;
	this.transaction = new ArrayList<Double>();
	addTransaction(initalAmount);
}	

//getter
public String getName() {
	return name;
}
public ArrayList<Double> getTransaction() {
	return transaction;
}
//addtransaction
public void addTransaction(double amount) {
	this.transaction.add(amount);
}

}
