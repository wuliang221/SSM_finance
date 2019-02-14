<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<script src="${pageContext.request.contextPath }/statics/assets/js/Myjsp.js"></script>

<!-- 部门信息添加模态框 -->

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel1"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">名称</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="departmentalname" id="inputEmail11" placeholder="部门名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">人数</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="personsnum" id="inputEmail12" placeholder="部门人数">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">工资系数</label>
		    <div class="col-sm-10">
		      <input type="tezt" class="form-control" name="wagecoefficient" id="inputEmail13" placeholder="部门工资系数">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
  <button type="button" class="btn btn-default" onclick="js_zeng('1')">保存</button>
        
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>




<!-- 职工信息模态框 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel2"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">部门	</label>
		    <div class="col-sm-10" id="depart">
		      <select class="form-control" id="inputEmail21">
		      <c:forEach items="${depalist}" var="d">
		      	 <option value="${d.id}">${d.departmentalName}</option>
		      	 </c:forEach>
				</select>
				
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail22" placeholder="姓名">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
		    <div class="col-sm-10">
		      <label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail23" value="0" checked="checked"> 男
				</label>
				<label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail23" value="1"> 女
				</label>
		    </div>
		    </div>	
		    <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">入职时间</label>
		   		<div class="col-sm-10">
		            <a class='input-group date' id='datetimepicker1' >
		                <input type='text' class="form-control" id='test1' placeholder="请选择日期" />
		                <span class="input-group-addon" >
		                    <span class="glyphicon glyphicon-calendar" ></span>
		                </span>
		            </a>
		   		</div>
		  	</div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('2')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>






<!-- 职工工资模态框 -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel3"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">员工姓名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail31" placeholder="姓名">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">基本工资</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail32" placeholder="工资">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">职校补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail33" placeholder="职校补贴">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">工龄补贴</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail34" placeholder="工龄补贴">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('3')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>









<!-- 资产类别模态框 -->
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel4"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">类别编号</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail41" placeholder="编号">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产类名</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail42" placeholder="名称">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('4')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>





<!-- 资产信息模态框 -->
<div class="modal fade" id="myModal5" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel5"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产类别</label>
		    <div class="col-sm-10">
		      <select class="form-control" id="inputEmail51">
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资1</option>
				  <option>投资5</option>
				</select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">资产信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail52" placeholder="名称">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('5')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>




<!-- 资产信息模态框 -->
<div class="modal fade" id="myModal6" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel6"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">经营信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail61" placeholder="名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">投入</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail62" placeholder="999,99">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">营收</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail63" placeholder="999,99">
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('6')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>







<!-- 费用信息模态框 -->
<div class="modal fade" id="myModal7" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel7"></h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">费用信息</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail71" placeholder="名称">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">金额</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail72" placeholder="999,99">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
		    <div class="col-sm-10">
		      <label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail73" value="1" checked="checked"> 已报
				</label>
				<label class="radio-inline">
				  <input type="radio" name="inlineRadioOptions" id="inputEmail73" value="2"> 未报
				</label>
		    </div>
		    </div>	
		   
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="js_zeng('7')">保存</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
      </div>
    </div>
  </div>
</div>

