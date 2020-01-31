<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student"><!--spring tags-->
	
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName"/>
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" />
		
		<br><br>
       	Email:<form:input path="email"/>
       	<form:errors path="email"/>
       	<br><br>
       	Age:<form:input path="age"/>
       	<form:errors path="age" color="red"></form:errors>
       	<br><br>
       	Phone:<form:input path="phone"/>
       	
       <form:errors path="phone"/>
      <br><br>
		Country:
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Operating Systems:
		
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
    