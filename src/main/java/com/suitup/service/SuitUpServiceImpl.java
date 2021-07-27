package com.suitup.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitup.dao.SuitUpDAO;
import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCommentVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;
@Service("suitupService")
public class SuitUpServiceImpl implements SuitUpService {

	@Autowired
	private SuitUpDAO suitupDAO;

	// 장바구니 불러오기(map 타입)
	public List<Map> getCartList(SuitUpCartVO vo) {
		return suitupDAO.getCartList(vo);
	}
	
	// 장바구니 불러오기(vo 타입)
	public List<SuitUpCartVO> getCartList2(SuitUpCartVO vo){
		return suitupDAO.getCartList2(vo);
	}
	// 주문 하기
	public int insertOrder(SuitUpOrderVO vo) {
		return suitupDAO.insertOrder(vo);
		
	}

	// 장바구니 전부 삭제
	public void deleteCartList(SuitUpCartVO vo) {
		suitupDAO.deleteCartList(vo);
		
	}

	// 장바구니 한품목 삭제
	public void deleteCart(String cart_num) {
		suitupDAO.deleteCart(cart_num);		
	}

	// 주문내역 불러오기
	public List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo) {
		return suitupDAO.getOrderList(vo);
	}
	// 회원가입
	public int userInsert(SuitUpCustomerVO vo) {
		return suitupDAO.memberInsert(vo);
	}
	// 아이디 중복 체크
	public SuitUpCustomerVO userIdCheck(SuitUpCustomerVO vo) {
		return suitupDAO.idCheck(vo);
	}
	
	// 유저 정보 불러오기
	public SuitUpCustomerVO getUserInfo(SuitUpCustomerVO vo) {
		return suitupDAO.getUserInfo(vo);
	}

	// 카테고리 목록 불러오기
	public List<SuitUpCategoryVO> getCategoryList() {
		return suitupDAO.getCategoryList();
	}

	// 상품목록 검색하기
	public List<SuitUpProductVO> getProductList(SuitUpProductVO vo){
		return suitupDAO.getProductList(vo);
	}

	// 인기상품목록 검색하기
	public List<SuitUpProductVO> getPopularList(SuitUpProductVO vo) {
		return suitupDAO.getPopularList(vo);
	}
	
	// 신제품 검색하기
	public List<SuitUpProductVO> getNewList() {
		return suitupDAO.getNewList();
	}
	
	// 상품등록
			public int Productinsert(SuitUpProductVO vo) {
				return suitupDAO.Productinsert(vo);
	}
		
	// 관리자 상품 목록 불러오기
	public List<SuitUpProductVO> getAdminList(){
		System.out.println("--------------service-----------------");
		return suitupDAO.getAdminList();
	}
	//정보수정
    public int memModifiy(SuitUpCustomerVO vo) {
        return suitupDAO.memberModify(vo);
    }

	// 상품 상세 페이지
	public SuitUpProductVO getProductDetails(SuitUpProductVO vo) {
		return suitupDAO.getProductDetails(vo);
	}

	// 장바구니 추가하기
	public int insertCart(SuitUpCartVO vo) {
		return suitupDAO.insertCart(vo);
	}

	// 상품 재고 수정
	public int updateProduct(SuitUpProductVO vo) {
		return suitupDAO.updateProduct(vo);
	}

	// 리뷰 불러오기
	public List<SuitUpCommentVO> getCommentList(SuitUpCommentVO vo) {
		return suitupDAO.getCommentList(vo);
	}

	// 리뷰 등록하기
	public int insertComment(SuitUpCommentVO vo) {
		return suitupDAO.insertComment(vo);
	}

	// 리뷰 삭제하기
	public int deleteComment(SuitUpCommentVO vo) {
		return suitupDAO.deleteComment(vo);
	}

	// 리뷰 수정하기
	public int updateComment(SuitUpCommentVO vo) {
		return suitupDAO.updateComment(vo);
	}

	// 상품 별점 가져오기
	public long getReviewAvg(SuitUpCommentVO vo) {
		return suitupDAO.getReviewAvg(vo);
	}

	// 상품 리뷰 갯수 가져오기
	public int getReviewCount(SuitUpCommentVO vo) {
		return suitupDAO.getReviewCount(vo);
	}

	// 리뷰 내용 불러오기
	public SuitUpCommentVO getComment(SuitUpCommentVO vo) {
		return suitupDAO.getComment(vo);
	}
	// 유저 리스트
	public List<SuitUpCustomerVO> getCustomerList() {
		return suitupDAO.getCustomerList();
	}
	
	//월별 총액
	public List<Map<String, String>> getMonthSum() {
		return suitupDAO.getMonthSum();
	}
	
	//일별 총액
	public List<Map<String, String>> getDaySum() {
		return suitupDAO.getDaySum();
	}

}
