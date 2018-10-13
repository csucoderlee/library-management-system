package org.csu.coderlee.service;

import junit.framework.TestCase
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author by bixi.lx
 * @created on 2018 05 14 11:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class BookServiceTest extends TestCase {

    @Autowired
    BookService bookService

    void testInsert() throws Exception {
    }

}