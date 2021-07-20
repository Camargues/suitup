package com.suitup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.service.SuitUpService;

@Controller
public class SuitUpController {
	@Autowired
	private SuitUpService suitupService;

	@RequestMapping("/{url}.do")
	public String viewPage(@PathVariable String url) {
		return url;
	}
	
	// 장바구니 진입시
	@RequestMapping("cart.do")
	public void cart(Model m) {
		SuitUpCartVO vo = new SuitUpCartVO();
		// 테스트용으로 admin 계정 카트 목록 불러오기
		vo.setMemId("admin");
		m.addAttribute("cartList", suitupService.getCartList(vo));
	}
}
