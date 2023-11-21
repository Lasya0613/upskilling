package algorithms;

public class PerfectNumber {
	public static boolean isPerfect(int n) {
		if (n<=0) {
			return false;
		}
		int divsum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				 divsum=divsum+i;
			}
		}
		return divsum==n;
		}
	

	public static void main(String[] args) {
		System.out.println(isPerfect(6));
	}

}
