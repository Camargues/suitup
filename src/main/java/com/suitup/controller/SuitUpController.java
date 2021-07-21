package com.suitup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.suitup.domain.SuitUpCartVO;
import com.suitup.domain.SuitUpCustomerVO;
import com.suitup.domain.SuitUpOrderVO;
import com.suitup.service.SuitUpService;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Controller
public class SuitUpController {
	@Autowired
	private SuitUpService suitupService;
	
	
	
	@RequestMapping("/{url}.do")
	public String viewPage(@PathVariable String url, Model m) {
		// 카테고리 불러오기 위해 모든 페이지에 이 태그 넣기
		m.addAttribute("categoryList", suitupService.getCategoryList());
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
		m.addAttribute("categoryList", suitupService.getCategoryList());
	}
	
	// 주문하러 가기
	@RequestMapping("checkout.do")
	public void checkout(Model m) {
		SuitUpCartVO vo = new SuitUpCartVO();
		// 테스트용으로 admin 계정 카트 목록 불러오기
		// 세션값 넣는걸로 변경 예정
		vo.setMemId("admin");
		m.addAttribute("cartList", suitupService.getCartList(vo));
		m.addAttribute("categoryList", suitupService.getCategoryList());
	}
	
	// 주문하기
	@RequestMapping("insertOrder.do")
	public String insertOrder(String receiver, String phone, String address, String memo, Model m) {
		
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
		m.addAttribute("categoryList", suitupService.getCategoryList());
		// 주문 성공시
		if(result > 0)
		// 주문내역 페이지 만들면 주문내역 페이지로 넘어감
		return "redirect:index.jsp";
		// 주문 실패시
		return "redirect:checkout.do";
		
	}
	
	// 장바구니 한품목 삭제
	@RequestMapping("dropCart.do")
	public String deleteCart(String cart_num, Model m) {
		System.out.println(cart_num);
		
		suitupService.deleteCart(cart_num);
		m.addAttribute("categoryList", suitupService.getCategoryList());
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
			m.addAttribute("categoryList", suitupService.getCategoryList());
		}
		
		// 회원가입 진입시
		@RequestMapping("register.do") 
		public ModelAndView register(SuitUpCustomerVO vo, Model m) {
			int result = suitupService.userInsert(vo); 
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("login-register-ok"); // 회원가입 완료 페이지로 이동
			
			String id= vo.getMemId();
//			
			mv.addObject("id",id);
			m.addAttribute("categoryList", suitupService.getCategoryList());
			return mv;	
			//회원가입 완료페이지로
		}
		
		// 회원가입 아이디 중복검사시 
		@RequestMapping(value="idCheck.do", produces="application/text;charset=UTF-8")
		@ResponseBody   //Ajax [String 으로 반환하면 페이지 이동이기 떄문에]
		public String idCheck(SuitUpCustomerVO vo) {
			SuitUpCustomerVO result = suitupService.userIdCheck(vo);
			String message= "사용가능한 아이디입니다.";
			if(result != null) message="이미 사용중인 아이디 입니다";
			return message;
		}
		
		//로그인시 ajax
		@RequestMapping(value="login.do",  produces="application/text;charset=UTF-8")
		@ResponseBody
		public String login(SuitUpCustomerVO vo, HttpSession session) {
			SuitUpCustomerVO result = suitupService.userIdCheck(vo);
			String message ="아이디 또는 비밀번호를 확인하세요.";
			if(result != null) {
				message="로그인성공";
				session.setAttribute("SuitUpid", result.getMemId());
			}
			return message;
		}
		
}
