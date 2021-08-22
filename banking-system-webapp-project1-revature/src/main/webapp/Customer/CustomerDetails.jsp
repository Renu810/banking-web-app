<%@page import="com.revature.bms.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <script type="text/javascript" src="js/SignUpCustomer.js"></script>

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
        <a class="nav-link" href="AfterLoginCustomer.html">Home <span class="sr-only"></span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Customer/Update.html">Update Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="DisplayCustomer">View Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ViewBalance">View Balance</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Customer/Deposite.html">Deposit</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="Customer/Withdraw.html">Withdraw</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="Customer/TransferAmount.html">Transfer Amount</a>
      </li>
   
    </ul>
  </div>
</nav>


     <%Customer customer=(Customer)session.getAttribute("customers");	%>

<center><h2>Your details</h2></center>
  <div class="row">
  <div class="col-sm-2"></div>
  <div class="col-sm-8">

	
	<table cellpadding="10" cellspacing="10">
				<th>Customer Id</th>
				<th>Customer Name</th>
				<th>Email </th>
				<th>Mobile</th>
		        <th>Balance</th>
		        <th>Gender</th>
		        <th>Registration Date</th>
				
			

			<tr>
				<td><%= customer.getCustomerId()%></td>
				<td><%= customer.getCustomerName()%></td>
				<td><%= customer.getEmailId() %></td>
				<td><%= customer.getMobileNumber() %></td>
				<td><%= customer.getBalance() %></td>
				<td><%= customer.getGender() %></td>
				<td><%= customer.getRegistrationDate()%></td>
				
				

			</tr>
			


 </div>

<div class="col-sm-2"></div>


</div>
	</table>






  
       <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>