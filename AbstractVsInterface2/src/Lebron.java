
public class Lebron implements Basketballer{

	@Override
	public void themeMusic() {
		// TODO Auto-generated method stub
		System.out.println("Lebron's music");
	}

	@Override
	public void finisher() {
		// TODO Auto-generated method stub
		System.out.println("Lebron's finisher moves");
	}

	@Override
	public void paymentForSeason(int games) {
		// TODO Auto-generated method stub
		System.out.println("Lebron will make $" + games * 500.00 + " for season!" );

	}

}
