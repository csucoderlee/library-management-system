package org.csu.coderlee.model

/**
 * @author by bixi.lx
 * @created on 2018 04 17 17:11
 */
class Account {

    def username
    def password

    @Override
    String toString() {
        return "Account{" +
                "username=" + username +
                ", password=" + password +
                '}'
    }
}
