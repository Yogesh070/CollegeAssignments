<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>GCES</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Student</h3>
		<form action="StudentController" method="POST">
			<input type="hidden" name="id" value="${student.id}" />
			<table>
				<tbody>
					<tr>
						<td><label>Student Name:</label></td>
						<td><input type="text" name="name"
							value="${student.studentName }" /></td>
					</tr>
					<tr>
						<td><label>College Name:</label></td>
						<td><input type="text" name="college" value="${student.collegeName }" /></td>
					</tr>
					<tr>
						<td><label>Roll:</label></td>
						<td><input type="number" name="roll" value="${student.roll }" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="email" value="${student.email }" /></td>
					</tr>
					<tr>
						<td><label>DOB:</label></td>
						<td><input type="date" name="dob" value="${student.dob }" /></td>
					</tr>
					<tr>
						<td><label>Gender:</label></td>
						<td><input type="radio" name="gender" value="male"
						${student.gender=='male'?'checked':'' or student.gender ==null?'checked':'' } />Male
					<input type="radio" name="gender" value="female"
						${student.gender=='female'?'checked':'' } />Female
					<input type="radio" name="gender" value="other" />Other</td>
					</tr>
					<tr>
						<td><label>Subject:</label></td>
						<td><select name="subject">
						<option value="java" ${student.subject=='java'?'selected':''}>Java</option>
						<option value="php" ${student.subject=='php'?'selected':''}>PHP</option>
						<option value="html" ${student.subject=='html'?'selected':''}>HTML</option>
						<option value="js" ${student.subject=='js'?'selected':''}>JS</option>

					</select></td>
					</tr>
					<tr>
					<c:set var="departments"
						value="${fn:split(student.departments, '/') }" />
						<td><label>Departments:</label></td>
						<td><input type="checkbox" name="departments" value="Computer"
						${departments[0]=='Computer'?'checked':'' } />Computer
					<input type="checkbox" name="departments" value="Electrical"
						${departments[1]=='Electrical'?'checked':'' } />Electrical
					<input type="checkbox" name="departments" value="Civil"
						${departments[2]=='Civil'?'checked':'' } />Civil</td>
					</tr>
					<tr>
					<td><input type="submit" value="Submit" /></td>
					<td><input type="reset" value="Cancel" /></td>
					</tr>
					
					
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>