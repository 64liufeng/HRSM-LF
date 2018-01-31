package com.controller;

import com.model.Grxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GrxxServlet",urlPatterns = "/grxx")
public class GrxxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
         response.setCharacterEncoding("UTF-8");
         response.setContentType("text/html,charset=UTF-8");

        Grxx grxx = new Grxx();
        grxx.setName(request.getParameter("name"));
        grxx.setSex(request.getParameter("sex"));
        grxx.setMarriage(request.getParameter("marriage"));
        grxx.setDate(request.getParameter("date"));
        grxx.setID_number(request.getParameter("ID_number"));
        grxx.setPhone(request.getParameter("phone"));
        grxx.setMail(request.getParameter("mail"));
        grxx.setAddress(request.getParameter("address"));
        grxx.setNewAddress(request.getParameter("newAddress"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
