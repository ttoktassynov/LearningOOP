package user_defined_exceptions;

public class MyException extends Exception{

	private static int accno[] = {9000, 9001, 9002, 9003, };
	private static String names[] = {"jack", "liza", "mat", "henry", "alex"};
	private static double bal[] = {1200.0, 1500.0, 1940.0, 300.0, 2400.0};
	
	MyException() {}
	MyException(String message){
		super(message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ACCNO" + "\t" + "NAME" + "\t" + "BALANCE");
		for (int i = 0; i < 4; ++i) {
			System.out.println(accno[i] + "\t" + names[i] + "\t" + bal[i]);
			try {
				if (bal[i] < 1000) {
					MyException me = new MyException("Balance is less 1000");
					throw me;
				}
			}
			catch(MyException ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
