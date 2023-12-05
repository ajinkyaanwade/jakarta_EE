<<<<<<< HEAD


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class IncludedServ
 */
public class IncludedServ extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			PrintWriter pw=response.getWriter();
			pw.println("<i><u>inside included  servlet</i></u><br>");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
=======


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class IncludedServ
 */
public class IncludedServ extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			PrintWriter pw=response.getWriter();
			pw.println("<i><u>inside included  servlet</i></u><br>");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
>>>>>>> 4dac96f3a89beae578719e9219ab48cf9fcc190f
