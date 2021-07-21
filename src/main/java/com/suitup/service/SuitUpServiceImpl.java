package com.suitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitup.dao.SuitUpDAO;
import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpOrderVO;
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



}
