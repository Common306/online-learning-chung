
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
        <title>Forgot password</title>

        <%
            Object success = request.getAttribute("success");
        %>
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
                            <div class="card-header">Forgot password</div>
                            <div class="card-body">

                                <%if (success != null) {%>
                                    <div class="forn-group row success">
                                        <div class="col-md-2"></div>
                                        <p class="col-md-10"><%= success.toString() %></p>
                                    </div>
                                <%}%>

                                <form action="reset" method="POST" onsubmit="return submitForm()">
                                    <div class="form-group row">
                                        <label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail
                                            Address</label>
                                        <div class="col-md-6">
                                            <input type="text" id="email_address" class="form-control" name="email-address">
                                        </div>
                                    </div>

                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">
                                            Send
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <script>
            function submitForm() {
                var valueEmail = document.getElementById("email-address").value;
                if (valueEmail === "") {
                    document.getElementById("error-email").innerHTML = "Email must not be empty";
                    return false;
                } else {
                    document.getElementById("error-email").innerHTML = "";
                }
                return true;
            }
        </script>

    </body>

</html>