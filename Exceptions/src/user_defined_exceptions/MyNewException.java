package user_defined_exceptions;

public class MyNewException extends Throwable {

	private static int accno [] = {9000, 9001, 9002, 9003};
	private static String names[] = {"jack", "john", "emily", "mat", "jenny"};
	private static double bal[] = {1200.0, 3000.0, 8000.0, 300.0, 1000.0};
	
	MyNewException(String text){
		super(text);
	}
	MyNewException(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ACCNO" + "\t" + "NAME" + "\t" + "BAL");
		
		for (int i = 0; i < 4; ++i) {
			System.out.println(accno[i] + "\t" + names[i] + "\t" + bal[i]);
			
			try {
				if (bal[i] < 1000) {
					MyNewException me = new MyNewException("Balance is less than 1000");
					throw me;
				}
			}
			catch(MyNewException ex) {
				ex.printStackTrace();
			}
		}
	}

}
