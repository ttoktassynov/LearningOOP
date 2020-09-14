package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateToyota toyota = new OperateToyota();
		
		toyota.setSpeed(50);
		toyota.setLeftTurnIndicator(true);
		
		System.out.println(toyota.changeLane(new Direction("RIGHT", true), 75));
		System.out.println(toyota.turn(new Direction("LEFT", true, 20), 10, 49));
	}

}
