package com.blood.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.blood.entities.BloodBank;
import com.blood.helper.Factory;


@WebServlet("/DonorServlet")
public class DonorServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cid=Integer.parseInt(request.getParameter("userCity"));
		
		Session session=Factory.getFactory().openSession();
		
		String hql="from BloodBank b where b.city.cid=:id";
		
		Query query=session.createQuery(hql);
		
		query.setParameter("id", cid);
		
		List<BloodBank> list=query.list();
		
		if(list==null) {
			HttpSession ses=request.getSession();
			ses.setAttribute("NoBank", "Sorry at this thime no blood camp is availabel...");
			response.sendRedirect("donor.jsp");
			
		}else {
			HttpSession ses=request.getSession();
			ses.setAttribute("bloodBankList", list);
			response.sendRedirect("donor.jsp");
		}
		
		
		
	}

}
