package algorithms;

public class Trianglevalidator {
	public static boolean isTriangle(int a1,int a2,int a3) {
		if(a1<=0||a2<=0||a3<=0) {
			return false;
		}
		
		
		int sumOfAngels=a1+a2+a3;
		return sumOfAngels == 180;
		
		}
	

	public static void main(String[] args) {
		System.out.println(isTriangle(60,40,80));
	}

}
