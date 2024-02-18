package polymorphism;

public class overriding extends overloading {
	
	public void empname () {
		
		System.out.println("emp name is TAMILVENDAN ");
		
	}
	

	public static void main(String[] args) {
		overriding o = new overriding();
		o.empid();
		o.empname();
		
		
	}
}
