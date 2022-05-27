<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!------ Include the above in your HEAD tag ---------->

<!doctype html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Fonts -->
        <link rel="dns-prefetch" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="./css/login.css">

        <script src="./js/login.js"></script>
        <% Object error = request.getAttribute("error");%>
        <title>Login</title>
    </head>

    <body>

        <nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
            <div class="container">             
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="login">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="register">Register</a>
                        </li>
                    </ul>

                </div>
            </div>
        </nav>
        <main class="login-form">
            <div class="cotainer">
                <div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">Login</div>
                            <div class="card-body">
                                <form action="login" method="POST" onsubmit="return submitForm()">
                                    <div class="form-group row">
                                        <label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail
                                            Address</label>
                                        <div class="col-md-6">
                                            <input type="text" id="email-address" class="form-control" name="email-address" value="${emailCookie}">
                                        </div>

                                    </div>

                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-email" style="color:red;"></p>
                                    </div>

                                    <div class="form-group row">
                                        <label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                        <div class="col-md-6">
                                            <input type="password" id="password" class="form-control" name="password" value="${passCookie}">
                                        </div>
                                    </div>
                                        
                                     <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-password" style="color:red;"></p>
                                    </div>   

                                    <div class="form-group row">
                                        <div class="col-md-6 offset-md-4">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" name="remember" ${rememberCookie != null ? "checked":""}> Remember Me
                                                </label>
                                            </div>
                                        </div>
                                    </div>

                                    <% if (error != null) {%>
                                    <div class="form-group row">
                                        <p class="col-md-6 offset-md-4 error" style="color:red;"><%= error.toString()%></p>
                                    </div>
                                    <%}%>

                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                            Login
                                        </button>
                                        <a href="reset" class="btn btn-link">
                                            Forgot Your Password?
                                        </a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </main>

</body>

</html>