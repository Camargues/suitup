$(function(){
		
	
	// 장바구니 삭제 AJAX 구현 (시간날때 나중에)
	$('td.product-remove > a').click(function(){
		
		$.ajax({
			url : $(this).attr("href"),
			type : 'get'
		
		});
		
	});
	
	$('td>input').attr('type','number').click(function(){
		// 변경한 카트 수량의 값
		var count = $(this).val();
		// 변경한 카트 번호
		var num = $(this).attr('id');
		
		
//		$.ajax({
//			url : ,
//		})
		
	});
	
});