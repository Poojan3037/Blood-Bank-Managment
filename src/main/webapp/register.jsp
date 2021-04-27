<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<%@ include file="components/boot.jsp"%>
<link href="css/reg.css" rel="stylesheet" type="text/css">
</head>
<body>


	<%@ include file="components/navbar.jsp"%>


	<%@ include file="components/message.jsp"%>

	<!--Registration Form For Donor-->
	<div class="container">
		<div class="col-ld-12 well">
			<div class="row0">
				<div class="container text-center">
					<img src="pics/add-user.png" style="width: 100px; height: 100px">
				</div>
				<h1 class="well">Donor Registration</h1>
				<form method="post" action="RegisterServlet">
					<div class="col-sm-12">
						<!--INPUT NAME-->

						<div class="row">
							<div class="col-sm-12 form-group">
								<label>Enter Name</label> <input type="text" name="userName"
									placeholder="Enter  Name Here.." class="form-control" required>
							</div>
						</div>

						<!--INPUT PhoneNo. & Email-->
						<div class="form-group">
							<label>Email Address</label> <input type="email" name="userEmail"
								placeholder="Enter Email Address Here.." class="form-control">
						</div>


						<!--Password & ReP-->
						<div class="form-group">
							<label>Password</label> <input type="password"
								name="userPassword" placeholder="Enter Password Here.."
								class="form-control" required>
						</div>

						<div class="form-group">
							<label>Phone Number</label> <input type="text" name="userPhone"
								placeholder="Enter Phone Number Here.." class="form-control"
								required>
						</div>

						<!--Input Address -->
						<div class="form-group">
							<label>Address</label>
							<textarea placeholder="Address" rows="3" class="form-control"
								name="userAddress" required>Type Address Here.....</textarea>
						</div>

						<!--City & State-->
						<div class="row">
							<div class="col-sm-4 form-group">
								<label>City</label> <input type="text" name="userCity"
									placeholder="Enter City Name Here.." class="form-control"
									required>
							</div>
						</div>


						<!--Gender-->
						<div class="form-group">
							<label>Gender :</label> <label
								class="form-check form-check-inline"> <input
								class="form-check-input" type="radio" name="userGender"
								value="male" required> <span class="form-check-label">
									Male </span>
							</label> <label class="form-check form-check-inline"> <input
								class="form-check-input" type="radio" name="userGender"
								value="female" required> <span class="form-check-label">
									Female</span>
							</label>
						</div>



						<!--BLood Group -->
						<div class="form-group">
							<label for="bloodgroup">Blood Group</label> <select
								class="form-control" id="bloodgroup" required
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

						<!-- DOB & Last Date input -->

						<div class="form-group">
							<label class="control-label" for="dob">Date Of Birth</label> <input
								class="form-control" id="dob" name="userdob"
								placeholder="MM/DD/YYY" type="date" required />
						</div>


						<!--Other Information-->
						<div class="form-group">
							<span>Did you ever donate blood before?</span>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="yes" class="form-check-input" name="userBloodBefor">Yes
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="no" class="form-check-input" name="userBloodBefor">No
								</label>
							</div>
						</div>
						<div class="form-group">
							<span>Do you suffer of any diseases?</span>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="yes" class="form-check-input" name="userDicease">Yes
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="no" class="form-check-input" name="userDicease">No
								</label>
							</div>
						</div>
						<div class="form-group">
							<span>Have you ever had positive Blood test for HbsAg,
								Hcv, HIV?</span>

							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="yes" class="form-check-input" name="userHiv">Yes
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="no" class="form-check-input" name="userHiv">No
								</label>
							</div>
						</div>
						<div class="form-group">
							<span>Do you take medication?</span>

							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="yes" class="form-check-input" name="userMediciation">Yes
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="no" class="form-check-input" name="userMediciation">No
								</label>
							</div>
						</div>

						<div class="form-group">
							<label>Description (If any illness....)</label>
							<textarea placeholder="Description" rows="3" class="form-control"
								name="userDescription" required>"Descript about your health....".....</textarea>
						</div>
						<!--Form Complete-->

						<!--Buttons-->
						<div class="button1">
							<button type="submit" class="btn">Submit</button>
							<button type="reset" class="btn">Reset</button>
							<button type="button" class="btn">
								<a href="index.jsp">LogIn</a>
							</button>
						</div>


					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>