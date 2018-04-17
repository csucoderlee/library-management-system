package org.csu.coderlee.service

import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * @author by bixi.lx
 * @created on 2018 04 17 20:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
class AccountServiceTest extends TestCase{

    @Autowired
    AccountService accountService;

    @Test
    void test() {
        accountService.selectById(1)
        System.out.println("d ")
    }
}
