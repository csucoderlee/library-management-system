package org.csu.coderlee.dao.impl

import org.csu.coderlee.dao.CategoryMapper
import org.csu.coderlee.model.Category
import org.mybatis.spring.support.SqlSessionDaoSupport

/**
 * Created by csucoderlee on 2018/9/30
 */
class CategoryMapperImpl extends SqlSessionDaoSupport implements CategoryMapper {

    @Override
    Category selectOneById(Object id) {
        return getSqlSession().select("Category.selectOneById", id)
    }
}
