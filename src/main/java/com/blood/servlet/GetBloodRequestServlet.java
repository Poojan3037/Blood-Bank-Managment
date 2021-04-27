package com.blood.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.blood.dao.BloodBankDao;
import com.blood.entities.BloodBank;
import com.blood.entities.BloodReciver;
import com.blood.entities.City;
import com.blood.entities.User;
import com.blood.helper.Factory;

@WebServlet("/GetBloodRequestServlet")
public class GetBloodRequestServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		String blood=request.getParameter("blood");
		String city=request.getParameter("city");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String open=request.getParameter("open");
		String close=request.getParameter("close");
		int number=Integer.parseInt(request.getParameter("number"));
		
		HttpSession ses=request.getSession();
		User user=(User)ses.getAttribute("currentUser");
		

		
		
		
		
		BloodReciver reciver=new BloodReciver(blood,name,address,open,close,number,city,user);
	
		
		Session session=Factory.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(reciver);
		
		tx.commit();
		session.close();
		
		
		ses.setAttribute("msg", "Your blood receiving request made successfully....");
		response.sendRedirect("home.jsp");
		
		
	}

}
