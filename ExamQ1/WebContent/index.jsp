<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<body>

<s:actionerror/>
<s:actionmessage/>
<% session.invalidate(); %>

<s:form action="login">
<s:textfield name="uname" label="Enter Username:" requiredLabel="true"></s:textfield>
<s:password name="pass" label="Enter password:" requiredLabel="true"></s:password>
<s:submit value="Log In"></s:submit>
</s:form>

</body>
</html>