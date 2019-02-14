<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="main-content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="panel">
					<div class="panel-heading">
						<h3 class="panel-title">资产类别管理</h3>
						</div>
							<div class="panel-body">
							<div class="col-md-3 col-md-offset-3"></div>
  							<div class="col-md-3 col-md-offset-3"></div>
								<table class="table table-striped">
								<thead>
									<tr>
										<th>编号</th>	
										<th>名称</th>
										<th>人数</th>
										<th>工资系数</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
								<c:forEach items="${departList}" var="d">
								<tr>
								<td>${d.id }</td>
								<td>${d.departmentalName }</td>
									<td>${d.personsNum }</td>
									<td>${d.wageCoefficient}</td> 
									<td>
									<button type="button" onclick="js_xiu1('${d.id }','${d.departmentalName }','${d.personsNum }','${d.wageCoefficient}')" class="btn btn-primary btn-xs">修改</button>
									<button type="button" class="btn btn-danger btn-xs">删除</button>
									</td>
									</tr>
						  </c:forEach>
							
							</tbody>
						</table>
								  <ul>
				<li>共${ps.totalCount }条记录&nbsp;&nbsp; 第${ps.currPageNo }/${ps.totalPageCount }页
				</li>
				<a href="javascript:void(0);" onclick="firstPage()">首页</a>
				<a href="javascript:void(0);" onclick="upPage()">上一页</a>
				<a href="javascript:void(0);" onclick="dowmPage()">下一页</a>
				<a href="javascript:void(0);" onclick="lastPage()">最后一页</a>
				&nbsp;&nbsp;
			</ul>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="${pageContext.request.contextPath }/statics/assets/js/Table_js/table1.js"></script>
<input type="hidden" id="pageNoUp" value="${ps.currPageNo-1}"/>
<input type="hidden" id="pageNoDom" value="${ps.currPageNo+1}"/>
<input type="hidden" id="pageNoLast" value="${ps.totalPageCount}"/>


