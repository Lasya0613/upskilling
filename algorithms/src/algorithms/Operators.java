package algorithms;

public class Operators {

	public static void main(String[] args) {
		String carname = "swift";
		int price = 150000;
		int moneyinbank = 2000000;
		
		System.out.println("the price of"+ carname + "is "+ price);
		
		int incprice = price + 1000;
		System.out.println("the icreasedprice of"+ carname + "is "+ incprice);
		
		int decprice = price - 1000;
		System.out.println("the decreased price of"+ carname + "is "+ price);
		
		int carsbought = moneyinbank/price;
		System.out.println("the no of cars can be bought are "+carsbought);
		
		int moneyrem = moneyinbank%price;
		System.out.println("the moeny remaining in the bank is" + moneyrem);
		

	}

}
