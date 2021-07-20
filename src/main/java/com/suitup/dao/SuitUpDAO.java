package com.suitup.dao;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;

public interface SuitUpDAO {

	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
}
