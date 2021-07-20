package com.suitup.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpOrderVO;

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
	

}
