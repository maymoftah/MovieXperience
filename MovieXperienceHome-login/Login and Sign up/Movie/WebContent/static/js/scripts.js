// Empty JS for your own code to be here

/*function validatePwd() {
var invalid = " "; // Invalid character is a space
var minLength = 6; // Minimum length
var pw1 = document.myForm.password.value;
var pw2 = document.myForm.password2.value;
// check for a value in both fields.
if (pw1 == '' || pw2 == '') {
alert('Please enter your password twice.');
return false;
}



}*/
var invalid=0;
function validation(form){
	
	invalid=0;
	
	//email id validation
	if(form.emailid.value.indexOf("@") == -1){
		document.getElementById("InvalidEmail").innerHTML = "Invalid Email id";
		//return false;
		invalid += 1;
	}
	else{
		document.getElementById("InvalidEmail").innerHTML = "";
	}
	
	
	//firstname validation
	if(form.firstname.value == ""){
		document.getElementById("InvalidFirstName").innerHTML = "You must type in your First Name";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidFirstName").innerHTML = "";
	}
	
	//lastname validation
	if(form.lastname.value == ""){
		document.getElementById("InvalidLastName").innerHTML = "You must type in your last Name";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidLastName").innerHTML = "";
	}
	
	
	//password validation
	//var re = /^[a-zA-Z]\w{7,14}$/;
	var re = /^[a-zA-Z][a-zA-Z0-9_@./#&+-]{7,14}$/;
	if(!re.test(form.password.value)){
		document.getElementById("InvalidPassword").innerHTML = "Invalid Password.";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidPassword").innerHTML="";
	}
	
	
	//repeat password validation
	if(form.password.value != form.passwordtwo.value){
		document.getElementById("InvalidRepeatPassword").innerHTML="Passwords do not match";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidRepeatPassword").innerHTML="";
	}
	
	
	
	if(invalid != 0){
		return false;
	}
	
	else
	{
		return true;
	}
}

var invalid1=0;
function validation1(form){
	invalid1=0;
	
	//email id validation
	if(form.emailid1.value.indexOf("@") == -1){
		document.getElementById("InvalidEmail1").innerHTML = "Invalid Email id";
		invalid1 += 1;
	}
	else{
		document.getElementById("InvalidEmail1").innerHTML = "";
	}
	
	
	//password validation
	//var re1 = /^[a-zA-Z]\w{7,14}$/;
	var re1 = /^[a-zA-Z][a-zA-Z0-9_@./#&+-]{7,14}$/;
	if(!re1.test(form.password1.value)){
		document.getElementById("InvalidPassword1").innerHTML = "Invalid Password.";
		invalid1 += 1;
	}
	else{
		document.getElementById("InvalidPassword1").innerHTML="";
	}
	
	
	if(invalid1 != 0){
		return false;
	}
	
	else
	{
		return true;
	}
}