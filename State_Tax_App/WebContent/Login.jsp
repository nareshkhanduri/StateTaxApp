<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title> Tax Application </title>
</head>
 
<body >
	<img border="0" src="new_banner2.jpg" width="600" height="80">
	<h2>State Tax for Indiviual -  Application</h2>
<s:actionerror />
<s:form action="login.action" method="post">
    <s:textfield name="username" key="label.username" size="20" />
    <s:password name="password" key="label.password" size="20" /><br>
    <s:submit method="execute" key="label.login" align="center" />
</s:form>
	
</body>
</html>