<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>step1</p>
<form:form action="processLogin" modelAttribute="user">
Email Address<form:input  path="email"/><br/>
Password<form:password path="password" /><br/>
<label id="label-1">Country</label>
<form:select path ="country">
<form:option value="---select---"></form:option>
<form:option value="india"></form:option>
<form:option value="france"></form:option>
<form:option value="germany"></form:option>
</form:select>

<input type="submit" value="login" />
</form:form>
</body>
</html>