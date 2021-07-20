package com.suitup.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suitup.domain.SuitUpCartVO;

@Repository("suitupDAO") 
public class SuitUpDAOImpl implements SuitUpDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	
	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo) {
		System.out.println("===> Mybatis getCartList() 호출");
		return mybatis.selectList("SuitUpDAO.getCartList", vo);
	}

}
