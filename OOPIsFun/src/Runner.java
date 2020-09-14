
public class Runner {
	public String first;
	public String last;
	private static int members = 0;
	private final int CLUB_ID = 123;
	
	public Runner()
	{
		System.out.println("default constructed!");
	}

	public Runner(String ft, String lt)
	{
		first = ft;
		last = lt;
		members++;
		System.out.printf("Consturctor for %s %s and member count: %d and clubid is %d\n", first, last, members, CLUB_ID);
	}
}
