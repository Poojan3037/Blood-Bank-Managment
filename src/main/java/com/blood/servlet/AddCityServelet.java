package com.blood.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blood.entities.City;
import com.blood.helper.Factory;


@WebServlet("/AddCityServelet")
public class AddCityServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String city=request.getParameter("city");
		
		City c=new City(city);
		
		Session session=Factory.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(c);
		
		tx.commit();
		session.close();
		
		response.sendRedirect("admin.jsp");
				
		
	}

}
