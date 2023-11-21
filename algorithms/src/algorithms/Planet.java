package algorithms;

public class Planet {
	void revolve() {
		System.out.println("i am revolving");
	}
	 void seeU() {
		System.out.println("Coming Soon");
	}
	public static void main(String[] args) {
		Planet earth = new Planet();
		Planet venus = new Planet();
		Numbers tab = new Numbers();
		earth.revolve();
		venus.seeU();
		tab.printNumbers(10);
	}

}
