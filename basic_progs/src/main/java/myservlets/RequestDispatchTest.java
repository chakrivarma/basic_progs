package myservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatchTest extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
		req.setAttribute("myObj","chaitanya");
		res.setContentType("text/html");
		dispatcher.forward(req, res);
	}
}
