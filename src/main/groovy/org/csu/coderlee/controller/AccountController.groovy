package org.csu.coderlee.controller

import org.csu.coderlee.model.Account
import org.csu.coderlee.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

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
        Account account = new Account()
        account.username = "csucoderlee"
        ModelAndView modelAndView = new ModelAndView()
        modelAndView.addObject("account", account)
        modelAndView.setViewName("success")
        return modelAndView;
    }

}
