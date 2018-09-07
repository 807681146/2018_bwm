package com.gpf.common.cros;


import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CROSFilter implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age","2000");
        response.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-with,Content-Type,Accept");
        response.setHeader("Access-Control-Allow-Credentials","true");

        filterChain.doFilter(servletRequest,response);
    }

    @Override
    public void destroy() {

    }
}
