package com.suitup.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;

@Repository("suitupDAO") 
public class SuitUpDAOImpl implements SuitUpDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 장바구니 불러오기
	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo) {
		System.out.println("===> Mybatis getCartList() 호출");
		return mybatis.selectList("SuitUpDAO.getCartList", vo);
	}

	// 주문 완료
	public int insertOrder(SuitUpOrderVO vo) {
		System.out.println("===> Mybatis insertOrder() 호출");
		return mybatis.insert("SuitUpDAO.insertOrder", vo);
	}
	
	// 장바구니 전부 비우기
	public void deleteCartList(SuitUpCartVO vo) {
		System.out.println("===> Mybatis deleteCartList() 호출");
		mybatis.delete("SuitUpDAO.deleteCartList", vo);
	}
	
	// 장바구니 한품목 삭제
	public void deleteCart(String cart_num) {
		System.out.println("===> Mybatis deleteCart() 호출");
		mybatis.delete("SuitUpDAO.deleteCart", cart_num);
	}

	// 주문내역
	public List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo) {
		System.out.println("===> Mybatis getOrderList() 호출");
		return mybatis.selectList("SuitUpDAO.orderList", vo);
	}
	
	// 회원가입
	public int memberInsert(SuitUpCustomerVO vo) {
		System.out.println("===> Mybatis userInsert() 호출");
		return mybatis.insert("SuitUpDAO.userInsert",vo);
	}
	
	// id중복체크
	public SuitUpCustomerVO idCheck(SuitUpCustomerVO vo) {
		System.out.println("===> Mybatis idCheck() 호출");
		return mybatis.selectOne("SuitUpDAO.idCheck",vo);
	}

	// 카테고리 목록 불러오기
	public List<SuitUpCategoryVO> getCategoryList() {
		System.out.println("===> Mybatis getCategoryList() 호출");
		return mybatis.selectList("SuitUpDAO.getCategoryList");
	}

	// 상품목록 불러오기
	public List<SuitUpProductVO> getProductList(SuitUpProductVO vo) {
		System.out.println("===> Mybatis getProductList() 호출");
		return mybatis.selectList("SuitUpDAO.getProductList", vo);
	}

	public List<SuitUpProductVO> getPopularList(SuitUpProductVO vo){
		System.out.println("===> Mybatis getPopularList() 호출");
		return mybatis.selectList("SuitUpDAO.getPopularList", vo);
	}
}
