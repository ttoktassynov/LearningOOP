package Interfaces;

public interface OperateCarInterface {
	void turn(Direction direction, double endSpeed, double radius);
	void changeLane(Direction directon, double endSpeed);
	void setTurnIndicator(Direction direction, boolean signalOn);
	void brake(double decrement);
	void accelerate(Direction direction, double increment);
}
