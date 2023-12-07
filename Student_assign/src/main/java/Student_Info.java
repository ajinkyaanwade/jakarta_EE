

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Student_Info
 */
public class Student_Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bit";
			con=DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			PreparedStatement pst=con.prepareStatement("select * from students");
			ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			int roll_no=rs.getInt("rollno");
			String name=rs.getString("name");
			int  age=rs.getInt("age");
			String address=rs.getString("address");
			pw.println(name+"    "+age+"    "+address);
			pw.println("<br>");
		}

		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
	}

}
