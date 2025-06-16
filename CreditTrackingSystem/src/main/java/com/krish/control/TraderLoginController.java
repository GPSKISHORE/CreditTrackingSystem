package com.krish.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.krish.model.TradeRegModel;
import com.krish.model.TraderLoginModel;
import com.krish.service.ITradeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class TraderLoginController {
	
	@Autowired
	private ITradeService its;
	
	@GetMapping("/TraderLogin")
	public String TraderloginPage(Model mod) {
		mod.addAttribute("TraderLoginModel",new TraderLoginModel());
		return "Tlogin";
	}
	
	@PostMapping("/TraderLoginAthenification")
	public String TraderAthenification(@ModelAttribute TraderLoginModel tlm,RedirectAttributes attr) {
		System.out.println(tlm.getMobile()+" - - "+tlm.getPassword()+" - - "+tlm.getShopId());
		boolean bol = its.authentication(tlm);
		System.out.println(bol);
		if(!bol) {
			attr.addFlashAttribute("resultMsg","User Id & Password Not Found.!");
			return "redirect:TraderLogin";
		}
		return "";
	}
	
	@GetMapping("/RegesterTradeLoginPage")
	public String RegisterTraderLogin(Model mod) {
		mod.addAttribute("TradeRegModel", new TradeRegModel());
		System.out.println("TraderLoginController.RegisterTraderLogin()");
		return "TRegister";
	}
	
	@PostMapping("/RegesterTradeLogin")
	public String RegisterTraderLoginToDB(@ModelAttribute TradeRegModel trm,RedirectAttributes rt,HttpSession sec) {
		System.out.println("TraderLoginController.RegisterTraderLoginToDB()");
		if(its.checkLoginId(trm.getMobile())) {
			rt.addFlashAttribute("Your entered mobile number is already registred with the CCT, if you forgot the password, please click on forgot password.! Or Try with the new number.!");
			return "redirect:RegesterTradeLoginPage";
		}
		String res= its.newRegistration(trm);
		sec.setAttribute("resultMsg", res);
		return "ShopIdPage";
	}
}
