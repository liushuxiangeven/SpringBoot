package top.littlematch.base.login.dao;

import org.springframework.data.repository.CrudRepository;
import top.littlematch.base.login.model.Account;

public interface AccountDao extends CrudRepository<Account,Integer> {
}
