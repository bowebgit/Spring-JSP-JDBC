<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Template</title>
	</head>
<body>
	


			<c:forEach items="${books}" var="book">
				<a class="book" href="#" >
					<span class="booktitle">${book.book_title }</span><br/>
					${book.book_author_first }	${book.book_author_last }<br/>
					$${book.book_price / 100 }
				</a>
			</c:forEach>		

	

</body>
</html>


