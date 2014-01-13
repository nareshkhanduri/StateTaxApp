<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
</head>
 
<body>
    <h2>Welcome Home, <s:property value="%{#session.currentUser.userName}" />...!</h2>
 
<table>
<tr>
<td>User Name : </td> <td><s:property value="%{#session.currentUser.userName}"/></td><td> </td>
</tr>
<tr>
<td>User Age :</td><td> <s:property value="%{#session.currentUser.age}"/> </td><td></td>
</tr>
<tr>
<td>User UID :</td><td> <s:property value="%{#session.currentUser.uID}"/> </td><td></td>
</tr>
<tr>
<td>User Address :</td><td> 
<table border=1>
<tr>
<s:iterator value="%{#session.currentUser.address}" var="item"> <!-- here myList contains the list of objects -->  
  <td> <s:property value="%{#item.state}" />  </td>  
</s:iterator> 
</tr>
</table>
</td><td></td>
</tr>

<tr>
 	<td colspan="3"> &nbsp; &nbsp;</td>
</tr>
<tr>

 	<td colspan="3"> <h3> Select Address for this Transaction</h3></td>
</tr>

 <s:form action="transaction.action" method="post">
  <tr><td colspan="3">
  <s:radio name="transactionAddress" list="%{#session.currentUser.address}" listKey="key" listValue="state" value="1"></s:radio>
   </td></tr>
   <tr>
 	<td colspan="3"> &nbsp; &nbsp;</td>
</tr>
   <tr> <td colspan="3"> 
     <s:submit method="execute" key="label.transaction" align="center" />
</td></tr>
</s:form>

</table>
</body>
</html>