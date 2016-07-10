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
	<h4 class="section-titulo">Formulario para editar solicitud de
		donación</h4>
		<form class="form-horizontal" id="putSolicitudDon"
		action="solicitudDonacion2" method="post">		
		<div class="form-group">
			<label class="col-md-2 control-label" for="dniDon">DNI
				donante</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="dniDon"
					name="dniDon">
			</div>
			<div class="col-md-4">
				<button type="button" class="btn btn-primary" style="right: 0">
					<span class="glyphicon glyphicon-check"></span> <span>Verificar
						Donante</span>
				</button>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-2 control-label" for="dniPac">DNI
				paciente</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="dniPac"					
					name="dniPac">
			</div>			
		</div>
		<button type="submit" class="btn btn-danger">
			<span class="glyphicon glyphicon-ok"></span> <span>Guardar cambios</span>
		</button>
	</form>	
</body>
</html>