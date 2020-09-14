
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt s = new Shirt("White", 'M');
		Shirt t = new Shirt("Red", 'S');
		
		System.out.println(s.getColor());
		System.out.println(s.getSize());
		
		System.out.println(t.getColor());
		System.out.println(t.getSize());
		
		System.out.println(Shirt.type);

		Shirt.putOn();
		Shirt.putOff();
	}

}
