<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="main-content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="panel">
					<div class="panel-heading">
						<h3 class="panel-title">个人密码信息</h3>
						</div>
							<div class="panel-body">
								<table class="table table-striped">
								<div class="col-md-3 col-md-offset-3"></div>
  								
									<thead>
										<tr>
											<th>原密码</th>
											<th>新密码</th>
										</tr>
								</thead>
							<tbody>
							<tr>
								<td><input type="password"  name="password" id="password" value="" placeholder="请输入原密码"></td>
								<td><input type="password"  name="password" id="password" value="" placeholder="请输新入密码"></td>
							</tr>
							<div class="col-md-3 col-md-offset-3"><button type="button" class="btn btn-info btn-sm">确认</button></div>
							</tbody>
						</table>
						
							
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

