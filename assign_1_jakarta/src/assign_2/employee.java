package assign_2;

import java.sql.*;
import java.util.*;
public class employee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the desig");
		String desig=sc.nextLine();
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			PreparedStatement pst=con.prepareStatement("select * from employee where desig=?");
			pst.setString(1, desig);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
