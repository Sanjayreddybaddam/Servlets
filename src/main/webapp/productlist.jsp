<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Product Details</h1>

<table style="border: 1px solid black; border-collapse: collapse;">
<%
int id=0;
String name = null;
double price = 0.0;
double discount = 0.0;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","sanjayreddy@008");
PreparedStatement pst = con.prepareStatement("select * from product");

ResultSet rs = pst.executeQuery();
while(rs.next()){
	id=rs.getInt(1);
	name=rs.getString(2);
	price=rs.getDouble(3);
	discount=rs.getDouble(4);
	%>
	
	<tr style="border: ipx solid black;border-collapse: collapse;text-align:centre">
	
	<td style="border: 1px solid black;border-collapse: collapse;padding:5px center"><%=id %></td>
	<td style="border: 1px solid black;border-collapse: collapse;padding:5px text-align: center"><%=name %></td>
	<td style="border: 1px solid black;border-collapse: collapse;padding:5px text-align: center"><%=price %></td>
	<td style="border: 1px solid black;border-collapse: collapse;padding:5px text-align: center"><%=discount %></td>
	
	</tr>
<% }%>


</table>
</body>
</html>