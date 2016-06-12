<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
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
<s:form action="addition">
<s:textfield name="id" label="MOvie id" requiredLabel="true"></s:textfield><br>
<s:textfield name="movie_name" label="Movie name" requiredLabel="true"></s:textfield><br>
<s:select name="cd" list="#{'cd':'cd','dvd':'dvd' }"  label="Disc"></s:select><br>
<s:textfield name="date" label="date" requiredLabel="true"></s:textfield>
<br>
<s:textfield name="director_name" label="director name" requiredLabel="true"></s:textfield>
<s:submit value="submit"></s:submit>
</s:form>
<s:form action="logout">
<s:submit value="LogOut" />
</s:form>
</body>
</html>