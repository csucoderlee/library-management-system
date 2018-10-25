package org.csu.coderlee.controller

import org.csu.coderlee.service.CategoryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import javax.annotation.Resource

/**
 * Created by csucoderlee on 2018/10/3
 */
@Controller
@RequestMapping("/category")
class CategoryController {

    Logger logger = LoggerFactory.getLogger(this.class)

    @Resource
    CategoryService categoryService;

    @RequestMapping
    @ResponseBody
    Object getByid() {
        logger.info("category service getbyid ")
        return categoryService.selectOneById(1)
    }
}
