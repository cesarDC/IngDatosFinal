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
		unidad de sangre</h4>
	<form id="putSolicitud" action="solicitud2" method="post">
		<div class="row">
			<div class="form-group col-md-3" style="">
				<label for="dniPac">DNI del paciente</label> <input type="text"
					class="form-control" id="dniPac" name="dniPac">
			</div>
			<div class="form-group col-md-3" style="">
				<label for="prioridad">Prioridad</label> <select
					class="form-control" id="prioridad" name="prioridad">
					<option value="E">No Emergencia</option>
				</select>
			</div>
			<div class="form-group col-md-3" style="">
				<label for="estado">Estado</label> <select class="form-control"
					id="estado" name="estado">
					<option value="NA">No atendido</option>
				</select>
			</div>
			<div class="form-group col-md-3" style="">
				<label for="fechaPedido">Fecha de entrega</label> <input type="date"
					class="form-control" id="fechaEntrega" name="fechaEntrega"
					value="2000-01-02">
			</div>
		</div>

		<button type="button" class="btn btn-primary" style="right: 0">
			<span class="glyphicon glyphicon-check"></span> <span>Verificar
				paciente</span>
		</button>



		<button type="submit" class="btn btn-danger">
			<span class="glyphicon glyphicon-ok"></span> <span>Guardar
				cambios</span>
		</button>


	</form>
</body>
</html>