import java.sql.*;

public class Basic {
	public void getConnectivity() throws SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/clg";
		String username="root";
		String password="1303";
		String Query="insert into details values(?,?)";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,3);
		pst.setString(2,"lav");
		pst.setString(4,"boost");
		pst.executeUpdate();
	}

	
}


