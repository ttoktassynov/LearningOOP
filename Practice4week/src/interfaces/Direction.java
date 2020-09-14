package interfaces;

public class Direction {
	private String name;
	private boolean isSafe;
	private double width;
	
	Direction(String name, boolean isSafe, double width){
		this.setName(name);
		this.setSafe(isSafe);
		this.setWidth(width);
	}
	
	Direction(String name, boolean isSafe)
	{
		this.setName(name);
		this.setSafe(isSafe);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isSafe() {
		return isSafe;
	}
	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
}
