package ua.lviv.lgs;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/Login")
public class LoginServlet extends HttpServlet {

	/**
	 * I have no idea why this is needed but whatever.
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Users users = Users.getUsers();
		User user = users.getUserByEmail(email);
		
		if(!user.getPassword().equals(password)) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		response.sendRedirect("/Java_Advanced_04/MainPage");
	}

}
