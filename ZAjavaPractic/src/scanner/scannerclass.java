package scanner;

import java.util.Scanner;

public class scannerclass {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter your Age:");
		int Age = Sc.nextInt();
		System.out.println("Age="+ Age);
		
		System.out.println("Enter your name:");
		String name = Sc.next();
		System.out.println("Name=" + name);
		
		System.out.println("Enter your salary:");
		long sal = Sc.nextLong();
		System.out.println("Salary=" + sal);
	}
}
