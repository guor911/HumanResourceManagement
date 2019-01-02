<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal Information</title>
</head>
<body>
<div align="center">
			<input type="hidden" name="id" id="id" value="${id}">
			<div class="form-inline" align="center">
				<label> Name：<input class="form-control" id="name"
					name="name" type="text" value="${name}">
				</label>
			</div>
			<div class="form-inline" align="center">
				<label> Birthday：<input class="form-control" name="birthday"
					type="text" value="${birthday}">
				</label>
			</div>
			<div class="form-inline" align="center">
				<label> Gender：<textarea class="form-control" name="gender"
						cols="30" rows="">${gender}</textarea>
				</label>
			</div>
			<div class="form-inline" align="center">
				<label> Career：<textarea class="form-control" name="career"
						cols="30" rows="10">${career}</textarea>
				</label>
			</div>
			<div class="form-inline" align="center">
				<label> Address：<textarea class="form-control" name="address"
						cols="30" rows="10">${address}</textarea>
				</label>
			</div>
			<div class="form-inline" align="center">
				<label> Mobile：<textarea class="form-control" name="mobile"
						cols="30" rows="10">${mobile}</textarea>
				</label>
			</div>
			<a href="list">
				<button>Back</button>
			</a>
</div>
</body>
</html>