package com.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xdl.bean.XdlBankAccount;
import com.xdl.service.XdlBankAccountService;

@Controller
public class XdlBankAccountController {
	@Autowired
	private  XdlBankAccountService  bankService;
	@RequestMapping("/toLogin.do")
    public  String  toLogin() {
    	return "hello";
	}
	@RequestMapping("/toMain.do")
    public  String  toMain() {
    	return "main";
	}
	@RequestMapping("/login.do")
	public String login(String acc_no,String acc_password,HttpServletRequest  request) {
		XdlBankAccount  account  = bankService.login(acc_no, acc_password);
		if(account != null) {
			request.getSession().setAttribute("account", account);
			return "redirect:toMain.do";
		}
		request.setAttribute("mag", "µÇÂ¼Ê§°Ü");
		return "hello";
	}
}