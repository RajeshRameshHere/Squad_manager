<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update user</title>
</head>
<body>
<form action="update_user" method="get">
<input type="hidden" name="id" value="${user.id }">
<table >

<tr> <td>First Name:</td> 	<td> <input type="text"	 	name="firstName" 	value="${user.firstName }"> 	</td> </tr> 
<tr> <td>Second Name:</td>  <td> <input type="text" 	name="secondName" 	value="${user.secondName }">	</td> </tr> 
<tr> <td>Email:</td>		<td> <input type="email" 	name="email" 		value="${user.email }">			</td> </tr> 
<tr> <td>Mobile:</td> 		<td> <input type="number" 	name="mobile" 		value="${user.mobile }">		</td></tr> 
<tr> <td>Company:</td> 		<td> <input type="text" 	name="company" 		value="${user.company }" >		</td></td> </tr> 
<tr> <td>Source:</td> 		<td> <input type="text"		name="source" 		value="${user.source }" readonly></td></td> </tr> 



</table>


<input type="submit" value="upadte">
</form>
</body>
</html>