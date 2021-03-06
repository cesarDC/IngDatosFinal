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

	<h4 class="section-titulo">Reporte / Lista de donantes</h4>
	<div class="table-responsive">
		<table class="table table-striped ">
			<thead>
				<tr>
					<th>DNI</th>
					<th>Nombre completo</th>
					<th>Sexo</th>
					<th>Tipo de sangre</th>
					<th>Numero Telefonico</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
			<% System.out.print("antes"); %>	
				<c:forEach var="x"  items="${sessionScope.listaDonantes}">
				<% System.out.print("fila"); %>	
				<tr>
				<td><c:out value="${x.DNI}" /></td>
				<td><c:out value="${x.nombre}" /> <c:out value="${x.apellidoP}" /> <c:out value="${x.apellidoM}" /></td>
				<td><c:out value="${x.sexo}"/></td>
				<td><c:out value="${x.idtipoSangre}" /></td>
				<td><c:out value="${x.numTelf}" /></td>
				<td><center><a class="editarDonante" href="#" data-index="" data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
                    <a class="verDonante" href="#" data-index="" data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
             </td>
             </tr>
              </c:forEach>
			</tbody>
		</table>
	</div>
	<div style="margin-bottom: 3%">
		<a href="#" role="button"
			class="btn btn-danger btn-agregar registrarDonante"><span
			class="glyphicon glyphicon-plus"></span>Agregar Donante</a>
	</div>

</body>