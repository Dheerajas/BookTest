<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>
	<h2 align="center">All Books</h2>
	<table>
		<tr>
			<th>BookId</th>
			<th>Book Title</th>
			<th>ISBN</th>
			<th>Book FileName</th>
			<th>Borrow Duration</th>
			<th>Borrow Price</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${books}" var="books">
			<tr>
				<td>${books.bookId}</td>
				<td>${books.bookTitle}</td>
				<td>${books.isbn}</td>
				<td>${books.bookFileName}</td>
				<td>${books.borrowDuration}</td>
				<td>${books.borrowPrice}</td>
				<td><a href="deleteById?${books.bookId}">Delete</a></td>
				<td><a href="updateById?${books.bookId}">Update</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>