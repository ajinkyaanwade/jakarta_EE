package day_sql_injection;
import java.sql.*;
import java.util.*;
public class app1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			System.out.println("Implementation class is\t"+con.getClass()); 
			Statement st=con.createStatement();
			System.out.println("enter username and password");
			Scanner sc=new Scanner(System.in);
			String uname=sc.next();
			String password=sc.next();
			ResultSet rs=st.executeQuery("select count(*) from myaccount where uname='"+uname+"' and password='"+password+"'");
			rs.next();
			int count=rs.getInt(1);
			System.out.println("Total no. of records matching with the condition are\t"+count);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}	


					