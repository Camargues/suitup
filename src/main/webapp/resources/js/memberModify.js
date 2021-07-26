

var rname = document.getElementById("regiMemName");

//====================================수정====================================
	
function modify_check(){

	// 아이디 
	if(rname.value==""){
		alert("이름을 입력하세요.")
		rname.focus();
		return false;
		
	}
	
	alert("회원정보가 변경 되었습니다.")
	document.getElementById("modifyForm").submit();
}

//====================================주소====================================
function goPopup(){
	// 주소검색을 수행할 팝업 페이지를 호출합니다.
	var pop = window.open("jusoPopup.do","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	
}
function jusoCallBack(roadFullAddr){
	// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.

		document.memModify.memAddr.value = roadFullAddr;
	
	
}