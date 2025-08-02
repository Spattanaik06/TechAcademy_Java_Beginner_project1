package day13;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	private static final String url="jdbc:mysql://localhost:3306/tech_academy";
	private static final String userName="root";
	private static final String Password="Suresh1234@";
		

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,Password);
		Statement st=con.createStatement();
		String query="select * from Student";
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
			int i=rs.getInt(1);
			String s=rs.getString(2);
			String t=rs.getString(3);
			System.out.println("Id : "+i+", Name : "+s+", Email Id : "+t);
			
		}
		

	}
 
}
