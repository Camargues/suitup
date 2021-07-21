package com.suitup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.service.SuitUpService;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
		// 세션값 넣는걸로 변경 예정
		vo.setMemId("admin");
		m.addAttribute("cartList", suitupService.getCartList(vo));
	}
	
	// 주문하러 가기
	@RequestMapping("checkout.do")
	public void checkout(Model m) {
		SuitUpCartVO vo = new SuitUpCartVO();
		// 테스트용으로 admin 계정 카트 목록 불러오기
		// 세션값 넣는걸로 변경 예정
		vo.setMemId("admin");
		m.addAttribute("cartList", suitupService.getCartList(vo));
	}
	
	// 주문하기
	@RequestMapping("insertOrder.do")
	public String insertOrder(String receiver, String phone, String address, String memo) {
		
		// 몇건 주문 들어가는지 받아올 result 변수 선언
		int result = 0;
		
		if(memo == null)
			memo = "";
		
		SuitUpCartVO cartvo = new SuitUpCartVO();
		// 테스트용으로 admin 계정 카트 목록 불러오기
		// 세션값 넣는걸로 변경 예정
		cartvo.setMemId("admin");		
		
		List<SuitUpCartVO> list = suitupService.getCartList(cartvo);
		for(SuitUpCartVO vo : list) {
			SuitUpOrderVO ordervo = new SuitUpOrderVO();
			ordervo.setMemId(vo.getMemId());
			ordervo.setProNum(vo.getProNum());
			ordervo.setDtproSize(vo.getDtproSize());
			ordervo.setDtproColor(vo.getDtproColor());
			ordervo.setOrderCount(vo.getCartCount());
			ordervo.setOrderAddress(address);
			ordervo.setOrderReceiver(receiver);
			ordervo.setOrderPhone(phone);
			ordervo.setOrderMemo(memo);
			ordervo.setProPrice(vo.getProPrice());
			ordervo.setProName(vo.getProName());
			
			result = result + suitupService.insertOrder(ordervo);
		}
		
		// 주문 완료 후 장바구니 비우기
		suitupService.deleteCartList(cartvo);
		
		// 주문 성공시
		if(result > 0)
		// 주문내역 페이지 만들면 주문내역 페이지로 넘어감
		return "redirect:index.jsp";
		// 주문 실패시
		return "redirect:checkout.do";
		
	}
	
	// 장바구니 한품목 삭제
	@RequestMapping("dropCart.do")
	public String deleteCart(String cart_num) {
		System.out.println(cart_num);
		
		suitupService.deleteCart(cart_num);

		return "redirect:cart.do";
	}
	
	// 주문내역 진입시
		@RequestMapping("history.do")
		public void history(Model m) {
			SuitUpOrderVO vo = new SuitUpOrderVO();
			// 테스트용으로 admin 계정 카트 목록 불러오기
			// 세션값 넣는걸로 변경 예정
			vo.setMemId("admin");
			m.addAttribute("orderList", suitupService.getOrderList(vo));
			
		}
		
}
