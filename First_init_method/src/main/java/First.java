<<<<<<< HEAD


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet 
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
		pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		pw.println("Config parameter value  "+config.getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
		this.config=config;
	}

	

}
=======


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet 
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
		pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		pw.println("Config parameter value  "+config.getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
		this.config=config;
	}

	

}
>>>>>>> 4dac96f3a89beae578719e9219ab48cf9fcc190f
