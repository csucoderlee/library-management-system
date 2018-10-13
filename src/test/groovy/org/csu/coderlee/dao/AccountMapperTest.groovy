package org.csu.coderlee.dao

import org.csu.coderlee.dao.mapper.AccountMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * @author by bixi.lx
 * @created on 2018 04 17 22:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
class AccountMapperTest {

    @Autowired
    AccountMapper accountMapper;

    @Test
    void testSelectById () {
        accountMapper.selectById(1)
    }
}
