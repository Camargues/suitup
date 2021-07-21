package com.suitup.service;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;

public interface SuitUpService {

	// 장바구니 목록 가져오기
	List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
	
	int insertOrder(SuitUpOrderVO vo);
	
	void deleteCartList(SuitUpCartVO vo);
	
	void deleteCart(String cart_num);
	
	List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo);

	// 회원가입 
	public int userInsert(SuitUpCustomerVO vo);
		
		// 아이디 중복체크 
	public SuitUpCustomerVO userIdCheck(SuitUpCustomerVO vo);
	
	public List<SuitUpCategoryVO> getCategoryList();
	
}
