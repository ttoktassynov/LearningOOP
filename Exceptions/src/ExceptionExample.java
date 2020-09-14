
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 10;
			System.out.println(a/b);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Hello!");
		}
	}

}
