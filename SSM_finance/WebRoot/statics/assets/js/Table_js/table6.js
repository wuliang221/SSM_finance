function firstPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
	$(".main").load(lianjie+"/businessin/businessin.html?pageNo=1")
}	

function upPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoUp").val();
		$(".main").load(lianjie+"/businessin/businessin.html?pageNo="+page)
		
}




function dowmPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoDom").val();
	$(".main").load(lianjie+"/businessin/businessin.html?pageNo="+page)
}	

function lastPage() {
	var lianjie=$("#url").val();
	var page=$("#pageNoLast").val();
	$(".main").load(lianjie+"/businessin/businessin.html?pageNo="+page)
}	