
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

        <script src="./js/register.js"></script>

        <%
            Object error = request.getAttribute("error");
            Object success = request.getAttribute("success");
        %>

        <title>Register</title>
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
                            <div class="card-header">Register</div>
                            <div class="card-body">
                                <%if (success != null) {%>
                                <div class="forn-group row success">
                                    <div class="col-md-2"></div>
                                    <p class="col-md-10"><%= success.toString()%></p>
                                </div>
                                <%}%>

                                <form action="register" method="POST" onsubmit="return submitForm()">
                                    <!--Email Start-->
                                    <div class="form-group row">
                                        <label for="email-address" class="col-md-4 col-form-label text-md-right">E-Mail
                                            Address</label>
                                        <div class="col-md-6">
                                            <input type="text" id="email-address" class="form-control" name="email-address">
                                        </div>
                                    </div>

                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-email" style="color:red;"></p>
                                    </div>
                                    <!--Email End-->
                                    
                                    <!--First Name Start-->
                                    <div class="form-group row">
                                        <label for="first-name" class="col-md-4 col-form-label text-md-right">First Name</label>
                                        <div class="col-md-6">
                                            <input type="text" id="first-name" class="form-control" name="first-name">
                                        </div>
                                    </div>

                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-first-name" style="color:red;"></p>
                                    </div>
                                    <!--First Name End-->

                                    <!--Last Name Start-->
                                    <div class="form-group row">
                                        <label for="last-name" class="col-md-4 col-form-label text-md-right">Last Name</label>
                                        <div class="col-md-6">
                                            <input type="text" id="last-name" class="form-control" name="last-name">
                                        </div>
                                    </div>
                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-last-name" style="color:red;"></p>
                                    </div>
                                    <!--Last Name End-->

                                    <!--Gender Start-->
                                    <div class="form-group row">
                                        <label class="col-md-4 col-form-label text-md-right">Gender</label>
                                        <div class="col-md-6" style="display: flex; justify-content: space-around">
                                            <div style="display: flex">
                                                <label for="male" style="margin: auto 0">Male</label>
                                                <input type="radio" id="male" name="gender" value="Male" checked style="margin: auto 15px">
                                            </div>

                                            <div style="display: flex">
                                                <label for="female" style="margin: auto 0">Female</label>
                                                <input type="radio" id="female" name="gender" value="Female" style="margin: auto 15px">
                                            </div>
                                        </div>                                       
                                    </div>   
                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error"></p>
                                    </div>
                                    <!--Gender End-->
                                    
                                    <!--Phone Start-->
                                    <div class="form-group row">
                                        <label for="phone" class="col-md-4 col-form-label text-md-right">Phone Number</label>
                                        <div class="col-md-6">
                                            <input type="text" id="phone" class="form-control" name="phone">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-phone" style="color:red;"></p>
                                    </div>
                                    <!--Phone End-->
                                    
                                    <!--Password Start-->
                                    <div class="form-group row">
                                        <label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                        <div class="col-md-6">
                                            <input type="password" id="password" class="form-control" name="password">
                                        </div>
                                    </div>

                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-password" style="color:red;"></p>
                                    </div>
                                    <!--Phone End-->
                                    
                                    <!--Confirm Password Start-->
                                    <div class="form-group row">
                                        <label for="re-password" class="col-md-4 col-form-label text-md-right">Confirm Password</label>
                                        <div class="col-md-6">
                                            <input type="password" id="re-password" class="form-control" name="re-password">
                                        </div>
                                    </div>

                                    <div class="form-group row" style="margin-bottom: 0">
                                        <p class="col-md-6 offset-md-4 error" id="error-re-password" style="color:red;"></p>
                                    </div>
                                    <!--Confirm Password End-->
                                    
                                    <% if (error != null) {%>
                                    <div class="form-group row">
                                        <p class="col-md-6 offset-md-4 error" style="color:red;"><%= error.toString()%></p>
                                    </div>
                                    <%}%>

                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                            Register
                                        </button>
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