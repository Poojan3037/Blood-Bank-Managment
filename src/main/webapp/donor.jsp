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
<title>Donor</title>

<%@ include file="components/boot.jsp"%>

</head>
<body>

	<%@ include file="components/navbar.jsp"%>

	<div class="container text-center mt-5 mb-5">
		<img src="pics/blood-bag.png" style="width: 200px; height: 200px">
	</div>

	<div class="container mt-6">
		<div class="row">
			<%
			List<BloodBank> list = (List<BloodBank>) session.getAttribute("bloodBankList");

			for (BloodBank bank : list) {
			%>
			<div class="col-md-6 mt-4 mb-4">
				<div class="card">
					<form method="post" action="DonnorRequestServlet">
						<input type="hidden" name="bloodCampID"
							value="<%=bank.getBankid()%>">
						<h4 class="card-header"><%=bank.getBankName()%></h4>
						<div class="card-body">
							<%
							City city = (City) bank.getCity();
							%>
							<h5 class="card-title"><%=bank.getBankAddress()%></h5>
							<h5 class="card-title"><%=city.getCname()%></h5>
							<p class="card-text">
								Open :
								<%=bank.getBankOpen()%></p>
							<p class="card-text">
								Close :
								<%=bank.getBankClose()%></p>
							<p class="card-text">
								Contact us :
								<%=bank.getNumber()%></p>
						</div>
						<div class="card-footer text-center">
							<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
					</form>
				</div>
			</div>
			<%
			}
			%>
		</div>
	</div>

	<%@ include file="components/footer.jsp"%>

</body>
</html>