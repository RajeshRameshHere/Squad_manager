<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="pdf_bill"  method="post">
<pre>
		<label >Contact ID: <input type="number" name="id" value="${uData.id}" readonly> </label>
		<label >First Name: <input type="text" name="firstName" value="${uData.firstName}" readonly> </label>
		<label >Second Name:<input type="text" name="secondName" value="${uData.secondName}" readonly> </label>
		<label >Email:<input type="text" name="email" value="${uData.email}" readonly>      </label> 
		<label >Phone:  <input type="text" name="mobile" value="${uData.mobile}" readonly>  </label> 
		<label >Company:    <input type="text" placeholder="Company" name="company" value="${uData.company}" readonly ></label>
		<label>Product:<input type="text" name="product"> </label>
		<label>Amount:<input type="number" name="amount"> </label>
		<input type="submit" value="Generate Bill"> 
		
		
</pre>
</form>
</body>
</html>