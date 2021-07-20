
function register_check(){
		
	var id = document.getElementById("regiId");
	var pw = document.getElementById("regiPassWord");
	var cpw = document.getElementById("regiConfirmPassWord");
	var name = document.getElementById("regiName");
	var social = document.getElementById("regiSocial");
	
	var idCheck = /^[a-zA-Z0-9]{4,12}$/
	var pwCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/

	
	// 아이디 
	if(id.value==""){
		alert("아이디를 ")
		id.focus();
		return false;
	} 
	if(!idCheck.test(id.value)){
		alert("아이디 형식")
		return false;
	}
	
	// 비밀번호
	if(pw.value==""){
		alert("비밀번호를 ")
		id.focus();
		return false;
	}
	if(!pwCheck.test(pw.value)){
		alert("비밀번호 형식")
		return false;
	}

	if(pw.value!=cpw.value){
		alert("비밀번호 재확인를 ")
		id.focus();
		return false;
	}
	
	// 이름
	if(name.value==""){
		alert("이름를 ")
		id.focus();
		return false;
	}
	
	// 주민번호 
	if(social){
		alert("주민번호를 ")
		id.focus();
		return false;
	}

}

//document.getElementById("regiId").addEventListener("focusout", ()=>{
//		alert("확인")
//})
