package top.littlematch.base.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.littlematch.base.login.dao.AccountDao;
import top.littlematch.base.login.model.Account;

import java.util.Optional;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;
	@Transactional
	public Account findById(Integer id){
		Optional<Account> account=accountDao.findById(id);
		return account.orElse(null);
	}
}
