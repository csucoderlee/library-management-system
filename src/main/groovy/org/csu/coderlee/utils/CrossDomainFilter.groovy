package org.csu.coderlee.utils

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author by bixi.lx
 * @created on 2018 05 18 08:59
 */
class CrossDomainFilter implements Filter{

    @Override
    void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String origin = "*"
        if(request instanceof HttpServletRequest){
            origin = request.getHeader("origin")
        }
        if(response instanceof HttpServletResponse){
            response.setHeader("Access-Control-Allow-Origin", origin)
            response.setHeader("Access-Control-Allow-Credentials", "true")
            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Request-With, Content-Type, Accept")
        }
        chain.doFilter(request, response)
    }

    @Override
    void destroy() {

    }
}