<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>장바구니 | Suit up</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- Place favicon.ico in the root directory -->
    <link rel="shortcut icon" type="image/x-icon" href="resources/images/favicon.ico">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    

    <!-- All css files are included here. -->
    <!-- Bootstrap fremwork main css -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <!-- Owl Carousel main css -->
    <link rel="stylesheet" href="resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="resources/css/owl.theme.default.min.css">
    <!-- This core.css file contents all plugings css file. -->
    <link rel="stylesheet" href="resources/css/core.css">
    <!-- Theme shortcodes/elements style -->
    <link rel="stylesheet" href="resources/css/shortcode/shortcodes.css">
    <!-- Theme main style -->
    <link rel="stylesheet" href="resources/style.css">
    <!-- Responsive css -->
    <link rel="stylesheet" href="resources/css/responsive.css">
    <!-- User style -->
    <link rel="stylesheet" href="resources/css/custom.css">


    <!-- Modernizr JS -->
    <script src="resources/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->  

    <!-- Body main wrapper start -->
    <div class="wrapper fixed__footer">
        <!-- Start Header Style -->
        <header id="header" class="htc-header header--3 bg__white">
            <!-- Start Mainmenu Area -->
            <div id="sticky-header-with-topbar" class="mainmenu__area sticky__header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-2 col-lg-2 col-sm-3 col-xs-3">
                            <div class="logo">
                                <a href="index.jsp">
                                    <img src="resources/images/logo/logo.png" alt="logo">
                                </a>
                            </div>
                        </div>
                        <!-- Start MAinmenu Ares -->
                        <div class="col-md-8 col-lg-8 col-sm-6 col-xs-6">
                            <nav class="mainmenu__nav hidden-xs hidden-sm">
                                <ul class="main__menu">
                                    <li class="drop"><a href="index.jsp">홈</a></li>
                                    <li class="drop"><a href="#">인기상품</a>
                                        <ul class="dropdown">
                                            <li><a href="#">아우터</a></li>
                                            <li><a href="#">상의</a></li>
                                            <li><a href="#">하의</a></li>
                                            <li><a href="#">신발</a></li>
                                            <li><a href="#">모자</a></li>
                                        </ul>
                                    </li>
                                    <li class="drop"><a href="#">카테고리</a>
                                        <ul class="dropdown mega_dropdown">
                                            <!-- Start Single Mega MEnu -->
                                            <li><a class="mega__title" href="#">카테고리별</a>
                                                <ul class="mega__item" id="tab">
                                                    <li id="tabLi1"><a href="#">아우터</a></li>
                                                    <li id="tabLi2"><a href="#">상의</a></li>
                                                    <li id="tabLi3"><a href="#">하의</a></li>
                                                    <li id="tabLi4"><a href="#">신발</a></li>
                                                    <li id="tabLi5"><a href="#">모자</a></li>
                                                </ul>
                                            </li>
                                            <!-- End Single Mega MEnu -->
                                            <!-- Start Single Mega MEnu -->
                                            <li id="tabUl1" style="display: block;"><a class="mega__title" href="#" >아우터</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">아우터 1</a></li>
                                                    <li><a href="#">아우터 2</a></li>
                                                    <li><a href="#">아우터 3</a></li>
                                               </ul>
                                            </li>
                                            <li id="tabUl2" style="display: block;"><a class="mega__title" href="#" >상의</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">상의 1</a></li>
                                                    <li><a href="#">상의 2</a></li>
                                                    <li><a href="#">상의 3</a></li>
                                               </ul>
                                            </li>
                                            <li id="tabUl3"><a class="mega__title" href="#" >하의</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">하의 1</a></li>
                                                    <li><a href="#">하의 2</a></li>
                                                    <li><a href="#">하의 3</a></li>
                                                    <li><a href="#">하의 4</a></li>
                                                    <li><a href="#">하의 5</a></li>
                                               </ul>
                                            </li>
                                            <li id="tabUl4"><a class="mega__title" href="#" >신발</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">신발 1</a></li>
                                                    <li><a href="#">신발 2</a></li>
                                                    <li><a href="#">신발 3</a></li>
                                                    <li><a href="#">신발 4</a></li>
                                                    <li><a href="#">신발 5</a></li>
                                               </ul>
                                            </li>
                                            <li id="tabUl5"><a class="mega__title" href="#" >모자</a>
                                                <ul class="mega__item">
                                                    <li><a href="#">모자 1</a></li>
                                                    <li><a href="#">모자 2</a></li>
                                                    <li><a href="#">모자 3</a></li>
                                                    <li><a href="#">모자 4</a></li>
                                                    <li><a href="#">모자 5</a></li>
                                               </ul>
                                            </li>
                                            <!-- End Single Mega MEnu -->
                                            <!-- Start Single Mega MEnu -->
                                            <li>
                                                <ul class="mega__item">
                                                    <li>
                                                        <div class="mega-item-img">
                                                            <a href="#">
                                                                <img src="" alt="">
                                                            </a>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </li>
                                            <!-- End Single Mega MEnu -->
                                        </ul>
                                    </li>
                                    <li><a href="cart.do">장바구니</a></li>
                                    <li><a href="#">결제하기</a></li>
                                    <!-- mem_admin 쿼리값이 1일때만 노출 -->
                                    <li class="drop"><a href="#">관리자 메뉴</a>
                                        <ul class="dropdown">
                                            <li><a href="#">상품 등록</a></li>
                                            <li><a href="#">상품 삭제</a></li>
                                            <li><a href="#">상품 수정</a></li>
                                        </ul>
                                    </li>
                                    
                                </ul>
                            </nav>
                            <div class="mobile-menu clearfix visible-xs visible-sm">
                                <nav id="mobile_dropdown">
                                    <ul>
                                        <li><a href="index.jsp">홈</a></li>
                                        <li><a href="#">인기상품</a>
                                            <ul>
                                                <li><a href="#">아우터</a></li>
                                                <li><a href="#">상의</a></li>
                                                <li><a href="#">하의</a></li>
                                                <li><a href="#">신발</a></li>
                                                <li><a href="#">모자</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">카테고리별</a>
                                            <ul>
                                                <li><a href="#">아우터</a></li>
                                                <li><a href="#">상의</a></li>
                                                <li><a href="#">하의</a></li>
                                                <li><a href="#">신발</a></li>
                                                <li><a href="#">모자</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="cart.do">장바구니</a></li>
                                        <li><a href="#">결제하기</a></li>
                                    </ul>
                                </nav>
                            </div>                          
                        </div>
                        <!-- End MAinmenu Ares -->
                        <div class="col-md-2 col-sm-4 col-xs-3">  
                            <ul class="menu-extra">
                                <li class="search search__open hidden-xs"><span class="ti-search"></span></li>
                                <li><a href="login-register.html"><span class="ti-user"></span></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="mobile-menu-area"></div>
                </div>
            </div>
            <!-- End Mainmenu Area -->
        </header>
        <!-- End Header Style -->
        
        <div class="body__overlay"></div>
        <!-- Start Offset Wrapper -->
        <div class="offset__wrapper">
            <!-- Start Search Popap -->
            <div class="search__area">
                <div class="container" >
                    <div class="row" >
                        <div class="col-md-12" >
                            <div class="search__inner">
                            <!-- 검색창 -->
                                <form action="#" method="get">
                                    <input placeholder="" type="text">
                                    <button type="submit"></button>
                                </form>
                                <div class="search__close__btn">
                                    <span class="search__close__btn_icon"><i class="zmdi zmdi-close"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End Search Popap -->
		</div>
        <!-- End Offset Wrapper -->
        <!-- Start Bradcaump area -->
        <div class="ht__bradcaump__area" style="background: rgba(0, 0, 0, 0) url(images/bg/2.jpg) no-repeat scroll center center / cover ;">
            <div class="ht__bradcaump__wrap">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="bradcaump__inner text-center">
                                <h2 class="bradcaump-title">Cart</h2>
                                <nav class="bradcaump-inner">
                                  <a class="breadcrumb-item" href="index.html">Home</a>
                                  <span class="brd-separetor">/</span>
                                  <span class="breadcrumb-item active">Cart</span>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Bradcaump area -->
        <!-- cart-main-area start -->
        <div class="cart-main-area ptb--120 bg__white">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <form action="#">               
                            <div class="table-content table-responsive">
                                <table>
                                    <thead>
                                        <tr>
                                            <th class="product-thumbnail">Image</th>
                                            <th class="product-name">Product</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                            <th class="product-remove">Remove</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="product-thumbnail"><a href="#"><img src="resources/images/product/4.png" alt="product img" /></a></td>
                                            <td class="product-name"><a href="#">Vestibulum suscipit</a></td>
                                            <td class="product-price"><span class="amount">£165.00</span></td>
                                            <td class="product-quantity"><input type="number" value="1" /></td>
                                            <td class="product-subtotal">£165.00</td>
                                            <td class="product-remove"><a href="#">X</a></td>
                                        </tr>
                                        <tr>
                                            <td class="product-thumbnail"><a href="#"><img src="resources/images/product/3.png" alt="product img" /></a></td>
                                            <td class="product-name"><a href="#">Vestibulum dictum magna</a></td>
                                            <td class="product-price"><span class="amount">£50.00</span></td>
                                            <td class="product-quantity"><input type="number" value="1" /></td>
                                            <td class="product-subtotal">£50.00</td>
                                            <td class="product-remove"><a href="#">X</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="row">
                                <div class="col-md-8 col-sm-7 col-xs-12">
                                    <div class="buttons-cart">
                                        <input type="submit" value="Update Cart" />
                                        <a href="#">Continue Shopping</a>
                                    </div>
                                    <div class="coupon">
                                        <h3>Coupon</h3>
                                        <p>Enter your coupon code if you have one.</p>
                                        <input type="text" placeholder="Coupon code" />
                                        <input type="submit" value="Apply Coupon" />
                                    </div>
                                </div>
                                <div class="col-md-4 col-sm-5 col-xs-12">
                                    <div class="cart_totals">
                                        <h2>Cart Totals</h2>
                                        <table>
                                            <tbody>
                                                <tr class="cart-subtotal">
                                                    <th>Subtotal</th>
                                                    <td><span class="amount">£215.00</span></td>
                                                </tr>
                                                <tr class="shipping">
                                                    <th>Shipping</th>
                                                    <td>
                                                        <ul id="shipping_method">
                                                            <li>
                                                                <input type="radio" /> 
                                                                <label>
                                                                    Flat Rate: <span class="amount">£7.00</span>
                                                                </label>
                                                            </li>
                                                            <li>
                                                                <input type="radio" /> 
                                                                <label>
                                                                    Free Shipping
                                                                </label>
                                                            </li>
                                                            <li></li>
                                                        </ul>
                                                        <p><a class="shipping-calculator-button" href="#">Calculate Shipping</a></p>
                                                    </td>
                                                </tr>
                                                <tr class="order-total">
                                                    <th>Total</th>
                                                    <td>
                                                        <strong><span class="amount">£215.00</span></strong>
                                                    </td>
                                                </tr>                                           
                                            </tbody>
                                        </table>
                                        <div class="wc-proceed-to-checkout">
                                            <a href="checkout.html">Proceed to Checkout</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form> 
                    </div>
                </div>
            </div>
        </div>
        <!-- cart-main-area end -->
        <!-- Start Footer Area -->
        <footer class="htc__foooter__area gray-bg">
            <div class="container">
                <div class="row">
                    <div class="footer__container clearfix">
                         <!-- Start Single Footer Widget -->
                        <div class="col-md-3 col-lg-3 col-sm-6">
                            <div class="ft__widget">
                                <div class="ft__logo">
                                    <a href="index.html">
                                        <img src="resources/images/logo/logo.png" alt="footer logo">
                                    </a>
                                </div>
                                <div class="footer-address">
                                    <ul>
                                        <li>
                                            <div class="address-icon">
                                                <i class="zmdi zmdi-pin"></i>
                                            </div>
                                            <div class="address-text">
                                                <p>194 Main Rd T, FS Rayed <br> VIC 3057, USA</p>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="address-icon">
                                                <i class="zmdi zmdi-email"></i>
                                            </div>
                                            <div class="address-text">
                                                <a href="#"> info@example.com</a>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="address-icon">
                                                <i class="zmdi zmdi-phone-in-talk"></i>
                                            </div>
                                            <div class="address-text">
                                                <p>+012 345 678 102 </p>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <ul class="social__icon">
                                    <li><a href="#"><i class="zmdi zmdi-twitter"></i></a></li>
                                    <li><a href="#"><i class="zmdi zmdi-instagram"></i></a></li>
                                    <li><a href="#"><i class="zmdi zmdi-facebook"></i></a></li>
                                    <li><a href="#"><i class="zmdi zmdi-google-plus"></i></a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- End Single Footer Widget -->
                        <!-- Start Single Footer Widget -->
                        <div class="col-md-3 col-lg-2 col-sm-6 smt-30 xmt-30">
                            <div class="ft__widget">
                                <h2 class="ft__title">Categories</h2>
                                <ul class="footer-categories">
                                    <li><a href="shop-sidebar.html">Men</a></li>
                                    <li><a href="shop-sidebar.html">Women</a></li>
                                    <li><a href="shop-sidebar.html">Accessories</a></li>
                                    <li><a href="shop-sidebar.html">Shoes</a></li>
                                    <li><a href="shop-sidebar.html">Dress</a></li>
                                    <li><a href="shop-sidebar.html">Denim</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- Start Single Footer Widget -->
                        <div class="col-md-3 col-lg-2 col-sm-6 smt-30 xmt-30">
                            <div class="ft__widget">
                                <h2 class="ft__title">Infomation</h2>
                                <ul class="footer-categories">
                                    <li><a href="about.html">About Us</a></li>
                                    <li><a href="contact.html">Contact Us</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                    <li><a href="#">Returns & Exchanges</a></li>
                                    <li><a href="#">Shipping & Delivery</a></li>
                                    <li><a href="#">Privacy Policy</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- Start Single Footer Widget -->
                        <div class="col-md-3 col-lg-3 col-lg-offset-1 col-sm-6 smt-30 xmt-30">
                            <div class="ft__widget">
                                <h2 class="ft__title">Newsletter</h2>
                                <div class="newsletter__form">
                                    <p>Subscribe to our newsletter and get 10% off your first purchase .</p>
                                    <div class="input__box">
                                        <div id="mc_embed_signup">
                                            <form action="#" method="post" id="mc-embedded-subscribe-form" name="mc-embedded-subscribe-form" class="validate" target="_blank" novalidate>
                                                <div id="mc_embed_signup_scroll" class="htc__news__inner">
                                                    <div class="news__input">
                                                        <input type="email" value="" name="EMAIL" class="email" id="mce-EMAIL" placeholder="Email Address" required>
                                                    </div>
                                                    <!-- real people should not fill this in and expect good things - do not remove this or risk form bot signups-->
                                                    <div style="position: absolute; left: -5000px;" aria-hidden="true"><input type="text" name="b_6bbb9b6f5827bd842d9640c82_05d85f18ef" tabindex="-1" value=""></div>
                                                    <div class="clearfix subscribe__btn"><input type="submit" value="Send" name="subscribe" id="mc-embedded-subscribe" class="bst__btn btn--white__color">
                                                        
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>        
                                </div>
                            </div>
                        </div>
                        <!-- End Single Footer Widget -->
                    </div>
                </div>
                <!-- Start Copyright Area -->
                <div class="htc__copyright__area">
                    <div class="row">
                        <div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
                            <div class="copyright__inner">
                                <div class="copyright">
                                    <p>© 2017 <a href="https://freethemescloud.com/">Free themes Cloud</a>
                                    All Right Reserved.</p>
                                </div>
                                <ul class="footer__menu">
                                    <li><a href="index.html">Home</a></li>
                                    <li><a href="shop.html">Product</a></li>
                                    <li><a href="contact.html">Contact Us</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End Copyright Area -->
            </div>
        </footer>
        <!-- End Footer Area -->
    </div>
    <!-- Body main wrapper end -->
    <!-- Placed js at the end of the document so the pages load faster -->

    <!-- jquery latest version -->
    <script src="resources/js/vendor/jquery-1.12.0.min.js"></script>
    <!-- Bootstrap framework js -->
    <script src="resources/js/bootstrap.min.js"></script>
    <!-- All js plugins included in this file. -->
    <script src="resources/js/plugins.js"></script>
    <script src="resources/js/slick.min.js"></script>
    <script src="resources/js/owl.carousel.min.js"></script>
    <!-- Waypoints.min.js. -->
    <script src="resources/js/waypoints.min.js"></script>
    <!-- Main js file that contents all jQuery plugins activation. -->
    <script src="resources/js/main.js"></script>

</body>

</html>