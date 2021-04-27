
<%@page import="com.blood.entities.User"%>
<%
User user1 = (User) session.getAttribute("currentUser");
%>



<!--NavBar-->


	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Blood Bank Managemenr System</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<%
		if(user1!=null){
		%>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="home.jsp">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="camp.jsp">Camp Schedule</a></li>
		
			</ul>
			<form class="form-inline ">
				<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="<%= user1.getRole().equals("admin")?"admin.jsp":"home.jsp" %>"><%= user1.getName() %>
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a></li>
			</ul>
			</form>
		</div>
 		<%
		}
 		%>
	</nav>
	
<!--Nav Bar End-->
