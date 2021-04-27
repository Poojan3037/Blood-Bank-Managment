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
<%@ include file="components/boot.jsp"%>

<title>Admin</title>
</head>
<body>
	<%@ include file="components/navbar.jsp"%>

	<%@ include file="components/message.jsp"%>

	<div class="container mb-5 mt-5" >
		<h3 class="display-3 text-center">Admin Pannel</h3>
	</div>

	<div class="container mb-5">
		<div class="row">
			<div class="col-md-4 main-box text-center" data-toggle="modal" data-target="#cityModal">
				<img alt="" src="pics/1.png" style="width: 300px; height: 300px">
				<h5 class="display-4">Add City</h5>
			</div>
			<div class="col-md-4 main-box text-center" data-toggle="modal"
				data-target="#bloodBankModal">
				<img alt="" src="pics/2.png" style="width: 300px; height: 300px">
				<h5 class="display-4">Add Blood Bank</h5>
			</div>
			<div class="col-md-4 main-box text-center" data-toggle="modal" data-target="#campModal" >
				<img alt="" src="pics/3.png" style="width: 300px; height: 300px">
				<h6 class="display-4 ">Add Camp</h6>
			</div>
		</div>
	</div>


	<%@ include file="components/footer.jsp"%>


	<!--
		city modal 
	 -->

	<!-- Modal -->
	<div class="modal fade" id="cityModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">City</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>

				<div class="modal-body">
					<form action="AddCityServelet" method="post">
						<div class="form-group">
							<label for="city">Add Your City</label> <input type="text"
								class="form-control" id="city" name="city"
								aria-describedby="emailHelp">
						</div>
						<button type="submit" class="btn btn-outline-dark">Submit</button>
					</form>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>


	<!--
		blood bank modal 
	 -->

	<!-- Modal -->
	<div class="modal fade" id="bloodBankModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Add Blood Bank</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="AddBloodBankServlet" method="post">
						<div class="form-group">
							<label for="bname">Blood Bank Name</label> <input type="text"
								class="form-control" id="bname" name="bname"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">Address</label>
							<textarea class="form-control" id="exampleFormControlTextarea1"
								rows="3" name="badd"></textarea>
						</div>
						<div class="form-group">
							<label for="bphone">Phone Number</label> <input type="text"
								class="form-control" id="bphone" name="bphone"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label>Open</label> <select class="form-control" name="bopen">
								<option value="8:00am">8:00 am</option>
								<option value="9:00am">9:00 am</option>
								<option value="10:00am">10:00 am</option>
								<option value="11:00am">11:00 am</option>
							</select>
						</div>
						<div class="form-group">
							<label>Close</label> <select class="form-control" name="bclose">
								<option value="5:00pm">5:00 pm</option>
								<option value="6:00pm">6:00 pm</option>
								<option value="7:00pm">7:00 pm</option>
								<option value="8:00pm">8:00 pm</option>
							</select>
						</div>
						<div class="form-group">
							<label>City</label> <select class="form-control" name="bcity">
								<%
								CityDao dao = new CityDao(Factory.getFactory());
								List<City> cities = dao.getAllCities();

								for (City city : cities) {
								%>
								<option value="<%=city.getCid()%>"><%=city.getCname()%></option>
								<%
								}
								%>
							</select>
						</div>
						<button type="submit" class="btn btn-outline-dark">Submit</button>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>


	<!--
		camp modal 
	 -->

	<!-- Modal -->
	<div class="modal fade" id="campModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Add Camp</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="CampServelet" method="post">
						<div class="form-group">
							<label for="bname">Camp Name</label> <input type="text"
								class="form-control" id="bname" name="cname"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">Camp Address</label>
							<textarea class="form-control" id="exampleFormControlTextarea1"
								rows="3" name="cadd"></textarea>
						</div>
						<div class="form-group">
							<label for="bphone">City</label> <input type="text"
								class="form-control" id="bphone" name="ccity"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label>Open</label> <select class="form-control" name="copen">
								<option value="8:00am">8:00 am</option>
								<option value="9:00am">9:00 am</option>
								<option value="10:00am">10:00 am</option>
								<option value="11:00am">11:00 am</option>
							</select>
						</div>
						<div class="form-group">
							<label for="cdate">Date</label> <input type="date"
								class="form-control" id="cdate" name="cdate"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="cphone">Phone</label> <input type="text"
								class="form-control" id="cphone" name="cphone"
								aria-describedby="emailHelp">
						</div>

						<div class="form-group">
							<label for="bphone">Organizior</label> <input type="text"
								class="form-control" id="bphone" name="corg"
								aria-describedby="emailHelp">
						</div>
						<button type="submit" class="btn btn-outline-dark">Submit</button>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>