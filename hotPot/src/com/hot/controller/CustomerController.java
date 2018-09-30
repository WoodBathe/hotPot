package com.hot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hot.model.Customer;
import com.hot.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@RequestMapping("/customerList.do")
	public ModelAndView customerList(){
		ModelAndView mv = new ModelAndView();
		List<Customer> customerList = customerService.getCustomers();
		mv.addObject("customerList", customerList);
		mv.setViewName("members");
		return mv;
				
	}
}
