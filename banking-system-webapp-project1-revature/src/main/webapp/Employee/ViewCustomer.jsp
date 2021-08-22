<%@page import="com.revature.bms.model.Customer"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="AfterLoginEmp.html">Home <span class="sr-only"></span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Employee/UpdateEmp.html">Update</a>
      </li>
       </li>
       <li class="nav-item">
        <a class="nav-link" href="DisplayEmployee">Get Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Employee/AddCustomer.html">Add Customer</a>
   
     <li class="nav-item">
        <a class="nav-link" href="../PrintCustomerController">View/Delete Customer</a>
     </li>
     
      
    </ul>
  </div>
</nav>
<center><h2>Customer details</h2></center>
  <div class="row">
  <div class="col-sm-2"></div>
  <div class="col-sm-8">
	<%
		List<Customer> customers = (List<Customer>) session.getAttribute("allCustomers");
		%>
		<table cellpadding="10" cellspacing="10">
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Registration Date</th>
			<th>Delete</th>
			<%
			for (int i = 0; i < customers.size(); i++) {
				Customer customer = customers.get(i);
			%>
			<tr>
				<td><%= customer.getCustomerId() %></td>
				<td><%= customer.getCustomerName() %></td>
				<td><%= customer.getEmailId() %></td>
				<td><%= customer.getMobileNumber() %></td>
				<td><%= customer.getRegistrationDate() %></td>
				<td><a href="DeleteCustomerController?customerId=<%= customer.getCustomerId() %>">Delete</a></td>
			</tr>
			<%
			}
			%>
	
		</table>
	</div>
	 <div class="col-sm-2"></div>
	 </div>
	    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>