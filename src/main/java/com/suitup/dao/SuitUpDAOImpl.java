package com.suitup.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCategoryVO;
import com.suitup.domain.SuitUpCommentVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.domain.SuitUpProductVO;

@Repository("suitupDAO") 
public class SuitUpDAOImpl implements SuitUpDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 장바구니 불러오기 (map 타입)
	public List<Map> getCartList(SuitUpCartVO vo) {
		System.out.println("===> Mybatis getCartList() 호출");
		return mybatis.selectList("SuitUpDAO.getCartList", vo);
	}
	
	// 장바구니 불러오기 (vo 타입)
	public List<SuitUpCartVO> getCartList2(SuitUpCartVO vo){
		System.out.println("==> Mybatis getCartList2() 호출");
		return mybatis.selectList("SuitUpDAO.getCartList2", vo);
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
	
	// 유저 정보 불러오기
	public SuitUpCustomerVO getUserInfo(SuitUpCustomerVO vo) {
		System.out.println("==> Mybatis getUserInfo() 호출");
		return mybatis.selectOne("SuitUpDAO.getUserInfo", vo);
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

	// 인기 상품목록 불러오기
	public List<SuitUpProductVO> getPopularList(SuitUpProductVO vo){
		System.out.println("===> Mybatis getPopularList() 호출");
		return mybatis.selectList("SuitUpDAO.getPopularList", vo);
	}

	// 신제품 불러오기
	public List<SuitUpProductVO> getNewList() {
		System.out.println("===> Mybatis getNewList() 호출");
		return mybatis.selectList("SuitUpDAO.getNewList");
	}
	
	// 관리자 상품 등록하기
		public int Productinsert(SuitUpProductVO vo) {
			System.out.println("===> Mybatis Productinsert() 호출");
			return mybatis.insert("SuitUpDAO.Productinsert",vo);
	}
		
	// 관리자 상품 목록
	public List<SuitUpProductVO> getAdminList() {
		System.out.println("===> Mybatis getAdminList() 호출");
		return mybatis.selectList("SuitUpDAO.getAdminList");
	}
		
	//정보 수정
    public int memberModify(SuitUpCustomerVO vo) {
        System.out.println("===> Mybatis memberModify() 호출");
        return mybatis.update("SuitUpDAO.memberModify",vo);

    }

	// 상품 상세 페이지
	public SuitUpProductVO getProductDetails(SuitUpProductVO vo) {
		System.out.println("==> Mybatis getProductDetails() 호출");
		return mybatis.selectOne("SuitUpDAO.getProductDetails", vo);
	}
	
	// 상품 장바구니에 담기
	public int insertCart(SuitUpCartVO vo) {
		System.out.println("==> Mybatis insertCart() 호출");
		return mybatis.insert("SuitUpDAO.insertCart", vo);
	}

	// 상품 수정
	public int updateProduct(SuitUpProductVO vo) {
		System.out.println("==> Mybatis updateProduct() 호출");
		return mybatis.update("SuitUpDAO.updateProduct", vo);
	}

	// 리뷰 불러오기
	public List<SuitUpCommentVO> getCommentList(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis getCommentList() 호출");
		return mybatis.selectList("SuitUpDAO.getCommentList", vo);
	}

	// 리뷰 작성하기
	public int insertComment(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis insertComment() 호출");
		return mybatis.insert("SuitUpDAO.insertComment", vo);
	}

	// 리뷰 삭제하기
	public int deleteComment(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis deleteComment() 호출");
		return mybatis.delete("SuitUpDAO.deleteComment", vo);
	}

	// 리뷰 수정하기
	public int updateComment(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis updateComment() 호출");
		return mybatis.update("SuitUpDAO.updateComment", vo);
	}
    
	// 상품 별점 가져오기
	public long getReviewAvg(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis getReviewAvg() 호출");
		return mybatis.selectOne("SuitUpDAO.getReviewAvg", vo);
	}

	// 리뷰 갯수 가져오기
	public int getReviewCount(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis getReviewCount() 호출");
		return mybatis.selectOne("SuitUpDAO.getReviewCount", vo);
	}

	// 리뷰 내용 가져오기
	public SuitUpCommentVO getComment(SuitUpCommentVO vo) {
		System.out.println("==> Mybatis getComment() 호출");
		return mybatis.selectOne("SuitUpDAO.getComment", vo);
	}
}
