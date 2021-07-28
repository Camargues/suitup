package com.suitup.service;

import java.util.List;
import java.util.Map;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCommentVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;

public interface SuitUpService {

	// 장바구니 목록 가져오기
	List<Map> getCartList(SuitUpCartVO vo);
	
	List<SuitUpCartVO> getCartList2(SuitUpCartVO vo);
	
	int insertOrder(SuitUpOrderVO vo);
	
	void deleteCartList(SuitUpCartVO vo);
	
	void deleteCart(String cart_num);
	
	List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo);

	// 회원가입 
	public int userInsert(SuitUpCustomerVO vo);
		
		// 아이디 중복체크 
	public SuitUpCustomerVO userIdCheck(SuitUpCustomerVO vo);
	
	public List<SuitUpCategoryVO> getCategoryList();
	
	public List<SuitUpProductVO> getProductList(SuitUpProductVO vo);
	
	public List<SuitUpProductVO> getPopularList(SuitUpProductVO vo);
	
	public List<SuitUpProductVO> getNewList();
	
	// 관리자 상품등록
	public int Productinsert(SuitUpProductVO vo);
		
	// 관리자 상품 목록		
	public List<SuitUpProductVO> getAdminList();

	// 정보수정
    public int memModifiy(SuitUpCustomerVO vo);
    
    // 상품 상세 페이지
    public SuitUpProductVO getProductDetails(SuitUpProductVO vo);
    
    public int insertCart(SuitUpCartVO vo);
    
    public int updateProduct(SuitUpProductVO vo);
	
    public List<SuitUpCommentVO> getCommentList(SuitUpCommentVO vo);
	
	public int insertComment(SuitUpCommentVO vo);
	
	public int deleteComment(SuitUpCommentVO vo);
	
	public int updateComment(SuitUpCommentVO vo);
	
	public long getReviewAvg(SuitUpCommentVO vo);
	
	public int getReviewCount(SuitUpCommentVO vo);
	
	public SuitUpCommentVO getComment(SuitUpCommentVO vo);
	
	public SuitUpCustomerVO getUserInfo(SuitUpCustomerVO vo);
	
	public List<SuitUpCustomerVO> getCustomerList();
	
	public List<Map<String,String>> getMonthSum();

	public List<Map<String,String>> getDaySum();
}
