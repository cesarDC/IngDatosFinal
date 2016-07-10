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
<body class="fullscreen_bg">
	<div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Bootstrap</strong> Login Form</h1>
                            <div class="description">
                            	<p>
	                            	This is a free responsive login form made with Bootstrap. 
	                            	Download it on <a href="http://azmind.com"><strong>AZMIND</strong></a>, customize and use it as you like!
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Login to our site</h3>
                            		<p>Enter your username and password to log on:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-lock"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="form-username" placeholder="Username..." class="form-username form-control" id="form-username" required>
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="form-password" placeholder="Password..." class="form-password form-control" id="form-password" required>
			                        </div>
			                        <button type="submit" class="btn">Sign in!</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>
	

			
</body>
</html>