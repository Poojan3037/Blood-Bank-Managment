package com.blood.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.blood.entities.Donnor;
import com.blood.helper.Factory;

@WebServlet("/GetBloodSevlet")
public class GetBloodSevlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bloodGroup = request.getParameter("userBloodGroup");
		String city = request.getParameter("city");

		Session session = Factory.getFactory().openSession();

		String hql = "select distinct * from donnor where dBlood = :g and city = :c";
		SQLQuery query = session.createSQLQuery(hql);
		query.addEntity(Donnor.class);
		query.setParameter("g", bloodGroup);
		query.setParameter("c", city);

		List<Donnor> list = query.list();

		session.close();

		if (list == null) {

		} else {

			HttpSession ses = request.getSession();
			ses.setAttribute("bankList", list);
			response.sendRedirect("bloodrequest.jsp");
		}

	}

}
