package com.hashim.crud.conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hashim.crud.entities.Employee;
import com.hashim.crud.services.EmployeeService;

@Controller
public class EmpController {
	@Autowired
	EmployeeService empsrv;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/showlogin")
	public String showlogin(){
		return "login";
	}
	@RequestMapping("/showReg")
	public String reg() {
		return "registration";
	}
	
	@RequestMapping("/register")
	public @ResponseBody String register( Employee emp) {
		boolean a=empsrv.register(emp);
		if(a)
		return "Registered successfully";
		return "Someting went wrong";
	}
	
	@RequestMapping("/login")
	public String login(Integer id, String password) {
		boolean b=empsrv.login(id,password);
		if(b)
		return "index";
		return "login";
	}
}
