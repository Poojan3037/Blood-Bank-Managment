package com.blood.servlet;

import java.io.IOException;
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
import com.blood.entities.City;
import com.blood.entities.Donnor;
import com.blood.entities.User;
import com.blood.helper.Factory;


@WebServlet("/DonnorRequestServlet")
public class DonnorRequestServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int id=Integer.parseInt(request.getParameter("bloodCampID"));
		
		BloodBankDao dao=new BloodBankDao(Factory.getFactory());
		
		BloodBank bank=dao.getCampByID(id);

		City city=(City)bank.getCity();
		
		HttpSession ses=request.getSession();
		User user=(User)ses.getAttribute("currentUser");
		
		
		Donnor donnor=new Donnor(user.getBloodGroup(),bank.getBankName(),bank.getBankAddress(),bank.getBankOpen(),bank.getBankClose(),bank.getNumber(),city.getCname(),user);
		
		Session session=Factory.getFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(donnor);
		
		tx.commit();
		
		session.close();
		
		
		ses.setAttribute("msg", "Your blood donatiton request made successfully....");
		response.sendRedirect("home.jsp");
		
	}

}
