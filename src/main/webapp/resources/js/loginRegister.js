
//====================================로그인====================================

function id_check(){

	//쿠키 저장 
	var cookie = $(":input:checkbox[name=cookieOn]:checked").val() ;
	if( cookie != "cookieOn"){
		cookie = "cookieOff"
	}
	
	$.ajax({
		type:"post",
		url:"login.do",
		//한글처리
		contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
		data:{ memId : $('#memId').val()
			,memPass : $('#memPass').val()
			,memCookie : cookie},
		success:function(result){
			$('#idResult').text(result);
			if(result=="로그인성공"){
				location.href="index.do";
			}
		},
		error:function(result){
			$('#idResult').text("아이디 또는 비밀번호를 확인하세요.");
		}
			
	})

}

//====================================회원가입====================================
//회원가입 변수 regi 안쓰면 로그인id랑 충돌
var rid = document.getElementById("regiMemId");
var rpw = document.getElementById("regiMemPass");
var rcpw = document.getElementById("regiMemPassConfirm");
var rname = document.getElementById("regiMemName");
var raddr = document.getElementById("regiMemAddr");
var rphone = document.getElementById("regiMemPhone");

//유효성 검사
var ridCheck = /^[a-z0-9]{4,12}$/
var rpwCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,16}$/
var idFlag = false ;

//아이디 중복 검사 ajax  
document.getElementById("regiMemId").addEventListener("focusout", ()=>{	
	
	// 아이디 값 4자 이상일때 ajax  
	if(rid.value.length>=4){
		
	$.ajax({
		type:"post",
		url:"idCheck.do",
		contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
    	//한글처리
		data:{ memId : $('#regiMemId').val()},
		success:function(result){
			$('#idCheckResult').text(result);
			//사용가능한 아이디 일때 ture false
			if(result == "사용가능한 아이디입니다."){
				idFlag = true;				
			}else{
				idFlag = false;
			}
			
		}	
	})
	
	}	
	
})

//REGISTER 버튼 클릭시
function register_check(){

	// 아이디 
	if(rid.value==""){
		alert("아이디를 입력하세요.")
		rid.focus();
		return false;
	} 
	if(!ridCheck.test(rid.value)){
		alert("아이디는 4~12자의 영문 소문자, 숫자만 사용 가능합니다.")
		rid.focus();		
		return false;
	}
	if(idFlag == false){
		alert("아이디 중복을 확인하세요.")
		rid.focus();
		return false;
	} 
	
	// 비밀번호
	if(rpw.value==""){
		alert("비밀번호를 입력하세요.")
		rpw.focus();
		return false;
	}
	if(!rpwCheck.test(rpw.value)){
		alert("비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요. ")
		rpw.focus();
		return false;
	}

	if(rpw.value!=rcpw.value){
		alert("비밀번호가 일치하지 않습니다. ")
		rcpw.focus();
		return false;
	}
	
	// 이름
	if(rname.value==""){
		alert("이름를 입력하세요.")
		rname.focus();
		return false;
	}
	
	document.getElementById("registerForm").submit();
	
}

//====================================주소====================================
function goPopup(){
	// 주소검색을 수행할 팝업 페이지를 호출합니다.
	var pop = window.open("jusoPopup.do","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	
}
function jusoCallBack(roadFullAddr){
	// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
	
		document.registerForm.memAddr.value = roadFullAddr;		
	
}
//====================================비밀번호 찾기====================================
function goPassword(){
	// 주소검색을 수행할 팝업 페이지를 호출합니다.
	var passpop = window.open("password-reset.do","pop","width=570,height=500, scrollbars=no, resizable=yes"); 
	
}
