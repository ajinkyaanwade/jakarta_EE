

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.BeansClass;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Server2
 */
public class Server2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Welcome to CallPojoServ1");
			pw.println("<br>"); // generating html dynamically
			BeansClass ref=new BeansClass();
			pw.println(ref.disp1());
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
