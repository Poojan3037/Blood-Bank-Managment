<%@page import="com.blood.entities.Camp"%>
<%@page import="java.util.List"%>
<%@page import="com.blood.helper.Factory"%>
<%@page import="com.blood.dao.CampDao"%>
<%@page import="com.blood.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Camp</title>
<%
User user = (User) session.getAttribute("currentUser");

if (user == null) {
	response.sendRedirect("index.jsp");
}
%>
<%@ include file="components/boot.jsp"%>
</head>
<body>
	<%@ include file="components/navbar.jsp"%>

	<%@ include file="components/message.jsp"%>

	<%
	CampDao dao = new CampDao(Factory.getFactory());
	List<Camp> camps = dao.getAllCamps();
	%>

	<div class="container mt-5 mb-5 text-center">
		<h1 class="display-4">Camp Shedule</h1>
	</div>

	<div class="container mt-5 text-uppercase">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">No.</th>
					<th scope="col">Date</th>
					<th scope="col">Time</th>
					<th scope="col">Camp Name</th>
					<th scope="col">Address</th>
					<th scope="col">City</th>
					<th scope="col">Contact</th>
					<th scope="col">Conducted By</th>
				</tr>
			</thead>
			<tbody>
				<%
					int index=1;
				for (Camp c : camps) {
				%>
				<tr>
					<th scope="row"><%= index %></th>
					<td><%= c.getDate()%></td>
					<td><%= c.getOpen()%></td>
					<td><%= c.getName() %></td>
					<td><%= c.getAddress() %></td>
					<td><%= c.getCity() %></td>
					<td><%= c.getContact() %></td>
					<td><%= c.getOrganize() %></td>
				</tr>
				<%
				index=index+1;
				}
				%>
			</tbody>

		</table>
	</div>

</body>
</html>