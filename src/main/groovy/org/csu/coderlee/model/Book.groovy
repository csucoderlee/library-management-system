package org.csu.coderlee.model

/**
 * @author by bixi.lx
 * @created on 2018 04 17 16:47
 */
class Book {

    //-----  来源于豆瓣api的信息  开始 ---------//

    /**
     * https://api.douban.com/v2/book/26708119
     */
    def id

    /**
     * https://api.douban.com/v2/book/isbn/9787302423287
     */
    def isbn10

    /**
     * https://api.douban.com/v2/book/isbn/9787302423287
     */
    def isbn13

    /**
     * 作者
     */
    def author

    /**
     * 出版社
     */
    def publisher

    /**
     * 出版时间
     */
    def pubdate

    /**
     * 页数
     */
    def pages

    /**
     * 定价
     */
    def price

    def image

    /**
     * 豆瓣购买链接
     */
    def alt
    //-----  来源于豆瓣api的信息  结束  ---------//

    /**
     * 分类信息、上架指导
     */
    List<Tag> tags

    def ownerId

    def ownerName

    def borrowerId

    def borrowerName
}
