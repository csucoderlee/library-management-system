package org.csu.coderlee.dao.mapper

import org.csu.coderlee.model.Account
import org.springframework.stereotype.Repository

/**
 * Created by csucoderlee on 2018/10/25
 */
@Repository
class AccountMapperImpl implements AccountMapper{

    @Override
    Account selectById(Object id) {
        return null
    }

    @Override
    Account selectByName(Object username) {
        return null
    }
}
