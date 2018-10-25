package org.csu.coderlee.dao.mapper

import org.csu.coderlee.model.Book
import org.springframework.stereotype.Repository

/**
 * Created by csucoderlee on 2018/10/25
 */
@Repository
class BookMapperImpl implements BookMapper{

    @Override
    List<Book> list() {
        return null
    }

    @Override
    int insert(Book book) {
        return 0
    }
}
