package module3;

public class savingsaccount extends bankaccount {
	private double interestrate;
	//constructor
	public savingsaccount(int accnumber,double balance,double interestrate) {
		super(accnumber,balance);
		this.interestrate=interestrate;
	}
	//methods for subclass
	public void calculateinterest() {
		double interest=getbalance()*interestrate;
		deposit_amount(interest);
		System.out.println("interest added:"+interest);
	}
}
