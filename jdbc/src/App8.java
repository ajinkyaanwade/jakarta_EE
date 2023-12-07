import java.sql.*;
public class App8
{
	public static void main(String args[])throws Exception
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			try
			{
con.setAutoCommit(false);
Statement st=con.createStatement();
int a=st.executeUpdate("update dept set loc='bombay'");
int b=st.executeUpdate("insert into dept(dname,loc) values('acc','delhi')");
con.commit();
}
catch(Exception ee)
{
	con.rollback();		
	System.out.println(ee);
}
		con.setAutoCommit(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
