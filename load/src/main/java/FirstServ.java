

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServ
 */
public class FirstServ extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	static
	{
		System.out.println("LoadServ1 has been loaded");
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
			pw.println("Welcome to LoadServ1");
			pw.println("<br>"); // generating html dynamically
			pw.println("All the very best");
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
