<<<<<<< HEAD
import java.sql.*;
public class App1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
while(rs.next())
{
	int no=rs.getInt("deptno");
	String name=r.getString("dname");
	String add=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+add);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}	


=======
import java.sql.*;
public class App1 
{
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
System.out.println("Implementation class is\t"+con.getClass()); 
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept");
while(rs.next())
{
	int no=rs.getInt("deptno");
	String name=rs.getString("dname");
	String add=rs.getString("loc");
	System.out.println(no+"\t"+name+"\t"+add);
}
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
}	


>>>>>>> 6b33ebcd7be50822d2d403c69ea1a803a33d8867
					