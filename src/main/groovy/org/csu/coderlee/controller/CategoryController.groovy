package org.csu.coderlee.controller

import org.csu.coderlee.service.CategoryService
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

    @Resource
    CategoryService categoryService;

    @RequestMapping
    @ResponseBody
    Object getByid() {
        return categoryService.selectOneById(1)
    }
}
