package com.krish.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krish.model.CustLoginModel;

@Controller
public class CustomerLoginController {
	
	@GetMapping("/")
	public String HomeScreen() {
		return "Home";
	}
	@GetMapping("/CustLogin")
	public String CustloginPage(@ModelAttribute CustLoginModel clm) {
		System.out.println("CustomerLoginController.CustloginPage()");
		return "Clogin";
	}

	@PostMapping("/CustLoginAthenification")
	public String CustAthenification(@RequestParam("") String mobileNum,@RequestParam("") String paassword) {
		return null;
	}

	@GetMapping("/CreateNewCustomer")
	public String CreateCustLogin() {
		return null;
	}
	
	@PostMapping("/RegesterCustLogin")
	public String RegisterCustomerLogin() {
		return null;
	}
}
