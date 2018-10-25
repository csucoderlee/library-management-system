package org.csu.coderlee.service

import org.csu.coderlee.dao.mapper.CategoryMapper
import org.csu.coderlee.model.Category
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created by csucoderlee on 2018/9/30
 */
@Service
class CategoryServiceImpl implements CategoryService {

    @Resource
    CategoryMapper categoryMapper

    @Override
    Category selectOneById(Object id) {
        return categoryMapper.selectOneById(id)
    }
}
