package algorithms;

public class Timeconversion {
	public static int conversionOfHours(int h) {
		if (h<0) {
			
			return -1;
		}
		System.out.println(h*60);
		return h;
	}
	public static int conversionOfDays(int d) {
		
		if (d<0) {
			return -1;
			
		}
		System.out.println(d*24*60);
		return d;
		}
	

	public static void main(String[]args) {
		conversionOfHours(12);
		conversionOfDays(4);
		
	}
}
