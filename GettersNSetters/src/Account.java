
public class Account {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printDetails()
	{
		System.out.printf("%s %s\n", getName(), getAge());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account g = new Account();
		g.setName("Frank");
		g.setAge(19);
		System.out.println(g.getAge());
		System.out.println(g.getName());
		g.printDetails();
		
	}

}
