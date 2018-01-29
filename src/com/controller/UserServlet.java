package com.controller;

import com.dao.UserDaoImpl;
import com.model.User;
import com.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
         response.setCharacterEncoding("UTF-8");
         response.setContentType("text/html,charset=UTF-8");

        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPass(request.getParameter("pass"));
        UserDaoImpl userDao = new UserDaoImpl();
        User user1 = userDao.login(user);
        if (null!=user1){
            HttpSession session = request.getSession();
            session.setAttribute("u",user1);
            response.sendRedirect("pages/success.jsp");
        }else {
            response.sendRedirect("pages/login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
