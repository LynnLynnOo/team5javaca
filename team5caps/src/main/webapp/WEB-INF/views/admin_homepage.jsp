<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Homepage</title>
<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	List of students with not currently enrolled:
	<h1>Students List</h1>
	<div class="container">
		<table class="table table-striped">
			<caption></caption>
			<thead>
				<tr>
					<td>#</td>
					<td>Student ID</td>
					<td>Student First Name</td>
					<td>Student Last Name</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listNotEnrolled}" var="student"
					varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${student.studentID}</td>
						<td>${student.user.firstName}</td>
						<td>${student.user.lastName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br>
</body>
</html>