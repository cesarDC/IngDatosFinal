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
	<h4 class="section-titulo">Formulario para editar donante</h4>
	<form id="putDonante" action="donante2">
		<div class="row">
			<div class="form-group col-md-2" style="">
				<label for="dni">DNI</label> <input type="text" class="form-control"
					id="dni" name="dni">
			</div>
			<div class="form-group col-md-3" style="">
				<label for="nombre">Nombres</label> <input type="text"
					class="form-control" id="nombre" name="nombre">
			</div>
			<div class="form-group col-md-3" style="">
				<label for="apellidopaterno">Apellido Paterno</label> <input
					type="text" class="form-control" id="apellidopaterno"
					name="apellidop">
			</div>
			<div class="form-group col-md-3" style="">
				<label for="apellidomaterno">Apellido Materno</label> <input
					type="text" class="form-control" id="apellidomaterno"
					name="apellidom">
			</div>

		</div>
		
		
		<div class="row">
			<div class="form-group col-md-2" style="">
				<label for="tipoSangre">Tipo de sangre</label> <select
					id="tipoSangre" class="form-control" name="tipoSangre">
					<option value="1">O+</option>
				</select>
			</div>
			<div class="form-group col-md-2" style="">
				<label for="telefono">Número de teléfono</label> <input type="number"
					class="form-control" id="telefono" name="telefono">
			</div>
			<div class="form-group col-md-3" style="">
				<label for="fechaNac">Fecha de nacimiento</label> <input type="date"
					class="form-control" id="fechaNac" name="fechaNac">
			</div>
			<div class="form-group col-md-1" style="">
				<label for="peso">Peso</label> <input type="number"
					class="form-control" id="peso" name="peso">
			</div>
		</div>
		<button type="submit" class="btn btn-danger">
			<span class="glyphicon glyphicon-ok"></span> <span>Guardar cambios</span>
		</button>
	</form>
</body>
</html>