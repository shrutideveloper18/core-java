package module3;

public class bankaccount {
	private int accno;
	private double balance;
	
	public int getaccno() {
		return accno;
	}
	public void setaccno(int accountnumber) {
		this.accno=accountnumber;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double b) {
		this.balance=b;
	}
	//constructor
	public bankaccount(int accnumber,double b) {
		this.accno=accnumber;
		this.balance=b;
	}
	//methods
	public void deposit_amount(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("amount depsited, new balance"
					+ " is"+balance);
		}
		else {
			System.out.println("invalid amount");
		}
	}
	public void withdraw_amount(double amount) {
		if(amount>0&&amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdraw, new balance"
					+ " is"+balance);
		}
		else {
			System.out.println("invalid amount");
		}
	}
	public void checkbalance() {
		System.out.println("your current balance is"+balance);
	}
}


