package com.suitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitup.dao.SuitUpDAO;
import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;
@Service("suitupService")
public class SuitUpServiceImpl implements SuitUpService {

	@Autowired
	private SuitUpDAO suitupDAO;

	// 장바구니 불러오기
	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo) {
		return suitupDAO.getCartList(vo);
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

}
