<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>
	<form action="update" method="post">
		<table>
		 		<tr>
				<td><input type="text" name="bookId" value="${findByID.bookId} " hidden="true"></td>
			</tr>
			<tr>
				<td>Book Title</td>
				<td><input type="text" name="bookTitle" value="${findByID.bookTitle}"></td>
			</tr>
			<tr>
				<td>ISBN</td>
				<td><input type="text" name="isbn"  value="${findByID.isbn}"></td>
			</tr>
			
			<tr>
				<td>Book FileName</td>
				<td><input type="text" name="bookFileName" value="${findByID.bookFileName}"></td>
			</tr>
			<tr>
				<td>Borrow Duration</td>
				<td><input type="text" name="borrowDuration" value="${findByID.borrowDuration}"></td>
			</tr>
			<tr>
				<td>Borrow Price</td>
				<td><input type="text" name="borrowPrice" value="${findByID.borrowPrice}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Book"></td>
			</tr>
           
           <tr>
           <td><a href="/getBooks">Get All Books</a></td>
           </tr>

		</table>
	</form>

</body>
</html>