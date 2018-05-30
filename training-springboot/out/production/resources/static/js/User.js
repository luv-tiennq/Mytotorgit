function myFunction() {
    // Get the checkbox
    var checkBox = document.getElementById("checkCompanyRegister");
    // Get the output text
    var text = document.getElementById("text");

    document.getElementById("checkCompanyUnregister").disabled = true;

    // If the checkbox is checked, display the output text
    if (checkBox.checked == true) {
        text.style.display = "block";
        document.getElementById("checkCompanyUnregister").disabled = true;
    } else {
        text.style.display = "none";
        document.getElementById("checkCompanyUnregister").disabled = false;
    }
}