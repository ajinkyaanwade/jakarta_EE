package day_sql_injection;

import java.sql.*;
import java.util.*;
public class app4 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			System.out.println("Implementation class is/t"+con.getClass()); 
			PreparedStatement pst=con.prepareStatement("select count(*) from myaccount where uname= ? and password=?");
			System.out.println("enter username and password");
			Scanner sc=new Scanner(System.in);
			String uname=sc.next();
			String password=sc.next();
			pst.setString(1,uname);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			System.out.println("Total no. of records matching with the condition are \t"+count);
		}

		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}	


