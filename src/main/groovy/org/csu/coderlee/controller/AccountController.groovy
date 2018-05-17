package org.csu.coderlee.controller

import org.csu.coderlee.model.Account
import org.csu.coderlee.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
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

    @RequestMapping(value = "/login")
    @ResponseBody
    Object login() {
        //TODO 异步插入一条数据
        return "success"
    }

    /**
     * {"username":"csucoderlee", "password":"123456"}
     * @param account
     * @return
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    Object update(Account account) {

        println(account.username)
        println(account.password)
    }

    @RequestMapping(value = "/scan")
    @ResponseBody
    Object scan(sn) {

        if(sn) return "666"
        return sn? true:false
    }

    @RequestMapping(value = "/map", method = RequestMethod.POST)
    @ResponseBody
    Object map(Map request) {
        return request.username
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    Object login(Account account) {
        return null;
    }

}
