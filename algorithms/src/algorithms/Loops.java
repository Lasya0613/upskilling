package algorithms;

public class Loops {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("its executing");
			i++;
		}
		while(i<=5);
			System.out.println("its executing");
			
		
		System.out.println("the value of i:"+i);
	
	
	int k =1;
	while(k<=6) {
		System.out.println("its while");
		k++;
		
	}
	
	
	for(int j =1;j<=5;j++) {
		if(j==3) {
			continue;
		}
		System.out.println("its looping");
		
	}
	for(int j=1;j<=5;j++) {
		for(int h=1;h<5;h++) {
			System.out.println("j:"+j+" h:"+h+"is going good");
		}
	}
	
	
}
}
