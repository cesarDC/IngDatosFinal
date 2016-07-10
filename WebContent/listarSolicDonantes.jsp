<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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

	<h4 class="section-titulo">Reporte / Lista de solicitudes de
		donación</h4>
	<div class="table-responsive">
		<table class="table table-striped ">
			<thead>
				<tr>
					<th>ID</th>
					<th>DNI de donante</th>
					<th>Nombre de donante</th>
					<th>Fecha</th>
					<th>Nombre de paciente</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>55555555</td>
					<td>Jason Rafael Rojas Hinostroza</td>
					<td>24/12/2016</td>
					<td>Marcos Anthony Morán Merino</td>
					<td><a class="editarSolicitudDon" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verSolicitudDon" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a>
						<a class="eliminarSolicitudDon" href="#" data-index-number=""><span
							class="glyphicon glyphicon-remove"></span></a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div style="margin-bottom: 3%">
		<a href="#" role="button"
			class="btn btn-danger btn-agregar registrarSolicitudDon"><span
			class="glyphicon glyphicon-plus"></span>Agregar Registro</a>
	</div>

</body>
</html>