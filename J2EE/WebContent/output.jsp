<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<body>

<s:actionmessage/>
<s:actionerror/>
<s:a href="add" action="add">add_movies</s:a><br>
<s:a href="list" action="list">list_movies</s:a><br>
<s:a href="delete" action="delete">delete_movies</s:a>

<s:form action="logout">
<s:submit value="LogOut" />
</s:form>

</body>
</html>