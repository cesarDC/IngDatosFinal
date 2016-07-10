<%@page import="pe.banco.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
    String ID = (String) session.getAttribute("ID");
    if (ID == null) {
        response.sendRedirect("login.jsp");
    }
%>
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
            function logout(){
                var usuario = $("#usuario").val();
                var password = $("#password").val();
                $.ajax({
                    type: "POST",
                    url: "sesion",
                    data: {accion:"LOGOUT"},
                    success: function(data) {
                        var result = data.substr(0, 9);
                        
                        if(result == "login.jsp") {
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
<%Usuario usuario = (Usuario)request.getSession().getAttribute("usuario"); %>
	<nav class="navbar">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-3" style="display: inline-block">
					<a href="#inicio"><img src="img/gglogo.jpg"
						style="padding: 0%; height: 11%; padding-left: 2%" /></a>
				</div>
				<div class="col-md-7 label-info" style="display: inline-block">
					<form class="navbar-form">
						<fieldset disabled="disabled">
							<div class="row">
								<div class="form-group col-md-5" style="">
									<label for="nombresUsuario">Nombres: </label> <input
										type="text" class="form-control" id="nombresUsuario"
										name="nombresUsuario" value="<%=usuario.getNombres()%>">
								</div>

								<div class="form-group col-md-5" style="">
									<label for="tipoEmpleado">Ocupacion: </label> <select
										class="form-control" id="tipoEmpleado" name="tipoEmpleado">
										<option value="1"><%=usuario.getTipoempleado()%>></option>
									</select>
								</div>

								<div class="form-group col-md-2" style="">
									<img src="img/logo.png"
										style="padding: 0%; height: 7%; padding-left: 2%; margin-bottom: 10%" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6" style="">
									<label for="apellidopUsuario">Apellido Paterno: </label> <input
										type="text" class="form-control" id="apellidopUsuario"
										name="apellidopUsuario" value="<%=usuario.getApellidopat()%>">
								</div>
								<div class="form-group col-md-6 style="">
									<label for="apellidomUsuario">Apellido Materno: </label> <input
										type="text" class="form-control" id="apellidomUsuario"
										name="apellidomUsuario" value="<%=usuario.getApellidomat()%>">
								</div>
							</div>
						</fieldset>
					</form>
				</div>
				<div class="col-md-2">
					<a class="btn btn-success" onclick="logout()"">Cerrar Sesion<span
						class="glyphicon glyphicon-off" style="padding-left: 10%"></span></a>
				</div>
			</div>
		</div>

	</nav>
	<div id="areaCentro" class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<div id="asideBase">
					<div class="list-group">
						<a href="#" class="list-group-item label-success"
							data-toggle="collapse" data-target="#gestionHospital"
							style="color: black"> <span
							class="glyphicon glyphicon-plus leftheading"></span> Gestión de
							hospitales
						</a>
						<div id="gestionHospital" class="collapse">
							<a href="#" class="list-group-item list-group-item-success registrarSolicitudUniSangre"> <span
								class="leftsubheading glyphicon glyphicon-share-alt leftheading"></span>Ingresar
								solicitud de unidad de sangre
							</a> <a href="#" class="list-group-item list-group-item-success listaSolicitudUniSangre"> <span
								class="leftsubheading glyphicon glyphicon-list leftheading"></span>Ver
								lista de solicitudes de unidades de sangre
							</a>
						</div>
						<a href="#" class="list-group-item label-danger"
							data-toggle="collapse" data-target="#gestionDonante"
							style="color: black"> <span
							class="glyphicon glyphicon-user leftheading"></span> Gestión de
							donantes
						</a>
						<div id="gestionDonante" class="collapse">							
							<a href="#" class="list-group-item list-group-item-success registrarDonante"> <span
								class="leftsubheading glyphicon glyphicon-share-alt leftheading"></span>Ingresar
								donante
							</a> <a href="#" class="list-group-item list-group-item-success listaDonantes"> <span
								class="leftsubheading glyphicon glyphicon-list leftheading"></span>Ver
								lista de donantes
							</a> <a href="#" class="list-group-item list-group-item-success registrarSolicitudDon"> <span
								class="leftsubheading glyphicon glyphicon-share-alt leftheading"></span>Ingresar
								solicitud de donación
							</a> <a href="#" class="list-group-item list-group-item-success listaSolicitudesDon"> <span
								class="leftsubheading glyphicon glyphicon-list leftheading"></span>Ver
								lista de solicitudes de donación
							</a>

						</div>
					</div>
					<form class="bg-primary">
						<fieldset disabled="disabled">
							<h4 class="text-center">Información del centro de salud</h4>
							<div class="form-group" style="padding: 0 2% 0 2%">
								<label for="nombreCS">Nombre de centro de salud: </label> <input
									type="text" class="form-control" id="nombreCS" 
									value="<%=usuario.getCentroSalud().getNombreC()%>"
									name="nombreCS">
							</div>
							<div class="form-group" style="padding: 0 2% 0 2%">
								<label for="distritoCS">Distrito: </label> <select
									class="form-control" id="distritoCS" name="distritoCS">
									<option value="1"><%=usuario.getCentroSalud().getDistrito()%></option>
								</select>
							</div>

							<div class="form-group" style="padding: 0 2% 0 2%">
								<label for="direccionCS">Dirección: </label> <input type="text"
									class="form-control" id="direccionCS" 
									value="<%=usuario.getCentroSalud().getDireccion()%>"
									name="direccionCS">
							</div>
							<div class="form-group" style="padding: 0 2% 0 2%">
								<label for="telefonoCS">Teléfono: </label> <input type="text"
									class="form-control" id="telefonoCS"
									value="<%=usuario.getCentroSalud().getTelefono()%>"
									name="telefonoCS">
							</div>
						</fieldset>

					</form>
				</div>
			</div>
			<div class="col-md-9">
				<div id="seccionBase" class="container-fluid bg-info"></div>
			</div>
		</div>
	</div>
	<footer class="container-fluid">
		<ul>
			<li>Anthony Morán</li>
			<li>Iván Palomares</li>
			<li>Jason Rojas</li>
		</ul>
	</footer>


</body>
</html>