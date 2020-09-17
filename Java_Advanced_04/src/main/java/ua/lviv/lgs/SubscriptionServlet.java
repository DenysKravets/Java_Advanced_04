package ua.lviv.lgs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/Subscription")
public class SubscriptionServlet extends HttpServlet {

	/**
	 * I have no idea why this is needed but whatever.
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String type = request.getParameter("type");
			
			User user = (User) request.getSession().getAttribute("user");
			Magazine magazine = Magazines.getMagazines().getMagazineByName(request.getParameter("name"));
			
			switch(type) {
			case "subscribe":{
				
				if(!user.subscribed(magazine)) {
					if(user.pay(magazine.getPrice())) {
						user.addSubscription(magazine);
					}
				}
				
				response.sendRedirect("/Java_Advanced_04/MainPage");
				break;
			}

			case "unsubscribe":{
				
				if(user.subscribed(magazine)) {
					if(user.pay(magazine.getPrice())) {
						user.cancelSubscription(magazine);
					}
				}
				
				response.sendRedirect("/Java_Advanced_04/MainPage");
				break;
			}
			}
		} catch (NullPointerException e) {
			response.sendRedirect("/Java_Advanced_04/MainPage");
		}
		
	}
	
}
