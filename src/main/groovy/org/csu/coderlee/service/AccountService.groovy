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
class AccountService {

    @Autowired
    AccountMapper accountMapper

    String selectByname(username){
        def byname = accountMapper.selectByname(username)
        String st = ""
        if (byname==null){
           st="用户名不存在！"
        }else {
            st="查询成功！"
        }
        return st
    }

    Account selectByna(username){
        def byname = accountMapper.selectByname(username)
        return byname
    }

}
