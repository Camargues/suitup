package com.suitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitup.dao.SuitUpDAO;
import com.suitup.domain.SuitUpCartVO;
@Service("suitupService")
public class SuitUpServiceImpl implements SuitUpService {

	@Autowired
	private SuitUpDAO suitupDAO;

	public List<SuitUpCartVO> getCartList(SuitUpCartVO vo) {
		return suitupDAO.getCartList(vo);
	}

}
