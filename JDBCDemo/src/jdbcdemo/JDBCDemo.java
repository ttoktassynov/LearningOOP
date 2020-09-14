package jdbcdemo;
import java.sql.*;

public class JDBCDemo {

	public static String lastnames[] = {"Hill", "Wall", "Johnson"};
	public static String firstnames[] = {"George", "John", "Dereck"};
	public static String emails[] = {"hill@yahoo.com", "wall@ford.com", "johnson@turing.com"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Avaya102");
			String query = "insert into employees (last_name, first_name, email) values (?,?,?)";
			PreparedStatement myStm = myConn.prepareStatement(query);
			
			for (int i = 0; i < lastnames.length; ++i) {
				myStm.setString(1, lastnames[i]);
				myStm.setString(2, firstnames[i]);
				myStm.setString(3, emails[i]);
				
				myStm.executeUpdate();
			}
			
			ResultSet myRs = myStm.executeQuery("select * from employees");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name") + ", " 
						+ myRs.getString("last_name") + ", " + myRs.getString("email"));
			}
			
			myStm.close();
			myConn.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
