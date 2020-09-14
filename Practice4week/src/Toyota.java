
public class Toyota extends Car {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Toyota started!");
	}
	public void honk(int number)
	{
		for (int i = 0;i < number; i++)
		{
			System.out.println("Toyota honked!");
		}
	}
	
}
