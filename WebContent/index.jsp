
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="js/jquery-2.2.3.js"></script>
<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" />
<script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/custom2.css" />
<script src="js/custom.js"></script>
<title>Panel de control</title>
<script type="text/javascript">
	function logout() {
		var usuario = $("#usuario").val();
		var password = $("#password").val();
		$.ajax({
			type : "POST",
			url : "sesion",
			data : {
				accion : "LOGOUT"
			},
			success : function(data) {
				var result = data.substr(0, 9);
				if (result == "login.jsp") {
					window.location = data;
				} else {
					alert(data);
				}
			}
		});
	}
</script>
</head>
<body id="inicio">
	<div id="wrap">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid" >
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#inicio"><img src="img/logoEmpre2.png"
					style="padding: 0%; height: 7%; padding-left: 2%" /></a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a id="gestionAcademica" class="raya"
						href="#">Gestion Banco de Sangre <span class="sr-only">(current)</span>
					</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login.jsp">Cerrar Sesion <span
							class="glyphicon glyphicon-off"></span></a></li>
				</ul>
				
			</div>
		</div>
	</nav>
	<div id="areaCentro main" class="container-fluid" >
	<div class="row">
		<div class="col-md-3">
			<div id="asideBase">
				<ul class="leftbar">
					<li><span class="glyphicon glyphicon-briefcase leftheading"></span>
						<h4 class="leftheading">Gestión de Bolsa de Sangre</h4>
						<ul class="leftbar subheading">
							<li><a class="PedidoBolsa" href="#">
								<h5>>> Pedir bolsa de Sangre</h5>
								</a>
							</li>
							<li><a class="ListaPedidos" href="#">
								<h5>>> Ver lista de pedidos</h5>
								</a>
							</li>
							<li><a class="AgregarBolsa" href="#">
								<h5>>> Agregar bolsa de Sangre</h5>
								</a>
							</li>
							<li><a class="EditarBolsaSangre" href="#">
								<h5>>> Editar Bolsa de Sangre</h5>
								</a>
							</li>
						</ul>
					</li>
					<li><span class="glyphicon glyphicon-education leftheading"></span>
						<h4 class="leftheading">Gestión de Donantes</h4>
						<ul class="leftbar subheading ">
							<li>
								<a class="registrarDonante" href="#">
								<h5>>> Añadir Donante</h5>
								</a>
							</li>
							<li>
								<a class="listaDonante" href="#">
								<h5>>> Ver lista de Donantes</h5>
								</a>
							</li>
						</ul>
					</li>
					<li><span class="glyphicon glyphicon-education leftheading"></span>
						<h4 class="leftheading">Gestión de Pruebas</h4>
						<ul class="leftbar subheading ">
							<li>
								<a class="registrarPrueba" href="#">
								<h5>>> Añadir Puebas</h5>
								</a>
							</li>
							<li>
								<a class="listaPrueba" href="#">
								<h5>>> Ver lista de Pruebas</h5>
								</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<div class="col-md-9">
			<div id="seccionBase"></div>
		</div>
	</div>		
	</div>
	</div>
	<footer class="container-fluid">	
		<ul>
			<li>Cesar del Castillo</li>
			<li>Rossy Espinoza</li>
			<li>Mitchelli Murgueytio</li>
			<li>Carlos Ugaz</li>
		</ul>	
	</footer>
	
	
</body>
</html>