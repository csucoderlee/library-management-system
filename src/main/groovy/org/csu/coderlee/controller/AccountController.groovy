package org.csu.coderlee.controller

import org.csu.coderlee.model.Account
import org.csu.coderlee.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
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
        return modelAndView
    }

    //登录验证功能
    @RequestMapping("/login")
    @ResponseBody
    Object longin(Account account){
        ModelAndView modelAndView = new ModelAndView()
        def username = account.username
        def password = account.password
        def acc = accountService.selectById()
        println acc.username
        if (acc.username==username&&acc.password==password){
            modelAndView.setViewName("success")
            modelAndView.addObject("name","登录成功")
            return modelAndView
        }else {
            modelAndView.setViewName("defeat")
            if (acc.username==username){
                modelAndView.addObject("name","密码错误")

                return modelAndView
            }else {
               modelAndView.addObject("name","用户不存在")
                return modelAndView

            }
        }
    }

    //实现注册功能
    @RequestMapping("/regis")
    Object regis(Account account){

        def inserd = accountService.inserd(account)
        println inserd//验证是否插入数据
        ModelAndView modelAndView = new ModelAndView()
        modelAndView.setViewName("login")
        return modelAndView


    }

}
