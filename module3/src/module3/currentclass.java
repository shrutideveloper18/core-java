package module3;

public class currentclass extends bankaccount {
	//must provide calculateinterest()
	private double interestrate;
	public currentclass(int accno,double balance,double interestrate) {
		super(accno,balance);
		this.interestrate=interestrate;
		
	}
	@Override
	public void calculateinterest() {
		double interest=getbalance()+interestrate;
		deposit_amount(interest);
		System.out.println("interetsadded:"+interest);
		
	}
}
