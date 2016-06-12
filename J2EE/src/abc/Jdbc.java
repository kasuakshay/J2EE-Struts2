package abc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc
{
	public static Connection getConnection() throws Exception
	{
		Connection con=null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@10.212.0.224:1521:xe","dac16_160240320121","160240320121");
		return con;
		
	}
}
