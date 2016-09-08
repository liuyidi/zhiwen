package com.netease.is.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * CORSg过滤
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月12日
 * @version 1.0
 */
//public class MainSiteCORSFilter implements Filter{
//	
//	public void init(FilterConfig filterConfig) throws ServletException {
//		ServletContext servletContext = filterConfig.getServletContext();
//		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//	}
//	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException{
//		HttpServletResponse res = (HttpServletResponse) response;
//		HttpServletRequest req = (HttpServletRequest) request;
//		String origin = req.getHeader("Origin");
//		
//		if(StringUtils.isNotBlank(origin) && ("zhiwen.com".equals(origin))){
//			res.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
//			res.setHeader("Access-Control-Max-Age", "3600");
//			res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With,Content-Type, Cookie,Accept");
//			res.setHeader("Access-Controll-Allow-Credentials", "true");
//			res.setHeader("Access-Control-Allow-Origin", origin);
//		}
//		chain.doFilter(request, response);
//	}
//	
//	
//}
