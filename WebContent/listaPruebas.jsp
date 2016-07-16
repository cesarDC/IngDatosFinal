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
					<th><center>Codigo</center></th>
					<th><center>Nombre Prueba</center></th>
					<th><center>Estado</center></th>
					<th><center>Acciones</center></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><center>1</center></td>
					<td><center>VIH</center></td>
					<td><center>Positivo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>2</center></td>
					<td><center>VIH</center></td>
					<td><center>Negativo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>3</center></td>
					<td><center>VIH</center></td>
					<td><center>Negativo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>4</center></td>
					<td><center>Hepatitis</center></td>
					<td><center>Negativo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>5</center></td>
					<td><center>Hepatitis</center></td>
					<td><center>Positivo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>6</center></td>
					<td><center>Sirrosis</center></td>
					<td><center>Positivo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				<tr>
					<td><center>7</center></td>
					<td><center>Sirrosis</center></td>
					<td><center>Negativo</center></td>
					<td><center><a class="editarPrueba" href="#" data-index-number=""
						data-action="editar"><span class="glyphicon glyphicon-pencil"></span></a>
						<a class="verPrueba" href="#" data-index-number=""
						data-action="ver"><span class="glyphicon glyphicon-zoom-in"></span></a></center>
				</tr>
				
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