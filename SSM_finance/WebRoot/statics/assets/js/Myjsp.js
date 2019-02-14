//打开显示表格
function js_table(date) {
	var lianjie=$("#url").val();
	var com="";
	if(date==1){
		com="/depart/depart.html";
	}else if(date==2){
		com="/employess/empList.html";
	}else if(date==3){
		com="/paryroll/paryroll.html";
	}else if(date==4){
		com="/assetcategory/assetcategory.html";
	}else if(date==5){
		com="/assetsinformation/assetsinformation.html";
	}else if(date==6){
		com="/businessin/businessin.html";
	}else if(date==7){
		com="/costlist/costlist.html";
	}else if(date==8){
		com="";
	}else if(date==9){
		com="/admin/change.html";
	}
	$.ajax({
		type :"get",
		url:$("#url").val()+"/left/bg"+date,
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+com);
		$(".main").html(data);
		},
		error : function() {
			alert("失败1");
		}
	});
}	


//清空模态框数据
//清空模态框数据
function js_qmodal(a,b,c){
	var j="#myModalLabel"+a;
	$(j).text(b);
	for(var i=1;i<=c;i++){
		$("#inputEmail"+a+i).val("");
	}
}

//显示模态框
function js_modal(date) {
	if(date == "1"){
		js_qmodal("1","部门信息添加",3);
		$("#myModal1").modal({
			backdrop:"static"
		});
	}else if(date == "2"){
		$("#myModalLabel2").text("职工信息添加");
		$("#myModal2 select").val("");
		$("#inputEmail22").val("");
		$("#myModal2 input[name=inlineRadioOptions]").val(["1"]);
		$("#test1").val("");
		$("#myModal2").modal({
			backdrop:"static"
		});
	}else if(date == "3"){
		js_qmodal("3","职工工资添加",4);
		$("#myModal3").modal({
			backdrop:"static"
		});
	}else if(date == "4"){
		js_qmodal("4","资产类别添加",1);
		$("#myModal4").modal({
			backdrop:"static"
		});
	}else if(date == "5"){
		js_qmodal("5","经营信息添加",3);
		$("#myModal5").modal({
			backdrop:"static"
		});
	}else if(date == "6"){
		js_qmodal("6","费用信息添加",2);
		$("#myModal6").modal({
			backdrop:"static"
		});
	}else if(date == "7"){
		js_qmodal("7","费用信息添加",2);
		$("#myModal7 input[name=inlineRadioOptions]").val(["1"]);
		$("#myModal7").modal({
			backdrop:"static"
		});
	}else if(date == "8"){
		js_qmodal("2","部门信息添加",3);
		$("#myModal8").modal({
			backdrop:"static"
		});
	}else if(date == "9"){
		js_qmodal("2","部门信息添加",3);
		$("#myModal9").modal({
			backdrop:"static"
		});
	}
	
}




/*
function js_table(data=1) {
	var lianjie=$("#url").val();
	$.ajax({
		type :"get",
		url:$("#url").val()+"/left/bg1",
		dataType:"html",
		success : function(data) {
		$(".main").load(lianjie+"/depart/depart.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table2() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg2",
		dataType:"html",
		success : function(data) {
		$(".main").load(lianjie+"/employess/empList.html")
		$(".main").html(data);
		
		},
		error : function() {
			alert("失败");
		}
	})
}

function js_table3() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg3",
		dataType:"html",
		success : function(data) {
		$(".main").load(lianjie+"/paryroll/paryroll.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table4() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg4",
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+"/assetcategory/assetcategory.html")
			$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table5() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg5",
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+"/assetsinformation/assetsinformation.html")
			$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table6() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg6",
		dataType:"html",
		success : function(data) {
		$(".main").load(lianjie+"/businessin/businessin.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table7() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg7",
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+"/costlist/costlist.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}	

function js_table8() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg8",
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+"/depart/depart.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}

function js_table9() {
	var lianjie=$("#tou").val();
	$.ajax({
		type :"get",
		url:$("#tou").val()+"/left/bg9",
		dataType:"html",
		success : function(data) {
			$(".main").load(lianjie+"/admin/change.html")
		$(".main").html(data);
		},
		error : function() {
			alert("失败");
		}
	})
}



*/




