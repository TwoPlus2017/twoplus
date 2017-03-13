<%@taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New WebSite | TWO+ CMS</title>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="../../css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="../../css/animate.css" rel="stylesheet">
    <link href="../../css/style.css" rel="stylesheet">
    <link href="../../css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">
</head>

<body>
<div id="wrapper">
	<jsp:include page="../menu.jsp"></jsp:include>

        <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom">
        <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
            <form role="search" class="navbar-form-custom" action="search_results.html">
                <div class="form-group">
                    <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                </div>
            </form>
        </div>
            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <span class="m-r-sm text-muted welcome-message">Welcome to TWO+ CMS.</span>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/a7.jpg">
                                </a>
                                <div class="media-body">
                                    <small class="pull-right">46h ago</small>
                                    <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/a4.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right text-navy">5h ago</small>
                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/profile.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right">23h ago</small>
                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                    <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="mailbox.html">
                                    <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="mailbox.html">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="profile.html">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="grid_options.html">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="notifications.html">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>


                <li>
                    <a href="login.html">
                        <i class="fa fa-sign-out"></i> Log out
                    </a>
                </li>
            </ul>

        </nav>
        
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2><strong>Add New WebSite</strong></h2>
                    <ol class="breadcrumb">
                        <li>
                            <a>WebSite</a>
                        </li>
                        <li class="active">
                            <strong>Add New</strong>
                        </li>
                    </ol>
                </div>
                <div class="col-lg-2">

                </div>
            </div>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
            <div class="col-lg-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>WebSite form <small>to add new one websie</small></h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    
                    <div class="ibox-content">
                        <div class="row">
                            <div class="col-sm-8 b-r">
                            	
                            		<sform:form action="addwebsite.do" method="post" commandName="webSite" role="form">
                            			<div class="clear">
		                                    <div class="form-group col-sm-6">
		                                    	<sform:label path="name">Name *</sform:label>
		                                    	<sform:input path="name" name="name" placeholder="xxx" type="text" class="form-control required" />
		                                    </div>
											<div class="form-group col-sm-6">
												<sform:label path="showName">Show Name *</sform:label>
												<sform:input path="showName" name="showName" placeholder="xxx" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-6">
		                                    	<sform:label path="domainName">Domain Name *</sform:label>
		                                    	<sform:input path="domainName" name="domainName" placeholder="xxx.com" type="text" class="form-control required" />
		                                    </div>
		                                    <div class="form-group col-sm-3">
												<sform:label path="">Port *</sform:label>
												<sform:input path="" name="port" placeholder="8101" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="code">Code *</sform:label>
												<sform:input path="code" name="code" placeholder="xxx" type="text" class="form-control required" />
											</div>
		                                    <div class="form-group col-sm-3">
												<sform:label path="">Busness Type *</sform:label>
												<sform:input path="" name="business type" placeholder="hatcover" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">ES Index</sform:label>
												<sform:input path="" name="esIndex" placeholder="swsb" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">ES Article Type</sform:label>
												<sform:input path="" name="esArticleType" placeholder="" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">ES Post Type</sform:label>
												<sform:input path="" name="esPortType" placeholder="" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Article Extends</sform:label>
												<sform:input path="" name="articleExtends" placeholder="Y" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Has Cat</sform:label>
												<sform:input path="" name="hasCat" placeholder="N" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Related Articles</sform:label>
												<sform:input path="" name="relatedArticleNum" placeholder="5" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Related Contents</sform:label>
												<sform:input path="" name="relatedContentNum" placeholder="10" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Template</sform:label>
												<sform:input path="" name="wsTemplate" placeholder="" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Industry</sform:label>
												<sform:input path="" name="industryId" placeholder="Bank" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-3">
												<sform:label path="">Link to</sform:label>
												<sform:input path="" name="linkTo" placeholder="internal" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-12">
												<sform:label path="">Home Page Title *</sform:label>
												<sform:input path="" name="homePageTitle" placeholder="title" type="text" class="form-control required" />
											</div>
											<div class="form-group col-sm-12">
												<sform:label path="">Description *</sform:label>
												<sform:input path="" name="description" placeholder="desc" type="text" class="form-control required" />
											</div>
		                                </div>
		                                <div class="hr-line-dashed"></div>
	                                    <div>
	                                        <button class="btn btn-primary pull-right m-t-n-xs" type="submit"><strong>Add new</strong></button>
	                                    </div>
	                                </sform:form>
                            	
                            </div>
                            <div class="col-sm-4">
                            	<h4>Business type desc <small>what's the website likes</small></h4>
                            	<p class="text-center">
                                    <a href=""><i class="fa fa-info big-icon"></i></a>
                                </p>
                            	<h4>WebSite preview <small>you can click to go</small></h4>
                                <p class="text-center">
                                    <a href=""><i class="fa fa-picture-o big-icon"></i></a>
                                </p>
                                <h4>WebSite template preview <small>current using</small></h4>
                                <p class="text-center">
                                    <a href=""><i class="fa fa-file-image-o big-icon"></i></a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </div>
        <div class="footer">
            <div class="pull-right">
                10GB of <strong>250GB</strong> Free.
            </div>
            <div>
                <strong>Copyright</strong> Example Company &copy; 2014-2017
            </div>
        </div>

        </div>
        </div>


    <!-- Mainly scripts -->
    <script src="../../js/jquery-2.1.1.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="../../js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <!-- Custom and plugin javascript -->
    <script src="../../js/inspinia.js"></script>
    <script src="../../js/plugins/pace/pace.min.js"></script>

    <!-- iCheck -->
    <script src="../../js/plugins/iCheck/icheck.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
</body>

</html>
