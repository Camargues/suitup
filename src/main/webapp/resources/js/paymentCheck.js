$(function(){
		
	$('#img_btn').click(function() {
		
		
		// 수령인
		if($('#receiver').val()==''){
			alert("받으실 분의 성함을 입력해주세요")
			$('#receiver').focus();
			return false;
		} 
		
		// 수령인 연락처
		if($('#phone').val()==''){
			alert("받으실 분의 연락처를 입력해주세요")
			$('#phone').focus();
			return false;
		} 
		
		// 배송지
		if($('#address').val()==''){
			alert("배송지를 입력해주세요")
			$('#address').focus();
			return false;
		} 
		
		$("#payment").submit();   // 유효성 검사 후 submit
		
		});

});