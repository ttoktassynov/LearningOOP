
interface WaterBottleInterace
{
	String color = "blue";
	void fillUp();
	void pourOut();
}
public class InterfaceExample implements WaterBottleInterace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample ex = new InterfaceExample();
		System.out.println(ex.color);
		ex.fillUp();
		ex.pourOut();
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("The bottle is filled!");
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		System.out.println("The bottle is poured out!");
	}
}
