<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:actionerror/>
<s:actionmessage/>

<s:form action="add">

<s:textfield name="id" label="Movie ID" requiredLabel="true"></s:textfield>
<s:textfield name="mname" label="Name of the Movie: " requiredLabel="true"></s:textfield>
<s:select name="dType" list="#{'CD':'CD','DVD':'DVD'}" label="DISC TYPE" requiredLabel="true"></s:select>
<s:textfield name="date" label="Release Date:" requiredLabel="true"/>
<s:submit value="INSERT NOW"/>
</s:form>

<s:div>
<s:form action="logout">
<s:submit value=" LOG OUT "></s:submit>
</s:form>
</s:div>

</body>
</html>