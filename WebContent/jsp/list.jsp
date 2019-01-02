<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>list all human</title>

	<style type="text/css">
		table.hovertable {
	 		font-family: verdana,arial,sans-serif;
	 		font-size:11px;
	 		color:#333333;
	 		border-width: 1px;
	 		border-color: #999999;
	 		border-collapse: collapse;
		}
		table.hovertable th {
			background-color:#c3dde0;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
		table.hovertable tr {
			background-color:#d4e3e5;
		}
		table.hovertable td {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
		}
	</style>
</head>
<body>
	<table class="hovertable">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>birthday</th>
				<th>gender</th>
				<th>career</th>
				<th>address</th>
				<th>mobile</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="human">
			<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td align="center">${human.id}</td>
				<td align="center">${human.name}</td>
				<td align="center">${human.birthday}</td>
				<td align="center">${human.gender}</td>
				<td align="center">${human.career}</td>
				<td align="center">${human.address}</td>
				<td align="center">${human.mobile}</td>
				<td>
					<a href="info?id=${human.id}">
						<button id="${human.id}" class="btn btn-info">Info</button>
					</a>
					<a href="edit?id=${human.id}">
						<button id="${human.id}" class="btn btn-info">Edit</button>
					</a>
					<a href="${pageContext.request.contextPath}/delete?id=${human.id}">
						<button class="btn btn-danger">Delete</button>
					</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>