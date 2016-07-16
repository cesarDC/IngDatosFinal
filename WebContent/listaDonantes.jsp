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
					<th><center>DNI</center></th>
					<th><center>Nombre completo</center></th>
					<th><center>Sexo</center></th>
					<th><center>Tipo de sangre</center></th>
					<th><center>Numero Telefonico</center></th>
					<th><center>Acciones</center></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><center>20131349</center></td>
					<td><center>Carlos Gabriel Ugaz Burga</center></td>
					<td><center>Masculino</center></td>
					<td><center>A(+)</center></td>
					<td><center>989012130</center></td>
					<td><center><a class="editarDonante" href="#" data-index=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verDonante" href="#" data-index=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
			</tbody>
		</table>
	</div>
	<div style="margin-bottom: 3%">
		<a href="#" role="button"
			class="btn btn-danger btn-agregar registrarDonante"><span
			class="glyphicon glyphicon-plus"></span>Agregar Donante</a>
	</div>

</body>