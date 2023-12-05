package question_1;
import java.sql.*;
import java.util.*;
public class student 
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter roll number");
	int rollno=sc.nextInt();
	System.out.println("enter student age");
	int age=sc.nextInt();
	System.out.println("enter student name");
	String name=sc.next();
	try
	{
		String ss="jdbc:mysql://localhost:3306/bit";
		Connection con=DriverManager.getConnection(ss,"root","root");
		PreparedStatement pst=con.prepareStatement("insert into student(rollno,name,age) values(?,?,?)");
		pst.setInt(1,rollno);
		pst.setString(2,name);
		pst.setInt(3, age);
		int col=pst.executeUpdate();
		if(col>0)
		{
			System.out.println(col+"record updated");
		}
		PreparedStatement st=con.prepareStatement("select *from student");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			int roll=rs.getInt("rollno");
			String name1=rs.getString("name");
			int age1=rs.getInt("age");
			System.out.println(rollno+"\t"+name+"\t"+age);
		}
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
