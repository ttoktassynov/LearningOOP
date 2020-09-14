
public class Toyota extends Car{
	void drive()
	{
		System.out.println("Toyota is driving!");
	}

	@Override
	void horn() {
		// TODO Auto-generated method stub
		System.out.println("Toyota is horning!");
	}
	void horn(int number)
	{
		for (int i = 0;i < number; ++i)
		{
			horn();
		}
	}
}
