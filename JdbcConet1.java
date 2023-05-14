package conect;
import java.sql.*;

public class JdbcConet1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*You will get an error ClassNotFound in the above line
			 that is because you need to configure ojdbc.jar file
			 to configure ojdbc.jar file 
			 right click on connect>>build path or properties>>
			 library>>Add External jar>>ojdbc.jar path
			 (app->oracle->product->10.2.0->server->jdbc->lib->
			 now select ojdbc14.jar)it may vary for you>>Apply&close
			 
			 or
			 
			 In Eclipse under project folder
			 ->WEB-INF->lib then Right click lib folder-> Build Path
			 ->Configure Build Path->Under Libraries->
			 Click on Add External Jars->Computer->Local Disk (C:)
			 ->oraclexe->app->oracle->product->10.2.0->server->jdbc
			 ->lib->now select ojdbc14.jar
			 */
			
			System.out.println("Driver registered and loaded");
			DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","william","william");
			/*here in the above line you might encounter SQLException it maybe
			 *because of wrong url check wheather the oracle services are running
			 *and check near the port number or sid or type of driver used 
			 *as well as user name and password etc 
			 */
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		catch(SQLException e1) 
		{
			System.out.println("e1");
		}
	}
}
