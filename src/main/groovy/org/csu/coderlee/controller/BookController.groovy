package org.csu.coderlee.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @author by bixi.lx
 * @created on 2018 05 06 22:28
 */
@Controller
@RequestMapping("/book")
class BookController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    Object list() {
        return
    }
}
