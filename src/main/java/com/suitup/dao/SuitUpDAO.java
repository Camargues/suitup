package com.suitup.dao;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;

public interface SuitUpDAO {

	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
	
	public int insertOrder(SuitUpOrderVO vo);
	
	public void deleteCartList(SuitUpCartVO vo);
	
	public void deleteCart(String cart_num);
	
	public List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo);
		
	int memberInsert(SuitUpCustomerVO vo);
	
	SuitUpCustomerVO idCheck(SuitUpCustomerVO vo);
	
	public List<SuitUpCategoryVO> getCategoryList();
	
	public List<SuitUpProductVO> getProductList(SuitUpProductVO vo);
	
	public List<SuitUpProductVO> getPopularList(SuitUpProductVO vo);
	
	public List<SuitUpProductVO> getNewList();
	
	//관리자 상품등록
	public int Productinsert(SuitUpProductVO vo);
		
	//관리자 상품목록
	public List<SuitUpProductVO> getAdminList();
	
	//회원정보 수정
	public int memberModify(SuitUpCustomerVO vo);

	
}
