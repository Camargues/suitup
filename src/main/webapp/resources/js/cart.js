$(function(){
		
	
	// 장바구니 삭제 AJAX 구현 (시간날때 나중에)
	$('td.product-remove > a').click(function(){
		
		$.ajax({
			url : $(this).attr("href"),
			type : 'get'
		
		});
		
	});
	

		

	
});