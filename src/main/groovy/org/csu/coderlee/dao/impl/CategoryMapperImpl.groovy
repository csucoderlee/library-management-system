package org.csu.coderlee.dao.impl

import org.apache.ibatis.session.SqlSessionFactory
import org.csu.coderlee.dao.CategoryMapper
import org.csu.coderlee.model.Category
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.support.SqlSessionDaoSupport
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

import javax.annotation.Resource

/**
 * Created by csucoderlee on 2018/9/30
 */
@Repository
class CategoryMapperImpl extends SqlSessionDaoSupport implements CategoryMapper {

    @Override
    @Autowired
    void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    Category selectOneById(Object id) {
        return getSqlSession().select("Category.selectOneById", id)
    }
}
