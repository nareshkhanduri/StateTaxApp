<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<title>Transaction Details</title>
</head>
 
<body>
<h2>Your Details for Transaction are...!</h2>
<table>
<tr>
<td>Tax Payer Name : </td> <td><s:property value="%{#session.TaxPayedUser.userName}"/> </td>
</tr><tr>
<td>Tax Payer UID : </td> <td><s:property value="%{#session.TaxPayedUser.uID}"/> </td>
</tr><tr>
<tr>
<td>Tax for City : </td> <td><s:property value="%{#session.TaxPayedUser.taxAddress.state}"/> </td>
</tr>
<td>Tax Payable : </td> <td><s:property value="%{#session.TaxPayedUser.stateTax}"/> </td>
</tr>
</table>
</body>
</html>