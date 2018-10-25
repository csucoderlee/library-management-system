package org.csu.coderlee.service

import org.csu.coderlee.dao.mapper.BookMapper
import org.csu.coderlee.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author by bixi.lx
 * @created on 2018 05 14 08:35
 */
@Service
class BookService {

    @Autowired
    BookMapper bookMapper;

    int insert(Book book) {
        return bookMapper.insert(book)
    }
}
