package org.csu.coderlee.dao.mapper


import org.csu.coderlee.dao.mapper.CategoryMapper
import org.csu.coderlee.model.Category
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.SqlSessionTemplate
import org.mybatis.spring.support.SqlSessionDaoSupport
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

/**
 * Created by csucoderlee on 2018/9/30
 */
@Repository
class CategoryMapperImpl extends SqlSessionDaoSupport implements CategoryMapper {

    @Autowired
    private SqlSessionFactoryBean sqlSessionFactoryBean

//    @Override
//    @Autowired
//    void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }

    @Override
    @Autowired
    void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate)
    }

    @Override
    Category selectOneById(Object id) {
        return getSqlSession().selectOne("Category.selectOneById", id)
    }
}
