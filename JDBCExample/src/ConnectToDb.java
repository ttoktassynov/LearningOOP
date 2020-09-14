import java.sql.*;

public class ConnectToDb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Avaya102");
			Statement st = con.createStatement();
			st.executeUpdate("insert into employees (id, last_name, first_name, email) values (6, 'statham', 'jason', 'jason@yahoo.com')");
			
			ResultSet rs = st.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println(rs.getString(3) + " " + rs.getString(2));
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
