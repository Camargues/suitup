package com.suitup.dao;

import java.util.List;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpOrderVO;

public interface SuitUpDAO {

	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo);
	
	public int insertOrder(SuitUpOrderVO vo);
	
	public void deleteCartList(SuitUpCartVO vo);
	
	public void deleteCart(String cart_num);
	
	public List<SuitUpOrderVO> getOrderList(SuitUpOrderVO vo);

	
}
