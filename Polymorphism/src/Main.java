
public class Main {

	public static void main(String[] args) {
		
		Food foods [] = new Food[3];
		foods[0] = new Potpie();
		foods[1] = new Tuna();
		foods[2] = new Food();
		
		for (int i = 0; i < 3; ++i)
		{
			foods[i].eat();
		}
		
	}

}
