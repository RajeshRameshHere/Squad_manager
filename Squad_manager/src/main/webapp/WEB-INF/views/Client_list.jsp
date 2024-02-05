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
<form action="clientlist" method="post">
${msg} 
<table border="1">
<tr>
<th>First Name</th>
<th>Second Name</th>
<th>Email</th>
<th>Mobile</th>

<th>Company</th>
 <th>Source</th>
  <th>Move to Lead</th>
 
 
  <th>Generate Bill</th>
  
 

</tr>


		<c:forEach var="user" items="${client}">
		    <tr>
		        <td><a href="client_details?id=${user.id}">${user.firstName} </a></td>
		        <td>${user.secondName}</td>
		        <td> <a href="dispatchEmail?${user.email}"></a>${user.email}</td>
		        <td>${user.mobile}</td>
		        <td>${user.company}</td>
		        <td>${user.source}</td>
		         <td><a href="move?id=${user.id }">move</a></td>
		        
		        <td> <a href="billing?id=${user.id}">Bill</a></td>
		        
		       
		        
		    </tr>
		</c:forEach>

</table>
<c:out value="All Contact Details"></c:out>

</form>
</body>

</html>
