<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
    <!-- 引入bootstrap框架 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/assets/js/jquery-1.12.4.js"></script>
    <link href="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/statics/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    

	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/vendor/linearicons/style.css">
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
		<div class="vertical-align-wrap">
			<div class="vertical-align-middle">
				<div class="auth-box">
					<div class="left">
						<div class="content">
							<div class="header">
								<div class="logo text-center"><img src="${pageContext.request.contextPath }/statics/assets/img/logo-dark.png" alt="Klorofil Logo"></div>
								<p class="lead">登录到您的帐户</p>
							</div>
							<form class="form-auth-small" action="index.php">
								<div class="form-group">
									<input type="text" class="form-control" id="signin-id" value="" placeholder="请输入账号">
								</div>
								<div class="form-group">
									<input type="password" class="form-control" id="signin-password" value="" placeholder="请输入密码">
								</div>

								<select class="form-control" id="signin-status">
									<option value="0">请选择登录身份</option>
									<option value="1">管理员</option>
									<option value="2">职工</option>
								</select>

								<button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
								<div class="bottom">
									<div class="bottom1"></div>
									<span class="helper-text"><i class="fa fa-lock"></i> <a href="#">忘记密码请联系管理员</a></span>
								</div>
							</form>
						</div>
					</div>
					<div class="right">
						<div class="overlay"></div>
						<div class="content text">
							<h1 class="heading">企业财务管理系统</h1>
							<p>登陆后台管理</p>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!-- END WRAPPER -->
	<script src="${pageContext.request.contextPath }/statics/assets/js/jquery-1.12.4.js"></script>
	<script>
		//点击删除提示信息
		$(document).on("click","#close",function(){
            $(".bottom1").html("");
   		});
	
		//表单非空验证
        $("form").submit(function(e){
        	var pd=false;
        	//获取账号
        	var id=$("#signin-id").val();
        	//获取密码
        	var pass=$("#signin-password").val();
        	//获取身份
        	var status=$("#signin-status").val();
        	//获取url
        	var url=$("#url").val();
        	if("" == id || null == id){
        		$(".bottom1").html("<div class='alert alert-warning'>"+
									"<a id='close' class='close' data-dismiss='alert'>&times;"+
									"</a><strong>提示！</strong>账号不能为空！</div>'");
        		return pd;
        	}else if("" == pass || null == pass){
        		$(".bottom1").html("<div class='alert alert-warning'>"+
									"<a id='close' class='close' data-dismiss='alert'>&times;"+
									"</a><strong>提示！</strong>密码不能为空！</div>'");
        		return pd;
        	}else if("0" == status || "" == status || null == status){
        		$(".bottom1").html("<div class='alert alert-warning'>"+
									"<a id='close' class='close' data-dismiss='alert'>&times;"+
									"</a><strong>提示！</strong>请选择用户身份！</div>'");
        		return pd;
        	}
        	
        	$.ajax({
				type :"post",
				url:url+"/login/first.html",
				data:{name:id,password:pass,choose:status},
				dataType:"json",	
				success : function(data) {
				if(data == "session1"){
						window.location.href=url+"/login/index.html";
					}
					pd=true;
				},
				error : function() {
					alert("未知原因导致失败！");
					return false;
				}
			});
        	
        	
        	alert("尾部代码！！")
        	return false;
		});
		
        
	</script>
	<input type="hidden" id="url" value="${pageContext.request.contextPath }">
  </body>
</html>
