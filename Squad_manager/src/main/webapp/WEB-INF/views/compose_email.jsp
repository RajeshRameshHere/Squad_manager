<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dispatchEmail" method="post">
<pre>
To 		<input type="text" 	name="email"	 value="${email}">
Subject <input type="text" 	name="subject" >
		<textarea 			name="content" rows="10" cols="50">
		</textarea>
<input type="submit" value="send">
</pre>
</form>

</body>
</html>