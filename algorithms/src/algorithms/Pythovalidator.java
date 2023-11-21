package algorithms;

public class Pythovalidator {
	public static boolean triangleValidator(int side1, int side2, int side3) {
		if (side1<=0||side2<=0||side3<=0) {
			return false;
		}
		if ((side1*side1)==(side2*side2)+(side3*side3)) {
			return true;
		}
	    if (side3 * side3 == side1 * side1 + side2 * side2) {
            return true;
	    }
	    if (side2 * side2 == side1 * side1 + side3 * side3) {
            return true;
            }
	    return false;
	}

	public static void main(String[] args) {
		System.out.println(triangleValidator(4,5,6));
		
	}

}
