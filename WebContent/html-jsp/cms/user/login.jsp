<%@taglib uri="http://www.springframework.org/tags/form" prefix="Form"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>User Login | TWO+ CMS</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">
	<div class="text-center">
		<h1 class="logo-name">TWO+</h1>
	</div>
	
    <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>
            <h3>Welcome to TWO+</h3>
            <p>Please login to TWO+ CMS. Login entry point.</p>
            
            <Form:form action="cms/user/dologin.do" method="post" commandName="user">
                <div class="form-group">
                    <Form:input type="text" placeholder="name" required="required" value="" name="username" id="username" class="form-control" path="name" autocomplete="off"/>
                </div>
                <div class="form-group">
                    <Form:input type="password" placeholder="password" required="required" value="" name="password" id="password" class="form-control" path="password" autocomplete="off"/>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Login</button>

                <a href="#"><small>Forgot password?</small></a>
                <p class="text-muted text-center"><small>Do not have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
            </Form:form>
            
            <p class="m-t"> <small>TWO+ Content Management System &copy; 2016 - 2017. <br> All Rights Reserved by YG Studio.</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>

</body>

</html>

