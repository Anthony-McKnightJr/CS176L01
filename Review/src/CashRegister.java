
public class CashRegister {

	private double purchase;
	private double payment;
	
	public CashRegister(double purchase, double payment) {
		purchase = purchase;
		payment = payment;
	}
	
	public CashRegister() {
		purchase = 0;
		payment = 0 ;
	}
	
	public void recordPurchase(double amount) {
		purchase = amount;
	}
	
	public void recievePayment(double amount) {
		payment = amount;
	}
	
	public double getChange(double change) {
		change = payment - purchase;
		return change;
	}
	
}
