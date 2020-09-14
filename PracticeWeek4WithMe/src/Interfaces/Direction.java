package Interfaces;

public class Direction {
	private String type;//left, right, forward, backward
	private boolean isSafe;
	private double width;
	
	Direction(String type, boolean isSafe)
	{
		this.setType(type);
		this.setSafe(isSafe);
	}
	Direction(String type, boolean isSafe, double width)
	{
		this.setType(type);
		this.setSafe(isSafe);
		this.setWidth(width);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isSafe() {
		return isSafe;
	}
	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
}
