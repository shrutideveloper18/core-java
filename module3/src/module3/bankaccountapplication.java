package module3;

public class bankaccountapplication {
	public static void main(String[] args) {
		bankaccount acc1=new bankaccount(1,500000);
//	     acc1.accno=1; we cant update as it is  private 
//		acc1.balance=10000.00;
		acc1.deposit_amount(2000);
		acc1.withdraw_amount(12000);
		System.out.println(acc1.getaccno());
		savingsaccount s1=new savingsaccount(1,3000.00,0.07);
		s1.checkbalance();
		s1.calculateinterest();
		s1.checkbalance();
		
	}
}
