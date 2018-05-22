package org.csu.coderlee.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by bixi.lx
 * @created on 2018 05 22 17:30
 */
public class CookieUtils {

    public CookieUtils() {}

    public static void write(HttpServletResponse response, String domain, String key, String value) {
        Cookie cookie = new Cookie(key, value);
        cookie.setDomain(domain);
        cookie.setMaxAge(604800);
        response.addCookie(cookie);
    }

    public static String read(HttpServletRequest request, String key) {
        try {
            Cookie[] e = request.getCookies();
            Cookie[] arr$ = e;
            int len$ = e.length;

            for (int i$ = 0; i$ < len$; ++i$) {
                Cookie c = arr$[i$];
                if (c.getName().equals(key)) {
                    return c.getValue().trim();
                }
            }
        } catch (NullPointerException var7) {
            ;
        }

        return null;
    }
}
