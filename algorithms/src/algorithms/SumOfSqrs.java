package algorithms;

public class SumOfSqrs {
	public static long isSquares(int n) {
		if(n<0) {
			return -1;
		}
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum+(i*i);
		}
		return sum;
	}
	

	public static void main(String[] args) {
		System.out.println(isSquares(5));
	
	}

}
