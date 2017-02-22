<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>INSPINIA | Login</title>

    <link href="theme/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="theme/assets/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="theme/assets/css/animate.css" rel="stylesheet">
    <link href="theme/assets/css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

               <!--  <h1 class="logo-name">IN+</h1>
 -->
            </div>
            <p>Login in. To see it in action.</p>
            <form class="m-t" method="POST" action="${contextPath}/login">
                <div class="form-group ${error != null ? 'has-error' : ''}">
                <span>${message}</span>
                    <input name="username" type="text" class="form-control" placeholder="Username" required="" autofocus="true">
                </div>
                <div class="form-group">
                    <input name="password" type="password" class="form-control" placeholder="Password" required="">
                     <span>${error}</span>
                     <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Login</button>

                <a href="#"><small>Forgot password?</small></a>
                <p class="text-muted text-center"><small>Do not have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="${contextPath}/novo-usuario">Create an account</a>
            </form>
            <p class="m-t"> <small>Desenvolvido em fevereiro de 2017</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="theme/assets/js/jquery-2.1.1.js"></script>
    <script src="theme/assets/js/bootstrap.min.js"></script>

</body>

</html>
