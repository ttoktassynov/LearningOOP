
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car first = new Toyota();
		Car second = new Tesla();
		
		first.drive();
		second.drive();
		
		((Toyota)first).horn(3);
		second.horn();
		
	}

}
