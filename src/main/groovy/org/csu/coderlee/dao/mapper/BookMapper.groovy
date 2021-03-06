package org.csu.coderlee.dao.mapper

import org.csu.coderlee.model.Book
import org.springframework.stereotype.Repository

/**
 * @author by bixi.lx
 * @created on 2018 05 06 22:31
 */
@Repository
interface BookMapper {

    List<Book> list()
    int insert(Book book)
}