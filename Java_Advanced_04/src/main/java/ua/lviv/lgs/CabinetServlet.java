package ua.lviv.lgs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/Cabinet")
public class CabinetServlet extends HttpServlet {

	/**
	 * I have no idea why this is needed but whatever.
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = null;
		
		try {
			user = (User) request.getSession().getAttribute("user");
			
			request.setAttribute("name", user.getName());
			request.setAttribute("email", user.getEmail());
			request.setAttribute("money", user.getMoney());
			request.setAttribute("subscriptions", user.getSubscriptions());
			
			request.getRequestDispatcher("/cabinet.jsp").forward(request, response);
			
		} catch (NullPointerException e) {
			response.sendRedirect("/Java_Advanced_04/MainPage");
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = (User) request.getSession().getAttribute("user");
		
		user.addMoney(Double.parseDouble(request.getParameter("money")));
		
		response.sendRedirect("/Java_Advanced_04/Cabinet");
		
	}
	
}