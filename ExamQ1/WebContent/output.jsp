<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="color:green">
<s:actionerror/>
<s:actionmessage/>
<s:div>

<s:form action="insert">
<s:submit value="Insert Movies"></s:submit>
</s:form>
</s:div>

<s:div>
<s:form action="logout">
<s:submit value=" LOG OUT "></s:submit>
</s:form>
</s:div>

</body>
</html>