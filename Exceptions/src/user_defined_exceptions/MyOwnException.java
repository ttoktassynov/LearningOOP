package user_defined_exceptions;

public class MyOwnException extends Throwable{

	MyOwnException(String text){
		super(text);
	}
	MyOwnException(){}
	
	private static int [] accNumbers = {9000, 9001, 9002, 9003};
	private static String [] userNames = {"John", "Jack", "Rick", "Jenny", "Mat"};
	private static double [] balances = {5000.0, 9000.0, 8000.0, 999.0, 10_500.0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ACCNO" + "\t" + "NAME" + "\t" + "BALANCE");
		for (int i = 0; i < 4; ++i) {
			System.out.println(accNumbers[i] + "\t" + userNames[i] + "\t" + balances[i]);
			if (balances[i] < 1_000) {
				try {
					MyOwnException me = new MyOwnException("The balance is less thatn 1'000!");
					throw me;
				}
				catch(MyOwnException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}

}
