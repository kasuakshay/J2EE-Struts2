<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr><th>ID</th><th>Movie_Name</th><th>Disc_Type</th><th>Release_Date</th><th>Director_Name</th></tr>

<s:iterator value="al">

<tr><td><s:property value="id"/></td>
<td><s:property value="movie_name"/></td>
<td><s:property value="cd"/></td>
<td><s:property value="date"/></td>
<td><s:property value="director_name"/></tr>

</s:iterator>
</table>
<s:form action="logout">
<s:submit value="LogOut" />
</s:form>
</body>
</html>