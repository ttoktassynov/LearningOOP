
public class Shirt {
	public String color;
	public char size;
	public static String type = "polo";
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	Shirt()
	{
		System.out.println("Constructed!");
	}
	Shirt(String color, char size)
	{
		setColor(color);
		setSize(size);
	}
	public static void putOn()
	{
		System.out.println("Shirt is on!");
	}
	public static void putOff()
	{
		System.out.println("Shirt is off!");
	}
	
}
