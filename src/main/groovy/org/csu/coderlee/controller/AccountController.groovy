package org.csu.coderlee.controller

import org.csu.coderlee.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:20
 */
@Controller
@RequestMapping(value = "/account")
class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/get")
    @ResponseBody
    Object account() {
        return accountService.selectById(1)
    }

    @RequestMapping(value = "/info")
    Object info() {

        return "success"
    }

}
