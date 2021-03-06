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
	<h4 class="section-titulo">Formulario para pedido de Sangre</h4>
	<form id="putBolsaSangre" action="BolsaSangre">
		<div class="row">
			<div class="form-group col-md-4" style="">
				<label for="codBolsaSangre">Ingresar el tipo de Sangre que necesita</label> 
				<select id="tipoSangre" class="form-control" name="tipoDonante" >
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
			<button type="submit" class="btn btn-danger" style="margin-top:2.1%">
				<span class="glyphicon glyphicon-plus"></span> 
				<span>Buscar</span>
			</button>
		</div>
	<form id="putBolsaSangre" action="BolsaSangre">
		
		<table class="table table-striped ">
			<thead>
				<tr>
					<th>Codigo Bolsa Sangre</th>
					<th>Tipo de sangre</th>
					<th>Codigo del Donante</th>
					<th>Nombre del Donante</th>
					<th>Apellidos del donante</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>000032</td>
					<td>AB+</td>
					<td>76191962</td>
					<td>Cesar</td>
					<td>Del Castillo Merino</td>
					<td ><center><a class="editarDonante" href="#" data-index="" 
						data-action="editar"><span class="glyphicon glyphicon-ok-circle"></span></a></center></td>
						
				</tr>
				<tr>
					<td>000050</td>
					<td>AB+</td>
					<td>76202047</td>
					<td>Ronaldo</td>
					<td>Brasileirao</td>
					<td ><center><a class="editarDonante" href="#" data-index="" 
						data-action="editar"><span class="glyphicon glyphicon-ok-circle"></span></a></center></td>
						
				</tr>
				<tr>
					<td>000074</td>
					<td>AB+</td>
					<td>15848498</td>
					<td>Francisco</td>
					<td>Riccio</td>
					<td ><center><a class="editarDonante" href="#" data-index="" 
						data-action="editar"><span class="glyphicon glyphicon-ok-circle"></span></a></center></td>
						
				</tr>
				<tr>
					<td>000081</td>
					<td>AB+</td>
					<td>10309020</td>
					<td>Jorge</td>
					<td>King Santa</td>
					<td ><center><a class="editarDonante" href="#" data-index="" 
						data-action="editar"><span class="glyphicon glyphicon-ok-circle"></span></a></center></td>
						
				</tr>
				<tr>
					<td>0000102</td>
					<td>AB+</td>
					<td>78565024</td>
					<td>Nadia</td>
					<td>Rodriguez Ingenieros</td>
					<td ><center><a class="editarDonante" href="#" data-index="" 
						data-action="editar"><span class="glyphicon glyphicon-ok-circle"></span></a></center></td>
						
				</tr>
			</tbody>
		</table>
	</div>
	</form>
</body>
</html>