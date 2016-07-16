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

	<h4 class="section-titulo">Formulario para registrar Bolsa de Sangre</h4>
	<form id="postBolsa" action="Bolsa" method="post">		
		<div class="row">
			<div class="form-group col-md-2" style="">
				<label for="tipoSangre">Tipo de Sangre</label> <select
					id="tipoSangre" class="form-control" name="tipoDonante">
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="AB+">AB+</option>
					<option value="O+">O+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="AB-">AB-</option>
					<option value="O-">O-</option>
				</select>
			</div>
			<div class="form-group col-md-4" style="">
				<label for="DNIDonante">DNI del Donante</label> <input
					type="number" class="form-control" id="DNIDonante"
					placeholder="Escribir el Dni del Donante" name="DNIDonante">
			</div>
			<div class="form-group col-md-4" style="">
				<label for="fechaDonacion">Fecha de donacion</label> <input
					type="date" class="form-control" id="fechaDonacion" name="fechaDonacion">
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-4" style="">
				<label for="PruebaVIH">Prueba de VIH</label> <input
					type="number" class="form-control" id="PruebaVIH"
					placeholder="Escribir el codigo de la Prueba de VIH" name="PruebaVIH">
			</div>
			<div class="form-group col-md-4" style="">
				<label for="PruebaHepatitis">Prueba de Hepatitis B/C</label> <input
					type="number" class="form-control" id="PruebaHepatitis"
					placeholder="Escribir el codigo de la Prueba de Hepatitis B/C" name="PruebaHepatitis">
			</div>
			<div class="form-group col-md-4" style="">
				<label for="PruebaSirrosis">Prueba de Sirrosis</label> <input
					type="number" class="form-control" id="PruebaSirrosis"
					placeholder="Escribir el codigo de la Prueba de Sirrosis" name="PruebaSirrosis">
			</div>
		</div>
		<button type="submit" class="btn btn-danger">
			<span class="glyphicon glyphicon-plus"></span> 
			<span>Registrar Bolsa de Sangre</span>
		</button>

	</form>

</body>
</html>