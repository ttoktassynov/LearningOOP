package Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateTesla tesla = new OperateTesla();
		
		tesla.accelerate(new Direction("forward", true), 50);
		
		tesla.setRightTurnIndicator(true);
		tesla.changeLane(new Direction("RIGHT", true), 30);
		
		tesla.turn(new Direction("LEFT", true, 10), 52, 15);
		
	}

}
