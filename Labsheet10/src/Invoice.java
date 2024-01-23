
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer ;
	}

	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return ;
	}
	
	public String getCustomerName() {
		return ;
	}
	
	public int getCustomerDiscount() {
		return;
	}
	
	public String toString() {
		return "Invoice";
	}
}
