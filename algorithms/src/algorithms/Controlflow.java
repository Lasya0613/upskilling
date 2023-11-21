package algorithms;

public class Controlflow {

	public static void main(String[] args) {
		boolean isDmaged= true;
		String clr = "red";
		char effeciency='g';
		
		if(isDmaged) {
			System.out.println("car is damaged");
			
		}
		else 
			System.out.println("car is in good condition");
		
	
	if(clr.equals("red")) {
		System.out.println("car is in red clr");
		
	}else if(clr.equals("black")) {
		System.out.println("car is black");
	}
	else {
		System.out.println("cant identify the clr");
	}
	switch(effeciency) {
	case 'a':
	System.out.println("low effeciency");
	break;
	case 'g':
		System.out.println("very high effeciency");
		break;
	default:
			System.out.println("not identical");
	}
	
	int[] arr = new int[8];
	for(int i=7;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	}

}
