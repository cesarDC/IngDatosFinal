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

	<h4 class="section-titulo">Reporte / Lista de donantes</h4>
	<div class="table-responsive">
		<table class="table table-striped ">
			<thead>
				<tr>
					<th>Nombre Prueba</th>
					<th>Estado</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>VIH</td>
					<td>Positivo</td>
					<td><a class="editarDonante" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verDonante" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a>
						<a class="eliminarDonante" href="#" data-index-number=""><span
							class="glyphicon glyphicon-remove"></span></a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div style="margin-bottom: 3%">
		<a href="#" role="button"
			class="btn btn-danger btn-agregar registrarDonante"><span
			class="glyphicon glyphicon-plus"></span>Agregar Registro</a>
	</div>

</body>
</html>