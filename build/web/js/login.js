function submitForm() {
    var valueEmail = document.getElementById("email-address").value;
    var valuePassword = document.getElementById("password").value;
    if(valueEmail === "") {
        document.getElementById("error-email").innerHTML = "Email must not be empty";
        return false;
    }
    else {
        document.getElementById("error-email").innerHTML = "";
    }
    if(valuePassword.length < 6) {
        document.getElementById("error-password").innerHTML = "Password must be greater than 6 characters";
        return false;
    }
    else {
        document.getElementById("error-password").innerHTML = "";
    }
    return true;
}