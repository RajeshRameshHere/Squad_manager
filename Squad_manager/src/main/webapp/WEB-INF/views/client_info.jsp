<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Info</title>

</head>
<body>
<form action="bill" method="get"> 
 <pre>
      
		<label >First Name: ${uData.firstName} </label>
		<label >Second Name:${uData.secondName} </label>
		<label >Email:${uData.email}       </label>
		<label >Phone: ${uData.mobile}    </label>
		<label >Company:${uData.company}    </label>
		<label >Source: ${uData.source}    </label>
		
	</pre>
</form>
${msg}
</body>
</html>