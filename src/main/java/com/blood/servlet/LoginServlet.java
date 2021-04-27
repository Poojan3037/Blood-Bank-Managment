package com.blood.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blood.dao.UserDao;
import com.blood.entities.User;
import com.blood.helper.Factory;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("E-mail");
		String password=request.getParameter("Password");
		
		UserDao dao=new UserDao(Factory.getFactory());
		
		User user=dao.getUSerByEmailPassword(email,password);
		
		if(user==null) {
			HttpSession session=request.getSession();
			session.setAttribute("msg", "Please enter valied details....");
			response.sendRedirect("index.jsp");
		}
		else {
			
			if(user.getRole().equals("admin")) {
				HttpSession session=request.getSession();
				session.setAttribute("currentUser", user);
				response.sendRedirect("admin.jsp");
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("currentUser", user);
				response.sendRedirect("home.jsp");
			}
			
			
			
		}
		
		
	}

}
