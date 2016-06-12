<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<body>
<s:form action="deletion">
Enter Movie Id to be deleted :
<s:textfield name="delete" label="ID: " requiredLabel="true"></s:textfield>
<s:submit value="Delete"></s:submit>
</s:form>
<s:form action="logout">
<s:submit value="LogOut" />
</s:form>
</body>
</html>