package com.suitup.service;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;

public interface SuitUpService {

	// 장바구니 목록 가져오기
	List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
	
}
