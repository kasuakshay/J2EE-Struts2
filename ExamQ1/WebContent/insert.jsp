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

<s:form action="finalinsert">
<br>
<s:textfield name="id: " label="Movie ID"></s:textfield>
<s:textfield name="mname" label="Name of the Movie: "></s:textfield>
<s:select name="dType: " list="#{'CD':'CD','DVD':'DVD'}" label="DISC TYPE"></s:select>
<s:datetextfield name="date" format="dd/mm/yyyy" label="Release Date: "></s:datetextfield>
<br><br>
<s:submit value="INSERT NOW"/>
</s:form>
</body>
</html>