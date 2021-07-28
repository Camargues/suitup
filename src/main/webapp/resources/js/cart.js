$(document).ready(function(){
	
	 
	 $('.cnt').change(function () { // input값이 변화가 있을 때 발생하는 이벤트
		 
		 var cartCount = $(this).val();		// 장바구니 수량 변수
		 var cartNum = $(this).attr("id");	// 장바구니 번호 변수

		 $.ajax({
			 type : "post",
			 url : "changeCart.do",
			 contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
			 data : {cartCount : cartCount, cartNum : cartNum},
			 success:function(result){
				 // 성공시 페이지 리로딩
				 location.reload();
			 },
			 
		 });
	 });
	
});


