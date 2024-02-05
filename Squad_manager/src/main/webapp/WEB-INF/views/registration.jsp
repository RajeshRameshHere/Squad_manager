<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@include file="menu.jsp" %>
    
<!DOCTYPE html>

<

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="get">
<pre>
<div>
		<label style="margin-right: 10px;">First Name: <input type="text" placeholder="First Name" name="firstName" > </label>
		<label style="margin-right: 10px;">Second Name:<input type="text" placeholder="Second Name" name="secondName" ></label>
		<label style="margin-right: 10px;">Email:      <input type="email" placeholder="Email" name="email" ></label>
		<label style="margin-right: 10px;">Phone:      <input type="number" placeholder="Mobile" name="mobile" ></label>
		<label style="margin-right: 10px;">Company:    <input type="text" placeholder="Company" name="company" ></label>
		<label for="OptionsSelect" style="margin-right: 10px;">Source:     <select id="OptionsSelect" name="source" >
						<option value=""> </option>
						<option value="advertisement">advertisement </option>
						<option value="News">News </option>
						<option value="Social Media">Social Media </option>
						<option value="Friend">Friend </option>
						<option value="Offical Website">Official Website</option>
			
</select>
                
<label style="margin-right: 10px;"><input type="submit" value="save"></label> 

</div>
</pre>
</form>
</body>
</html>