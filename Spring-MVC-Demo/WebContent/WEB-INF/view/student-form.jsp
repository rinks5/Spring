<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action = "processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName" placeholder="Enter your First Name"/>
	
	<br><br>
	
	Last Name : <form:input path="lastName" placeholder="Enter your Last Name"/>
	
	<br><br>
	
	Country : 
	
	<form:select path="country">
	
		<form:option value = "Brazil" label = "Brazil"/>
		<form:option value = "France" label = "France"/>
		<form:option value = "Germany" label = "Germany"/>
		<form:option value = "India" label = "India"/>
		
	</form:select>
	
	<br><br>
	
	Favorite Language :
	
	Java <form:radiobutton path="favoriteLanguage" value = "Java"/>
	C++ <form:radiobutton path="favoriteLanguage" value = "C++"/>
	Python <form:radiobutton path="favoriteLanguage" value = "Python"/>
	TypeScript <form:radiobutton path="favoriteLanguage" value = "TypeScript"/>
	
	<br><br>
	
	Operating Systems :
	
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/>
	
	<br><br>
	
	<input type = "submit" value = "Submit" />
	
	</form:form>

</body>
</html>