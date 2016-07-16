<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" />
<script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<script src="js/jquery-2.2.3.js"></script>
<link rel="stylesheet" href="css/custom2.css" />
<script src="js/custom.js">
	
</script>
<title>Panel de control</title>
</head>
<body>

	<h4 class="section-titulo">Reporte / Lista de Pruebas</h4>
	<div class="table-responsive">
		<table class="table table-striped ">
			<thead>
				<tr>
					<th><center>Codigo</center></th>
					<th><center>Nombre Prueba</center></th>
					<th><center>Estado</center></th>
					<th><center>Acciones</center></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="x"  items="${sessionScope.listaPruebas}">
				<% System.out.print("fila"); %>	
				<tr>
				<td><c:out value="${x.idPrueba}" /></td>
				<td><c:out value="${x.nombre}" /></td>
				<td><c:out value="${x.estado}"/></td>
				<td><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a>
             </td>
             </tr>
             </c:forEach>              
			</tbody>
		</table>
	</div>
	<div style="margin-bottom: 3%">
		<a href="#" role="button"
			class="btn btn-danger btn-agregar registrarPrueba"><span
			class="glyphicon glyphicon-plus"></span>Agregar Registro</a>
	</div>

</body>
</html>