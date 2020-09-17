package ua.lviv.lgs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/AddMagazine")
public class AddMagazineServlet extends HttpServlet {

	/**
	 * I have no idea why this is needed but whatever.
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if(!((User) request.getSession().getAttribute("user")).isAdmin())
				request.getRequestDispatcher("/mainPage.jsp").forward(request, response);
			
			request.getRequestDispatcher("/addMagazine.jsp").forward(request, response);
		} catch (NullPointerException e) {
			response.sendRedirect("/Java_Advanced_04/MainPage");
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String text = request.getParameter("text");
		double price = Double.parseDouble(request.getParameter("price"));
		
		Magazine magazine = new Magazine(name, text, price);
		
		Magazines magazines = Magazines.getMagazines();
		
		magazines.addMagazine(magazine);
	
		response.sendRedirect("/Java_Advanced_04/AddMagazine");
		
	}

}