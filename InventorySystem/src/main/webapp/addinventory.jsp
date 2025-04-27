<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add inventory</h1>
	<form action="HandleAdd" method="post">
		<label>Item name:</label><input type="text" name="itemname"/><br>
		<label>Item Desc:</label><input type="text" name="itemdesc"/><br>
		<label>Item price:</label><input type="number" name="itemprice"/><br>
		<input type="submit" value="Add Item"/>
	</form>
</body>
</html>