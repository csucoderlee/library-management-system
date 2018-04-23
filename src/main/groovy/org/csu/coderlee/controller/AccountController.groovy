package org.csu.coderlee.controller

import org.csu.coderlee.model.Account
import org.csu.coderlee.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.SessionAttributes
import org.springframework.web.servlet.ModelAndView

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:20
 */
@Controller
@RequestMapping(value = "/account")
class AccountController {

    @Autowired
    AccountService accountService

    @ModelAttribute
    Account model(String username){
        //从数据库查出来的原始信息
        def account = accountService.selectByna(username)
        def byname = accountService.selectByname(username)
        println  byname
       return account
    }

    @RequestMapping("/test")
    Object test(String password,Account account){
        account.password = password
        println account

    }




}
