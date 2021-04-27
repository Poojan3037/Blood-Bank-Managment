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
<title>Home</title>

<%@ include file="components/boot.jsp"%>

</head>
<body>

	<%@ include file="components/navbar.jsp"%>

	<%@ include file="components/message.jsp"%>

	<div class="container mt-5 ">
		<div class="row">
			<div class="col-md-6 text-center">
				<div data-toggle="modal" data-target="#b" class="main-box">
					<img alt="" src="pics/donor.png"
						style="width: 300px; height: 300px">
					<h5 class="display-4">I am blood donor</h5>
				</div>
			</div>
			<div class="col-md-6 text-center ">
				<div data-toggle="modal" data-target="#breciver" class="main-box">
					<img alt="" src="pics/blood-bank.png"
						style="width: 300px; height: 300px">
					<h5 class="display-4">I am blood reciver</h5>
				</div>
			</div>
		</div>
	</div>

	<div class="container mt-4 mb-4">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
			Officiis iusto eos quis a nemo maxime nostrum iste quidem. Laudantium
			sit reprehenderit dolores ea accusantium sed ratione vitae error hic
			voluptatem suscipit eum, necessitatibus sapiente aliquam corrupti
			deserunt minima, tempora eos quis! Quis soluta, quod voluptates animi
			id dicta libero labore suscipit distinctio repellat nobis,
			asperiores, commodi rem dolorem earum repellendus exercitationem a
			perspiciatis iure? Incidunt ea molestias dolore, ratione laboriosam
			quam omnis? Quaerat quis debitis voluptate hic a excepturi vitae
			ipsam doloribus fugiat odit. Quasi qui dolore, fugiat atque quam
			officia doloribus debitis recusandae! Eum deserunt dolore nostrum
			ipsam ullam nemo delectus labore excepturi neque voluptates, atque
			dolorem maxime eos quod quas quidem aperiam repudiandae natus quo ad!
			Veniam corrupti magni vero quas, omnis vitae ducimus molestias rem.
			Doloribus asperiores ratione tempora dolorum vel minima iure iste eum
			eaque. Soluta beatae accusamus reiciendis quaerat exercitationem
			labore quisquam omnis totam ut laboriosam corporis magnam molestias
			placeat voluptatibus odit, et excepturi ea eos temporibus debitis.
			Velit deserunt similique dolore voluptates esse illo? Ea sed libero
			eum, nulla totam aspernatur quia sequi iste nostrum quae dolorum
			explicabo unde commodi necessitatibus ducimus nesciunt laborum,
			mollitia doloremque nisi! Excepturi id eveniet asperiores, alias qui
			saepe laudantium ea dolorem nemo eaque facilis. Eos aliquid et iure
			soluta laboriosam, sequi laborum voluptate porro aut, cumque officiis
			suscipit impedit explicabo minima ullam repellat. Perferendis ipsa
			similique magni voluptate, assumenda libero maxime necessitatibus
			mollitia, alias doloribus vel quas, dolor nesciunt rerum voluptas.
			Eum nemo, iusto laudantium quaerat veniam, voluptates nostrum
			eligendi illo unde sapiente cupiditate, ea facilis esse architecto
			iure eaque? Illo numquam earum facere quidem eligendi neque, nulla
			illum velit sunt assumenda nesciunt odit, laborum quasi sint,
			voluptates impedit magni. Deleniti dolore cumque atque necessitatibus
			architecto sapiente tempore omnis accusamus rerum illum?
			Perspiciatis, aspernatur delectus optio nam magni officiis ipsum
			porro ut, animi sit dolor! Modi nesciunt, ex quo totam, omnis error
			nam ad, hic in voluptates vel dolores facere fugit unde porro quia
			recusandae expedita debitis mollitia deleniti voluptas? Aperiam, quia
			ipsa, repudiandae voluptate aliquam rerum voluptas mollitia sed
			expedita unde, ipsam magni? Soluta porro voluptates, obcaecati
			temporibus maxime dolores vel, odit vero sunt, cum quisquam.
			Reprehenderit architecto harum autem quidem totam perspiciatis sed
			accusantium numquam nulla. Enim non maiores optio autem, quas eius
			incidunt dicta id porro neque perspiciatis, voluptates reiciendis!
			Temporibus eum amet porro iure tempore sunt a explicabo omnis labore
			mollitia totam ullam maiores autem ratione, exercitationem illum
			iusto in necessitatibus fuga voluptates blanditiis officiis nemo
			fugiat? Culpa praesentium, temporibus officiis velit blanditiis vero
			eligendi mollitia porro quod, beatae cupiditate dolores neque sequi,
			ullam earum ad vel esse a. Illum, in! Quis, dolore. Provident,
			excepturi perferendis. Odio tempore quod porro officia non dolores.
			Obcaecati magni illo, quasi, rerum alias odit, nihil quia quod
			corrupti enim itaque aspernatur! Distinctio vero velit dignissimos,
			adipisci dolor nobis? Ratione, quibusdam! Itaque, asperiores ipsum
			nam porro, vel eligendi recusandae placeat iure reprehenderit non
			laudantium nobis ex exercitationem voluptatum enim quo alias
			dignissimos sunt laborum in beatae accusantium. Similique, aut.</p>
	</div>

	<%@ include file="components/footer.jsp"%>




	<!--
		modal for blood donor 
	 -->


	<!-- Button trigger modal -->


	<!-- Modal -->
	<div class="modal fade" id="b" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Blood Donor</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form method="post" action="DonorServlet">
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Blood
								Group</label>
							<div class="col-sm-8">
								<input type="text" readonly class="form-control-plaintext"
									name="userBlood" value="<%=user.getBloodGroup()%>">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword" class="col-sm-4 col-form-label">City</label>
							<div class="col-sm-8">
								<select class="form-control" required
									name="userCity">
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
						</div>
						<div class="text-center">
							<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
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
	 	modal for blood reciver 
	  -->


	<div class="modal fade " id="breciver" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Blood Reciver</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form method="post" action="GetBloodSevlet" >
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Select
								Blood Group</label>
							<div class="col-sm-8">
								<select class="form-control" id="bloodgroup" required
									name="userBloodGroup">
									<option value="-">-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="B+">B+</option>
									<option value="B-">B-</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="O+">O+</option>
									<option value="O-">O-</option>
								</select>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword" class="col-sm-4 col-form-label">City</label>
							<div class="col-sm-8">
								<select class="form-control" id="city" required
									name="city">
									<%
									for (City city : cities) {
									%>
									<option value="<%=city.getCname()%>"><%=city.getCname()%></option>
									<%
									}
									%>
								</select>
							</div>
						</div>
						<div class="text-center">
						<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
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