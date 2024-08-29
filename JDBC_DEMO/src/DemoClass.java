import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoClass {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/JdbcDemo";
		String uname = "root";
		String pass = "root";
		int userid = 6;
		String username = "	Deepali";
//		String query = "select username from student where userid=3";
//		String query = "select * from student";
//		String query = "insert into student values (4, 'Mohan')";
//		String query = "insert into student values (" + userid + ",'" + username +  "')";
		String query = "insert into student values (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
//		ResultSet rs = st.executeQuery(query);
		int count = st.executeUpdate();
		
		System.out.println(count + " rows affected");
		
//		String userData = "";
		
//		while(rs.next())
//		{
//	//		String name = rs.getString("username");
//			userData = rs.getInt(1) + " : " + rs.getString(2);
//			
//			System.out.println(userData);
//		
//		}
		
		st.close();
		con.close();
		
	}

}
