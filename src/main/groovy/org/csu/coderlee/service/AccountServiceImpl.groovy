package org.csu.coderlee.service

import org.csu.coderlee.dao.AccountMapper
import org.csu.coderlee.model.Account
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:12
 */
@Service
class AccountServiceImpl implements AccountService{

    @Autowired
    AccountMapper accountMapper;

    @Override
    Account selectById(Long id) {
        return accountMapper.selectById(id)
    }
}
