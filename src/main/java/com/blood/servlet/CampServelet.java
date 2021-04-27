package com.blood.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blood.entities.Camp;
import com.blood.helper.Factory;
import com.mysql.cj.xdevapi.SessionFactory;

@WebServlet("/CampServelet")
public class CampServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("cname");
		String add=request.getParameter("cadd");
		String city=request.getParameter("ccity");
		String open=request.getParameter("copen");
		String date=request.getParameter("cdate");		
		String phone=request.getParameter("cphone");
		String org=request.getParameter("corg");
	
		
		Camp c=new Camp(name,add,phone,open,date,city,org);
		
		Session session=Factory.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
				
		session.save(c);
		
		tx.commit();
		session.close();
		
		response.sendRedirect("admin.jsp");
	}

}
