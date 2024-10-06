<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HAI USER</h1>
<form action="saveproduct" method="post">
ID:<input type="text" name="pid"><br>
BRAND:<input type="text" name="pbrand"><br>
PRICE:<input type="text" name="pprice"><br>
DISCOUNT:<input type="text" name="pdiscount">
<br>
<input type="submit">
</form>
<br>
<a href="productlist.jsp">Product List</a>

</body>
</html>