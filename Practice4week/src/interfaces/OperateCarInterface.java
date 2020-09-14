package interfaces;

public interface OperateCarInterface {
	int turn(Direction direction, double radius, double endSpeed);
	int changeLane(Direction direction, double endSpeed);
	int setTurnIndicator(Direction direction, boolean signalOn);
}
