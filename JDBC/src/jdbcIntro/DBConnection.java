package jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
	public static void main(String[]args) throws SQLException 
	{
		Connection conn=null;
		
		try
		{
			System.out.println("connecting DB");					
			/**
			 * loading driver
			 * to run code in IDE we add-> jar file(ojdbc6 in case of oracle)
			 * to run code from cmd -> we add classpath
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver loaded");
			
			
			
					
		 conn =DriverManager.getConnection("jdbc:oracle:thin:@//Jaya:1521/XE", "jayaDB","oracle");
		// When we made connection with oracle , oracle internally check listner class for details-
			
					/*
					 * listner.ora (C:\oraclexe\app\oracle\product\11.2.0\server\network\ADMIN\listner.ora)
					 * 
					 *  (DESCRIPTION = (ADDRESS = (PROTOCOL = TCP)
					 *  (HOST = Jaya)(PORT = 1521))
					 *   (CONNECT_DATA = (SERVER = DEDICATED) (SERVICE_NAME = XE)
					 * ) )
					 */
		 
		 
		 
			
			Statement st=conn.createStatement();
			
			ResultSet rs= st.executeQuery("select ename,sal from emp");
			
			while(rs.next())
			{
				System.out.println("name:"+rs.getString(1)+" Sal:"+rs.getInt(2));
			}
			
			
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println("cannot load driver class");
			
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
			if(conn!=null)
			{
				conn.close();
			}
			
		}
		
	}

}
