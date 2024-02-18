package abstraction;

public class fullyabst extends partialabst {
	
	public void empid () {
		System.out.println("emp id is 100");
	}
	
	
	public void empname () {
		System.out.println("emp name is TAMILVENDAN");
	}

	
	public static void main(String[] args) {
		fullyabst f = new fullyabst();
		f.empid();
		f.empname();
	}
}
