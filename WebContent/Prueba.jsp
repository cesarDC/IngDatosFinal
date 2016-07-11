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

	<h4 class="section-titulo">Formulario para registrar Prueba</h4>
	<form id="postPrueba" action="Prueba" method="post">		
		<div class="row">
			<div class="form-group col-md-2" style="">
				<label for="NombrePrueba">Nombre de la Prueba</label> <select
					id="tipoSangre" class="form-control" name=""NombrePrueba"">
					<option value="A+">VIH</option>
					<option value="B+">HEPATITIS</option>
					<option value="AB+">SIRROSIS</option>
				</select>
			</div>
			<div class="form-group col-md-4" style="">
				<label for="Estado">Estado</label> 
				<select
					id="tipoSangre" class="form-control" name="" NombrePrueba"">
					<option value="Positivo">Positivo</option>
					<option value="Positivo">Negativo</option>
				</select>
			</div>
		</div>
		
		<button type="submit" class="btn btn-danger">
			<span class="glyphicon glyphicon-plus"></span> 
			<span>Ingresar Prueba</span>
		</button>

	</form>

</body>
</html>