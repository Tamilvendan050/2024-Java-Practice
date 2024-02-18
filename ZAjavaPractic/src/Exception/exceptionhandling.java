package Exception;

public class exceptionhandling {
	
public static void main(String[] args) {
	
	int a=10; 
	int b=0;
	
	System.out.println("Hai");
	
	try
	{
		System.out.println(a/b);
	}
	
	catch (Exception e)
	{
		System.err.println("Error occured");
		
	}
	
	System.out.println("Hellow");
	
}	


}
