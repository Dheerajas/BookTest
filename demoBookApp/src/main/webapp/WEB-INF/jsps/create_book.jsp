<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>
	<form action="create" method="post">
		<table>
			<tr>
				<td>Book Title</td>
				<td><input type="text" name="bookTitle"></td>
			</tr>
			<tr>
				<td>ISBN</td>
				<td><input type="text" name="isbn"></td>
			</tr>
			
			<tr>
				<td>Book FileName</td>
				<td><input type="text" name="bookFileName"></td>
			</tr>
			<tr>
				<td>Borrow Duration</td>
				<td><input type="text" name="borrowDuration"></td>
			</tr>
			<tr>
				<td>Borrow Price</td>
				<td><input type="text" name="borrowPrice"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Create Book"></td>
			</tr>
           
           <tr>
           <td><a href="/getBooks">Get All Books</a></td>
           </tr>

		</table>
	</form>

</body>
</html>