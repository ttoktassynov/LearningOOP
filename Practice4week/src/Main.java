
public class Main {

	public static void main(String[] args) {
		Car car1 = new Toyota();
		Car car2 = new Tesla();
		
		((Toyota)car1).honk(5);
		car2.honk();
		
		car1.startEngine();
		car2.startEngine();
	}

}
