package com.suitup.service;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpOrderVO;

public interface SuitUpService {

	// 장바구니 목록 가져오기
	List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
	
	int insertOrder(SuitUpOrderVO vo);
	
	void deleteCartList(SuitUpCartVO vo);
	
	void deleteCart(String cart_num);
	
	List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo);


	
}
