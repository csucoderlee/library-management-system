package org.csu.coderlee.dao.mapper

import org.csu.coderlee.model.Account
import org.mybatis.spring.annotation.MapperScan
import org.springframework.stereotype.Repository

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:10
 */
@Repository
interface AccountMapper {

    Account selectById(id)

    Account selectByName(username)
}
