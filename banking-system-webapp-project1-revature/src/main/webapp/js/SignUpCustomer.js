function validateSignUpForm(){
	
var username=document.getElementById("username").value
var password=document.getElementById("password").value
var confirmpassword=document.getElementById("confirmpassword").value
var emailid=document.getElementById("emailid").value
var balance=document.getElementById("balance").value
var mobile=document.getElementById("mobile").value
var gender = document.querySelector( 'input[name="gender"]:checked');

var nameError =document.getElementById("nameError");
var passError =document.getElementById("passError");
var cpassError =document.getElementById("cpassError");
var emailError =document.getElementById("emailError");
var balanceError =document.getElementById("balanceError");
var mobileError =document.getElementById("mobileError");
var genderError =document.getElementById("genderError");



document.getElementById("nameError").innerHTML=''
document.getElementById("passError").innerHTML=''
document.getElementById("cpassError").innerHTML=''
document.getElementById("emailError").innerHTML=''
document.getElementById("balanceError").innerHTML=''
document.getElementById("mobileError").innerHTML=''



if(username.length == 0){
	nameError.innerHTML="<i><u>Please Enter Name";
	return false;
	
}else if(password.length == 0){
	
	passError.innerHTML="<i><u>Please Enter Password";
	
	return false;
}else if(confirmpassword.length == 0){
	cpassError.innerHTML="<i><u>Please Enter Confirm Password";
	return false;
}else if(confirmpassword != password){
    alert("Password And Confirm Password Must be Same");
	return false;
}
else if(emailid.length == 0){
	emailError.innerHTML="<i><u>Please Enter Email";
	return false;
}else if(balance.length == 0){
	balanceError.innerHTML="<i><u>Please Enter Balance";
	return false;
}else if(mobile.length == 0){
	mobileError.innerHTML="<i><u>Please Enter Mobile Number";
	return false;
}else if(mobile.length > 10 || mobile.length < 10){
	alert("Mobile Number Should be 10 Digits only");
	return false;
}else if(gender == null){
	genderError.innerHTML="<i><u>Please Select Gender";
	return false;


}
}