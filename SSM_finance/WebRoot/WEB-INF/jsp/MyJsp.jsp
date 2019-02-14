<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Home</title>
    
    <!-- 时间控件 -->
	<script src="${pageContext.request.contextPath }/statics/layDate-v5.0.9/laydate/laydate.js"></script>
    
     <!-- 引入bootstrap框架 -->
    <link href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/linearicons/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/chartist/css/chartist-custom.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath }/statics/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="${pageContext.request.contextPath }/statics/assets/img/favicon.png">
  </head>
  
  <body>
	<div id="wrapper">
		<!-- 引入模态框 -->
		<jsp:includepage="module/modal_box.jsp"/>
		<!-- 引入网页头部 -->
		<jsp:includepage="module/head.jsp"/>
		<!-- 引入选择框 -->
		<jsp:includepage="module/left.jsp"/>
		<div class="main">
			<!-- 数据显示框 -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">Copyright &copy; 2017.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家"></a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank"></a></p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="${pageContext.request.contextPath }/statics/assets/vendor/jquery/jquery.min.js"></script>	
	<script src="${pageContext.request.contextPath }/statics/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/statics/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="${pageContext.request.contextPath }/statics/assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="${pageContext.request.contextPath }/statics/assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="${pageContext.request.contextPath }/statics/assets/scripts/klorofil-common.js"></script>
	
	<script src="${pageContext.request.contextPath }/statics/assets/js/Myjsp.js"></script>
	<script>
	
	</script>
	<input type="hidden" id="url" value="${pageContext.request.contextPath }">
  </body>
</html>
