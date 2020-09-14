package Interfaces;

public class Direction {
	private String directionName;
	private boolean isOk;
	private double directionWidth;

	public double getDirectionWidth() {
		return directionWidth;
	}

	public void setDirectionWidth(double directionWidth) {
		this.directionWidth = directionWidth;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public String getDirectionName() {
		return directionName;
	}

	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}
	
}
