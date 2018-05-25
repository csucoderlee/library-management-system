package org.csu.coderlee.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
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

    Logger logger = LoggerFactory.getLogger(this.class)

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    Object list() {
        logger.info(new StringBuilder("").append("日志"))
        return
    }
}
