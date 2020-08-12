<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Form</title>
</head>
<body>
	
Hello World of Spring !
<br><br>

<%-- If you are not using Model class to get data
Student Name : ${param.studentName} --%>

<!-- If you are using model class -->
Student Name : ${message}

</body>
</html>