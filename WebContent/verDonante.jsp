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
	<h4 class="section-titulo">Formulario para ver donante</h4>
	<form>		
		<fieldset disabled="disabled">
			<div class="row">
				<div class="form-group col-md-4" style="">
					<label for="nombre">Nombres</label> <input type="text"
						class="form-control" id="nombre"
						name="nombre">
				</div>
				<div class="form-group col-md-4" style="">
					<label for="apellidopaterno">Apellido Paterno</label> <input
						type="text" class="form-control" id="apellidopaterno"
						name="apellidop">
				</div>
				<div class="form-group col-md-4" style="">
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
				<div class="form-group col-md-5" style="">
					<label for="email">Correo electrónico</label> <input type="email"
						class="form-control" id="email"
						name="email">
				</div>
				<div class="form-group col-md-2" style="">
					<label for="tipoDonante">Tipo de donante</label> <select
						id="tipoDonante" class="form-control" name="tipoDonante">
						<option value="V">Voluntario</option>
					</select>
				</div>
				<div class="form-group col-md-3" style="">
					<label for="distrito">Distrito</label> <select id="distrito"
						class="form-control" name="distrito">
						<option value="1">Surco</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-6" style="">
					<label for="direccion">Dirección</label> <input type="text"
						class="form-control" id="direccion"
						name="direccion">
				</div>

				<div class="form-group col-md-3" style="">
					<label for="edad">Edad</label> <input type="number"
						class="form-control" id="edad"
						name="edad">
				</div>
				<div class="form-group col-md-3" style="">
					<label for="fechaNac">Fecha de nacimiento</label> <input
						type="date" class="form-control" id="fechaNac" name="fechaNac">
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-3" style="">
					<label for="telefono">Teléfono fijo</label> <input type="number"
						class="form-control" id="telefono" 
						name="telefono">
				</div>
				<div class="form-group col-md-3" style="">
					<label for="celular">Celular</label> <input type="number"
						class="form-control" id="celular"
						name="celular">
				</div>
				<div class="form-group col-md-3" style="">
					<label for="dni">DNI</label> <input type="text"
						class="form-control" id="dni"
						name="dni">
				</div>
				<div class="form-group col-md-3" style="">
					<label for="estado">Estado</label> <select class="form-control" 
				id="estado" name="estado">
						<option value="NA">No apto</option>
					</select>
				</div>				
			</div>
			<div class="row">
				<div class="form-group col-md-12" style="">
					<label for="detalle">Detalle de veto</label>
					<textarea class="form-control" rows="5" id="detalle"></textarea> 
				</div>
			</div>
		</fieldset>
	</form>
</body>
</html>