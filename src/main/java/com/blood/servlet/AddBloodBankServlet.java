package com.blood.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blood.entities.BloodBank;
import com.blood.entities.City;
import com.blood.helper.Factory;

@WebServlet("/AddBloodBankServlet")
public class AddBloodBankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("bname");
		String address=request.getParameter("badd");
		int phone=Integer.parseInt(request.getParameter("bphone"));
		String open=request.getParameter("bopen");
		String close=request.getParameter("bclose");
		int city=Integer.parseInt(request.getParameter("bcity"));
		
		City c=new City();
		c.setCid(city);
		
		
		BloodBank bank=new BloodBank(name,address,open,close,phone,c);
	
		
		Session session=Factory.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(bank);
		
		tx.commit();
		session.close();
		
		response.sendRedirect("admin.jsp");
		
	}

}
