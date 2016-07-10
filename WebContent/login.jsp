<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
<%
    session.removeAttribute("usuario");
    session.removeAttribute("ID");
    session.invalidate();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css"/>
<script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<script src="js/jquery-2.2.3.js"></script>
<link rel="stylesheet" href="css/custom.css"/>
<link rel="stylesheet" href="css/social-buttons-3.css"/>
<link rel="stylesheet" href="css/font-awesome.css"/>
<script type="text/javascript">
            function login(){
                var usuario = $("#usuario").val();
                var password = $("#password").val();
                $.ajax({
                    type: "POST",
                    url: "sesion",
                    data: {accion:"LOGIN",usuario:usuario,password:password},
                    success: function(data) {
                        var result = data.substr(0, 10);
                        
                        if(result == "sesion.jsp") {
                            window.location = data;
                        } else {
                            alert(data);
                        }
                    }
                });
            }
 </script>

<title>Login</title>
</head>
<body >
				<div class="container" id="login">
					<div class="row">
						<div class="col-md-4 col-md-offset-4">
							<center> <img id="logo" src="img/logo.png" /></center>
							<form action="sesion" method="post">
							<div class="form-group">
								<label for="username">Usuario</label> <input type="text"
									class="form-control" id="usuario" name="username"
									placeholder="Escribir usuario" required />
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									class="form-control" id="password" name="password"
									placeholder="Escribir password" required/>
							</div>
								<div class="col-md-6 col-md-offset-3">
									<button onclick="login()" type="button" class="btn btn-warning btn-block" >Ingresar</button>
								</div>
							</form>
						</div>
						
					</div>
					
				</div>

			
</body>
</html>