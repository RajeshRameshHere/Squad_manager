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
      <pre>
      
		<label >First Name: ${data.firstName} </label>
		<label >Second Name:${data.secondName} </label>
		<label >Email:${data.email}       </label>
		<label >Phone: ${data.mobile}    </label>
		<label >Company:${data.company}    </label>
		<label >Source: ${data.source}    </label>
		</pre>
					
			<form action="convert" method="post">
			<input type="hidden" name="id" value="${data.id}">	
			<input type="submit" value="convert" >
			</form>
			<form action="sendEmail" method="post">
			
			<input type="hidden"  name="email" value="${data.email}" >
			<input type="submit" value="send email" >
			
			
			</form>
				<form action="listall" method="get">
			<input type="submit" value="All entries" >
			</form>
			
			
		${msg}

</body>
</html>