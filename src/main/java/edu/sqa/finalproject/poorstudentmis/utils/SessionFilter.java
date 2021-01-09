package edu.sqa.finalproject.poorstudentmis.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.sqa.finalproject.poorstudentmis.entity.User;

@WebFilter(filterName = "sessionFilter",urlPatterns = {"/write_article", "/article_manage", "/vol_manage", "/file_manage", "/question_reply", "/ps_verify", "/vol_verify", "/application", "/stu_info", "/fund_manage", "/stu_manage", "/work_manage", "/fund_verify", "/work_verify"})
public class SessionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
        if (u == null) {
        	response.sendRedirect("login");
        } else {
        	// 放行
        	filterChain.doFilter(request, response);
        }
    }
}
