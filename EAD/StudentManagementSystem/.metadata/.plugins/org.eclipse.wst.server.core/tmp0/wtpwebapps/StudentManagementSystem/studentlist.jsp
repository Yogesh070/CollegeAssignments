<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Student List</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
		<!-- 	<input type="button" value="Add Student" 
				   onclick="window.location.href='add-student-form.jsp'; return false;"
				   class="add-student-button"
			/>  -->
			<a href="StudentController?actions=add_new">Add New</a>
			<c:if test="${! empty students }">
			<table>
			
				<tr>
					<th>ID</th>
					<th>Student Name</th>
					<th>College Name</th>
					<th>Email</th>
					<th>Subject</th>
					<th>Roll</th>
					<th>DOB</th>
					<th>Departments</th>
					<th>Gender</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="student" items="${students}">
					
					<!-- set up a link for each student -->
					<c:url var="edit" value="StudentController">
						<c:param name="actions" value="edit" />
						<c:param name="id" value="${student.id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="StudentController">
						<c:param name="actions" value="delete" />
						<c:param name="id" value="${student.id}" />
					</c:url>
																		
					<tr>
						<td> ${student.id} </td>
						<td> ${student.studentName} </td>
						<td> ${student.collegeName} </td>
						<td> ${student.email} </td>
						<td> ${student.subject} </td>
						<td> ${student.roll} </td>
						<td> ${student.dob} </td>
						<td> ${student.departments} </td>
						<td> ${student.gender} </td>
						 <td> 
							<a href="${edit}">Edit</a> 
							<!-- <a href="StudentController?action=edit&id=<c:out value='${student.id }'/>" >Edit</a> -->
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		</c:if>
		</div>
	
	</div>
</body>


</html>








