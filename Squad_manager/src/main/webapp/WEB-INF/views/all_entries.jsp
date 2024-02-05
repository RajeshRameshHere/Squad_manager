<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@include file="menu.jsp" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Record Data</title>
</head>
<body>

<a href="register">New Lead</a>

<table border="1">
<tr>
<th>First Name</th>
<th>Second Name</th>
<th>Email</th>
<th>Mobile</th>

<th>Company</th>
 <th>Source</th>
 <th>Delete</th>
 <th>Update</th>
</tr>


		<c:forEach var="user" items="${entries}">
		    <tr>
		        <td><a href="details?id=${user.id}">${user.firstName} </a></td>
		        <td>${user.secondName}</td>
		        <td>${user.email}</td>
		        <td>${user.mobile}</td>
		        <td>${user.company}</td>
		        <td>${user.source}</td>
		        <td> <a href="delete?id=${user.id}">Delete</a></td>
		        <td> <a href="update?id=${user.id}">Update</a></td>
		        
		        
		    </tr>
		</c:forEach>

</table>
${msg} <br>

<c:out value="All Registred User Details"></c:out>
</body>
</html>
