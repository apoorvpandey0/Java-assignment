// Program to demonstrate exception handling in case of division by zero error.
public class Q8 {
    	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error: "+e.toString());
		}
	}
}
    
