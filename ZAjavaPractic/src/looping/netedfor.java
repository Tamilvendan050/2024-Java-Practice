package looping;

public class netedfor {
	
	public void nestedloop () {
		
		for (int a=0; a<5; a++) {
			
			for (int b=0; b<3; b++) {
				System.out.println(b);
			}
			
			System.out.println(a);
		}
		
		
	}
	
	public static void main(String[] args) {
		netedfor n = new netedfor();
		n.nestedloop();
	}

}
