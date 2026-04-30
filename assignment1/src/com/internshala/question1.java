package com.internshala;

public class question1 {
	public static void main(String[] args) {
		float itemprice=10;
		int numberofitems=5;
		double taxrate=0.08;
		double discountpercentage=0.10;
		double subtotal=numberofitems*itemprice;
		double taxamount=taxrate*subtotal;
		double discountamount=discountpercentage*subtotal;
		double totalcost=subtotal+taxamount-discountamount;
		System.out.println("the subtotal is:"+subtotal+"\n the tax amount is"+taxamount+"\n the discount amount is:"+discountamount+"\n the total cost is:"+totalcost);
		
	}

}
