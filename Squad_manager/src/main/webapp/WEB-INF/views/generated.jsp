<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generated Bill</title>
</head>
<body>

<c:out value="${pdfPath}"></c:out>
    <h1>Generated Bill</h1>
    
    <!-- Use ${pdfPath} to dynamically set the file path -->
    <a href="${pdfPath}" target="_blank">Open Bill</a><br>
    
    
  
    
    <a href="file:///${pdfPath}" download="downloaded-file.pdf">Download File</a>
    
    <a href="${pdfPath}">Open Bill</a>
    
</body>
</html>
