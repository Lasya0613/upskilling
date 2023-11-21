package algorithms;

public class Numbers {
	static void printNumbers(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
			
	}
	static void printSquareNumbers(int j) {
		for(int k=0;k<=j;k++) {
			System.out.println(k*k);
		}
	}
	static void sumMethod(int j,int k) {
		System.out.println(j+k);
	}
	static void triangle(int l,int p) {
		int angle=180-(l+p);
		System.out.println(angle);
	}

	public static void main(String[] args) {
		printNumbers(10);
		printSquareNumbers(10);
		sumMethod(2,6);
		triangle(90,40);

	}

}
