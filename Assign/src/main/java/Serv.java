

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/**
 * Servlet implementation class Serv
 */
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<String> list=new ArrayList<String>();
		list.add("Ajinkya");
		list.add("Sushil");
		list.add("Shubham");
		list.add("Akshay");
		list.add("Abhishek");
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
		PrintWriter pw=response.getWriter();
		pw.println("Session Created");
		//RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
		//rd.forward(request, response);
	}

}
