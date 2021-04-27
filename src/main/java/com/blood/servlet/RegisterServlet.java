package com.blood.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.blood.entities.User;
import com.blood.helper.Factory;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("userName");
		String email=request.getParameter("userEmail");
		String password=request.getParameter("userPassword");
		String address=request.getParameter("userAddress");
		String city=request.getParameter("userCity");
		String phoneNumber=request.getParameter("userPhone");
		String gender=request.getParameter("userGender");
		String bloodGroup=request.getParameter("userBloodGroup");
		String birthdate=request.getParameter("userdob");
		String bloodbefore=request.getParameter("userBloodBefor");
		String dicease=request.getParameter("userDicease");
		String hiv=request.getParameter("userHiv");
		String medication=request.getParameter("userMediciation");
		String desc=request.getParameter("userDescription");
		
		
		
		User user=new User(name,email,password,address,city,phoneNumber,gender,bloodGroup,birthdate,bloodbefore,dicease,hiv,medication,desc,"normal");
		
		SessionFactory factory=Factory.getFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		
		session.close();
		
				
		HttpSession ses=request.getSession();
		ses.setAttribute("msg", "Signup successfully , you can login now.......");
		response.sendRedirect("index.jsp");
		
		
		
		
	}

}
