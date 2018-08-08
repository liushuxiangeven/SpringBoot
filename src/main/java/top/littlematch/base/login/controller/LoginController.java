package top.littlematch.base.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.littlematch.base.login.model.Account;
import top.littlematch.base.login.service.AccountService;

@RestController
@RequestMapping("/index")
public class LoginController {
	@Autowired
	private AccountService accountService;

	@PostMapping("/index")
	public Object index(){
		Account account=accountService.findById(1);

		return account;
	}
}

