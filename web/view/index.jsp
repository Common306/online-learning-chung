<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
        integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/index.css">
    <title>Document</title>
</head>

<body>

    <!-- Navbar Start -->
    <nav class="navbar">
        <a href="home" class="navbar-brand">
            <h2><i class="fa-solid fa-book"></i>eLEARNING</h2>
        </a>
        <div class="navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                <a href="home" class="nav-item nav-link active">Home</a>
                <a href="courses.html" class="nav-item nav-link">Courses</a>
                <a href="blog.html" class="nav-item nav-link">Blog</a>
            </div>
            <a href="login" class="btn-primary">Join Now<i class="fa-solid fa-arrow-right"></i></a>
        </div>
    </nav>
    <!-- Navbar End -->

    <!-- Slider Start -->

    <div class="slider-container">

        <div class="slider-item mySlide_current">
            <i class="slide-icon-right fas fa-angle-right" onclick="plusSlides(1)"></i>
            <i class="slide-icon-left fas fa-angle-left" onclick="plusSlides(-1)"></i>
            <img src="img/carousel-1.jpg" alt="">
            <div class="slider-desc-parent">
                <div class="slider-desc">
                    <h5>Best Online Courses</h5>
                    <h1>The Best Online Learning Platform</h1>
                    <p>Vero elitr justo clita lorem. Ipsum dolor at sed stet sit diam no.
                        Kasd rebum ipsum et diam justo clita et kasd rebum sea sanctus eirmod elitr.</p>
                    <a href="courses.html" class="">Join Now</a>
                </div>
            </div>
        </div>

        <div class="slider-item mySlide_current">
            <i class="slide-icon-right fas fa-angle-right" onclick="plusSlides(1)"></i>
            <i class="slide-icon-left fas fa-angle-left" onclick="plusSlides(-1)"></i>
            <img src="img/carousel-2.jpg" alt="">
            <div class="slider-desc-parent">
                <div class="slider-desc">
                    <h5>Best Online Courses</h5>
                    <h1>The Best Online Learning Platform</h1>
                    <p>Vero elitr justo clita lorem. Ipsum dolor at sed stet sit diam no.
                        Kasd rebum ipsum et diam justo clita et kasd rebum sea sanctus eirmod elitr.</p>
                    <a href="courses.html" class="">Join Now</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Slider End -->

    <div class="footer">
        <ul>
            <li>
                <h4>Contact</h4>
                <p><i class="fa-solid fa-location-dot"></i>Ha Noi, Viet Nam</p>
                <p><i class="fa-solid fa-phone"></i>+84 123 456 789</p>
                <p><i class="fa-solid fa-envelope"></i>Email@gmail.com</p>
            </li>
            <li>
                <h4>Gallery</h4>
                <div class="gallery-img">
                    <img src="img/course-1.jpg" alt="">
                    <img src="img/course-2.jpg" alt="">
                    <img src="img/course-3.jpg" alt="">
                    <img src="img/course-3.jpg" alt="">
                    <img src="img/course-1.jpg" alt="">
                    <img src="img/course-2.jpg" alt="">

                </div>
            </li>
            <li>
                <h4>Newsletter</h4>
                <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>
            </li>
        </ul>
    </div>

    <script src="js/home.js"></script>
</body>

</html>