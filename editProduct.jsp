<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cyber.success.CSJ30SpringBootMVCDemo1.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! Product p =null; %>
<% p=(Product)request.getAttribute("productKey"); %>
<form action="/CSJ30SpringBootMVCDemo1/updateProduct" method="post">
ID:<input type="hidden" name="productId" value=<%=p.getProductId()%>><br>
NAME:<input type="text" name="productName" value=<%=p.getProductName()%>><br>
MFD:<input type="date" name="productmfd" value=<%=p.getProductMfd()%>><br>
PRICE:<input type="text" name="productPrice" value=<%=p.getProductPrice()%>><br>
IMAGE URL:<input type="hidden" name="productImage" value=<%=p.getProductImage()%>><br>
<input type="submit" value="UPDATE">

</form>

</body>
</html>