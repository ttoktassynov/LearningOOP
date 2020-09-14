package interfaces;

public class OperateToyota implements OperateCarInterface {
	private double speed;
	private boolean leftTurnIndicator;
	private boolean rightTurnIndicator;
	
	
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

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public int turn(Direction direction, double radius, double endSpeed) {
		// TODO Auto-generated method stub
		if (radius > direction.getWidth() || !direction.isSafe() || endSpeed < speed)
		{
			return -1;
		}
		return 0;
	}

	@Override
	public int changeLane(Direction direction, double endSpeed) {
		// TODO Auto-generated method stub
		if (!direction.isSafe() || endSpeed < speed)
		{
			return -1;
		}
		return 0;
	}

	@Override
	public int setTurnIndicator(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		switch(direction.getName())
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
