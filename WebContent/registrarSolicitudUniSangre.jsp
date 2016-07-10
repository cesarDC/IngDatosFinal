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

	<h4 class="section-titulo">Formulario para ingresar solicitud de
			unidades de sangre</h4>
	<form class="form-horizontal" id="postSolicitud" action="solicitud"
		method="post">
		
		<div class="form-group">
			<label class="col-md-3 control-label" for="dniPac">DNI
				paciente</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="dniPac"
					placeholder="Escribir DNI paciente" name="dniPac">
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label" for="prioridad">Tipo de
				prioridad</label>
			<div class="col-md-4">
				<select class="form-control" id="prioridad" name="prioridad">
					<option value="E">Emergencia</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label" for="prioridad">Fecha
				de entrega</label>
			<div class="col-md-4">
				<input type="date" class="form-control" id="fechaEntrega"
					placeholder="Seleccionar fecha de entrega" name="fechaEntrega">
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-4">
				<button type="submit" class="btn btn-danger" style="right: 0">
					<span class="glyphicon glyphicon-plus"></span> <span>Ingresar
						solicitud</span>
				</button>
			</div>
		</div>
	</form>

</body>
</html>