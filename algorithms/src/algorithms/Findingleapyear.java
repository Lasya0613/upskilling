package algorithms;

public class Findingleapyear {
	public static boolean isLeapYear(int year) {
		if (year<1) {
			return false;
		}
		if(year%4==0) {
			return true;
		}
		if(year%100!=0) {
			return false;
		}
		if(year%400==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(2000));

	}

}
