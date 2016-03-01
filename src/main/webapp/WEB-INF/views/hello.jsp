<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>

	<table border="1" >
		<th>Nombre del alumno</th>
		<th>Fecha de Alta</th>
		<th>Asignatura</th>
		<th>Profesor</th>

		<c:forEach var="listAlumnos" items="${model.listAlumnos}">

			<tr>
				<td>${listAlumnos.nombreCompletoAlumno}</td>
				<td>${listAlumnos.fechaAlta}</td>
				<td>${listAlumnos.asignatura}</td>
				<td>${listAlumnos.nombreCompletoProf}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>