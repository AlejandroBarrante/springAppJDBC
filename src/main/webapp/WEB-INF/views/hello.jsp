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
		<th>Nombre</th>
		<th>Apellidos</th>
		<th>Fecha de Alta</th>

		<c:forEach var="listAlumnos" items="${model.listAlumnos}">
			<tr>
				<td>${listAlumnos.nombre}</td>
				<td>${listAlumnos.apellidos}</td>
				<td>${listAlumnos.fechaAlta}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>