package Interfaces;

public interface OperateCar {
	int changeLanes(Direction direction, 
					double endSpeed);
	int turn(Direction direction, 
			double radius, 
			double endSpeed);
	int signalTurn(Direction direction,
			boolean signalOn);
}
