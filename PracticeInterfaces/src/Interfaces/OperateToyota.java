package Interfaces;

public class OperateToyota implements OperateCar{
	private double speed;
	private boolean leftTurnIndicator;
	private boolean rightTurnIndicator;
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean isLeftTurnIndicator() {
		return leftTurnIndicator;
	}

	public void setLeftTurnIndicator(boolean leftTurnIndicator) {
		this.leftTurnIndicator = leftTurnIndicator;
	}

	public boolean isRightTurnIndicator() {
		return rightTurnIndicator;
	}

	public void setRightTurnIndicator(boolean rightTurnIndicator) {
		this.rightTurnIndicator = rightTurnIndicator;
	}

	OperateToyota()
	{
		speed = 0;
		leftTurnIndicator = false;
		rightTurnIndicator = false;
	}
	
	@Override
	public int changeLanes(Direction direction, double endSpeed) {
		if (!(endSpeed < speed) && !direction.isOk())
		{
			return 0;
		}
		return -1;
	}

	@Override
	public int turn(Direction direction, double radius, double endSpeed) {
		if (!(endSpeed < speed) 
				&& !direction.isOk() 
				&& !(direction.getDirectionWidth() < radius))
		{
			return 0;
		}
		return -1;
	}

	public int signalTurn(Direction direction, boolean signalOn)
	{
		switch(direction.getDirectionName())
		{
			case "LEFT":
				this.setLeftTurnIndicator(signalOn);
				break;
			case "RIGHT":
				this.setRightTurnIndicator(signalOn);
				break;
			default:
				break;
		}
		return 0;
	}
}
