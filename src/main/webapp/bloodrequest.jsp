<%@page import="java.util.ArrayList"%>

<%@page import="com.blood.entities.Donnor"%>
<%@page import="com.blood.entities.BloodBank"%>
<%@page import="com.blood.entities.City"%>
<%@page import="java.util.List"%>
<%@page import="com.blood.dao.CityDao"%>
<%@page import="com.blood.helper.Factory"%>
<%@page import="com.blood.entities.User"%>
<%
User user = (User) session.getAttribute("currentUser");

if (user == null) {
	response.sendRedirect("index.jsp");
}
%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Rquest</title>

<%@ include file="components/boot.jsp"%>
</head>
<body>


	<%@ include file="components/navbar.jsp"%>

	<div class="container text-center mt-4 mb-4">
		<img src="pics/blood-donation.png" style="width: 200px; height: 200px">
	</div>


	<div class="container myt-4 mb-4">
		<div class="row">
			<%
			List<String> bank = new ArrayList<String>();
			List<Donnor> list = (List<Donnor>) session.getAttribute("bankList");
			for (Donnor d : list) {
				if (bank.contains(d.getBankName())) {

				} else {
			%>
			<div class="col-md-6 mt-4 mb-4">
				<div class="card">
					<form method="post" action="GetBloodRequestServlet">
						<input type="hidden" name="id" value="<%=d.getDid()%>"> <input
							type="hidden" name="blood" value="<%=d.getdBlood()%>"> <input
							type="hidden" name="city" value="<%=d.getCity()%>"> <input
							type="hidden" name="name" value="<%=d.getBankName()%>">
						<input type="hidden" name="address"
							value="<%=d.getBankAddress()%>"> <input type="hidden"
							name="open" value="<%=d.getBankOpen()%>"> <input
							type="hidden" name="close" value="<%=d.getBankClose()%>">
						<input type="hidden" name="number" value="<%=d.getNumber()%>">
						<h4 class="card-header"><%=d.getBankName()%></h4>
						<div class="card-body">
							<h5 class="card-title"><%=d.getBankAddress()%></h5>
							<h5 class="card-title"><%=d.getCity()%></h5>
							<p class="card-text">
								Open :
								<%=d.getBankOpen()%></p>
							<p class="card-text">
								Close :
								<%=d.getBankClose()%></p>
							<p class="card-text">
								Contact us :
								<%=d.getNumber()%></p>
						</div>
						<div class="card-footer text-center">
							<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
					</form>
				</div>
			</div>
			<%
			bank.add(d.getBankName());
			}
			}
			%>
		</div>
	</div>

	<%@ include file="components/footer.jsp"%>
</body>
</html>