//数据添加js
function js_zeng(date) {
	$('#myModal').modal('toggle');
	//Ajax地址
	var url=$("#url").val();
	var url2="";
	//Ajax请求参数
	var data2="";
	if(date == 1){
		url+="/depart/doadd.html";
		var z11=$("#inputEmail11").val();
		var z12=$("#inputEmail12").val();
		var z13=$("#inputEmail13").val();
		data2={departmentalName:z11,personsNum:z12,wageCoefficient:z13};
	}else if(date == 2){
		url+="";
		var z21=$("#inputEmail21").val();
		var z22=$("#inputEmail22").val();
		var z23=$("#inputEmail23").val();
		data2={departmentalName:z21,personsNum:z22,wageCoefficient:z23};
	}else if(date == "3"){
		var z1=$("#inputEmail31").val();
		var z2=$("#inputEmail32").val();
		var z3=$("#inputEmail33").val();
		var z4=$("#inputEmail34").val();
		
	}else if(date == "4"){
		var z1=$("#inputEmail41").val();
		var z2=$("#inputEmail42").val();
		
	}else if(date == "5"){
		var z1=$("#inputEmail51").val();
		var z2=$("#inputEmail52").val();
		
	}else if(date == "6"){
		var z1=$("#inputEmail61").val();
		var z2=$("#inputEmail62").val();
		var z3=$("#inputEmail63").val();
		
	}else if(date == "7"){
		var z1=$("#inputEmail71").val();
		var z2=$("#inputEmail72").val();
		var z3=$("#inputEmail73").val();
		
	}else if(date == "8"){
		
	}else if(date == "9"){
		
	}else{
		alert("网页出现错误");
		return;
	}
	$.ajax({
		type :"post",
		url:url,
		data:data2,
		dataType:"json",	
		success : function(data) {
			if(data!=null){
			$('#myModal1').modal('toggle');
			alert("添加成功！");
			}
		},
		error : function(data) {
			alert("添加失败！");
		}
	});
	
	
}


//修改数据赋值
function js_xiu1(id,id1,id2,id3) {
	$("#myModalLabel1").text("部门信息修改");
	$("#inputEmail11").val(id1);
	$("#inputEmail12").val(id2);
	$("#inputEmail13").val(id3);
	$("#myModal1").modal({backdrop:"static"});
	
}
function js_xiu2(id,id1,id2,id3) {
	$("#myModalLabel2").text("职工信息修改");
	$("#myModal2 select").val([id]);
	$("#inputEmail22").val(id1);
	$("#myModal2 input[name=inlineRadioOptions]").val([id2]);
	$("#test1").val(id3);
	$("#myModal2").modal({backdrop:"static"});
}
function js_xiu3(date,name,id,id1,id2,id3) {
	$("#myModalLabel3").text("职工工资修改");
	$("#inputEmail31").val(id);
	$("#inputEmail32").val(id1);
	$("#inputEmail33").val(id2);
	$("#inputEmail34").val(id3);
	$("#myModal3").modal({backdrop:"static"});
}
function js_xiu4(date,name,id) {
	$("#myModalLabel4").text("资产类别修改");
	$("#inputEmail41").val(id);
	$("#myModal4").modal({backdrop:"static"});
}
function js_xiu5(date,name,id,id1) {
	$("#myModalLabel5").text("资产信息修改");
	$("#myModal5 select").val([id]);
	$("#inputEmail52").val(id1);
	$("#myModal5").modal({backdrop:"static"});
}
function js_xiu6(date,name,id,id1,id2) {
	$("#myModalLabel6").text("经营信息修改");
	$("#inputEmail61").val(id);
	$("#inputEmail62").val(id1);
	$("#inputEmail63").val(id2);
	$("#myModal6").modal({backdrop:"static"});
}
function js_xiu7(date,name,id,id1,id2) {
	$("#myModalLabel7").text("费用信息修改");
	$("#inputEmail71").val(id);
	$("#inputEmail72").val(id1);
	$("#myModal7 input[name=inlineRadioOptions]").val([id2]);
	$("#myModal7").modal({backdrop:"static"});
}
function js_xiu8(date) {
	$("#myModalLabel7").text("------");
	$("#inputEmail71").val(id);
	$("#myModal8").modal({backdrop:"static"});
}
function js_xiu9(date) {
	$("#myModalLabel7").text("------");
	$("#inputEmail71").val(id);
	$("#myModal9").modal({backdrop:"static"});
}




//数据修改


/*$("#nowdate").click(function(){
	Datetime();
});*/


//设置日期时间控件
lay('#version').html('-v'+ laydate.v);
//执行一个laydate实例
laydate.render({
elem: '#test1' //指定元素
});


