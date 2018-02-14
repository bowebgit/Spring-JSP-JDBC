<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<style>
		main{
			width:80%;
			margin:auto;
			margin-top: 50px;
		}
	</style>
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap.js" />
	<!--NOT WORKING  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/jquery-3.3.1.js"/>--> 
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<title>Template</title>
	</head>
<body>
	
<main>
<h2>Ajax Example</h2>

Submit the form for an Ajax example or go to the <a href="${pageContext.request.contextPath}/">Home page</a>.


<br/><br/>
			<c:forEach items="${books}" var="book">
				<a class="book" href="#" >
					<span class="booktitle">${book.book_title }</span><br/>
					${book.book_author_first }	${book.book_author_last }<br/>
					$${book.book_price / 100 }
				</a>
			</c:forEach>		
<br/>
<br/>
		<form class="form-horizontal" id="search-form">
			<div class="form-group form-group-lg">
				<label class="col-sm-2 control-label">Title</label>
				<div class="col-sm-10">
					<input type=text class="form-control" id="title">
				</div>
			</div>
			<div class="form-group form-group-lg">
				<label class="col-sm-2 control-label">Price</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="price">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" id="bth-search"
						class="btn btn-primary btn-lg">Search</button>
				</div>
			</div>
		</form>
<br/>
<br/>
<div id="feedback"></div>
<br/>

</main>















<script>
	$(document).ready(function($) {

		$("#search-form").submit(function(event) {

			// Disble the search button
			enableSearchButton(false);
			console.log("button disabled");
			// Prevent the form from submitting via the browser.
			event.preventDefault();

			searchViaAjax();

		});

	});

	function searchViaAjax() {

		var search = {}
		search["book_title"] = $("#title").val();
		search["book_price"] = $("#price").val();
		console.log(search[1]);
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/search/api/getSearchResult",
			data : JSON.stringify(search),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			},
			done : function(e) {
				console.log("DONE");
				enableSearchButton(true);
			}
		});

	}

	function enableSearchButton(flag) {
		$("#btn-search").prop("disabled", flag);
	}

	function display(data) {
		var json = "<h4>Ajax Response</h4><pre>"
				+ JSON.stringify(data, null, 4) + "</pre>";
		$('#feedback').html(json);
	}
</script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>


