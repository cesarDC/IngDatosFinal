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
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="css/form-elements.css">
<link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/custom.css"/>
<link rel="stylesheet" href="css/social-buttons-3.css"/>
<link rel="stylesheet" href="css/font-awesome.css"/>


<title>Login</title>
</head>
<body class="fullscreen_bg">
	<div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row" style="display: inline;">
                        <div class="col-sm-8 col-sm-offset-2 text">
                        		<img alt="" src="img/circulito.png">
                        	<div >
                        		<h1 style="font-weight: bold;font-size: 300%">EMPRE S.A</h1>
                        		<h3 style="color: white">Brindando soluciones de TI</h3>
                        	</div>
                        	
                           
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Ingresar al portal</h3>
                            		<p>Ingrese su usuario y contraseña para ingresar al portal:</p>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="login" method="post" class="#">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="user" placeholder="Usuario" class="form-username form-control" id="form-username" required>
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="pass" placeholder="Contraseña" class="form-password form-control" id="form-password" required>
			                        </div>
			                        <button type="submit"  class="btn">Ingresar</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>
	

			
</body>
</html>