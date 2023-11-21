package algorithms;

public class ImbdApp {

	public static void main(String[] args) {
		String name = "BTS";
		int yearOfBorn = 2013;
		
		String[] songTitles = {
				"ptd","dna","dynamite","butter","seven"
		};
		
		
		float[] songRatings = {
				8f,7.6f,9f,9.8f,9f
		};
		
		System.out.println("name"+name);
		System.out.println("year of debut"+yearOfBorn);
		
		for(int i=0; i<songTitles.length; i++) {
			System.out.println(songTitles[i]+ " is " + getRatings(songRatings[i]));
		}
		
		
		

	}
	static String getRatings(float ratings) {
		if(ratings<8f) {
			return "average";
			
		}else if(ratings<9) {
			return "worthy";
			
		}else {
			return "amazing";
		}
	
		
		
		
	}
}
