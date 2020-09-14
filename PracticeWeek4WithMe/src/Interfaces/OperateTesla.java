package Interfaces;

public class OperateTesla implements OperateCarInterface{
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

	@Override
	public void turn(Direction direction, double endSpeed, double radius) {
		if (!direction.isSafe() || endSpeed < this.getSpeed() || direction.getWidth() < radius)
		{
			System.out.println("Cannot turn!");
			return;
		}
		System.out.println("Successfully turned!");
	}

	@Override
	public void changeLane(Direction directon, double endSpeed) {
		if (!directon.isSafe() || endSpeed < this.getSpeed())
		{
			System.out.println("Cannot change lanes!");
		}
		System.out.println("Changed the lanes!");
	}

	@Override
	public void setTurnIndicator(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		if (direction.getType() == "LEFT")
		{
			this.setLeftTurnIndicator(signalOn);
			System.out.println("Set the left indicator!");
		}
		else
		{
			this.setRightTurnIndicator(signalOn);
			System.out.println("Set the right indicator!");
		}
	}

	@Override
	public void brake (double decrement) {
		// TODO Auto-generated method stub
		this.speed -= decrement;
		System.out.println("Braked!");
	}

	@Override
	public void accelerate(Direction direction, double increment) {
		// TODO Auto-generated method stub
		if (!direction.isSafe())
		{
			System.out.println("Cannot accelerate!");
		}
		this.speed += increment;
		System.out.println("Accelerated successfully!");
	}
	

}
