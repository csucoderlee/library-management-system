package org.csu.coderlee.dao

import org.csu.coderlee.model.Account
import org.mybatis.spring.annotation.MapperScan

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:10
 */
@MapperScan
interface AccountMapper {

    Account selectById(id)
}
