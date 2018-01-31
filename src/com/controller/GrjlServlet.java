package com.controller;

import com.model.Grjl;
import com.service.GrjlServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "GrjlServlet",urlPatterns = "/grjl")
public class GrjlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
         response.setCharacterEncoding("UTF-8");
         response.setContentType("text/html,charset=UTF-8");

         Grjl grjl = new Grjl();
         grjl.setName(request.getParameter("name"));
         grjl.setSex(request.getParameter("sex"));
         grjl.setDate(request.getParameter("date"));
         grjl.setPlace(request.getParameter("place"));
         grjl.setID_number(request.getParameter("ID_number"));
         grjl.setPhone(request.getParameter("phone"));
         grjl.setMail(request.getParameter("mail"));
         grjl.setAddress(request.getParameter("address"));
         grjl.setNewAddress(request.getParameter("newAddress"));
         grjl.setProf(request.getParameter("prof"));
         grjl.setEducation(request.getParameter("education"));
         grjl.setUnversity(request.getParameter("unversity"));
         grjl.setMajorCourse(request.getParameter("majorCourse"));
         grjl.setProfessional_skills(request.getParameter("professional_skills"));
         grjl.setTo_date(request.getParameter("to_date"));
         grjl.setWork(request.getParameter("work"));
         grjl.setIndustry(request.getParameter("industry"));
         grjl.setWorkAddress(request.getParameter("workAddress"));
         grjl.setSalary(request.getParameter("salary"));
         grjl.setFunction(request.getParameter("function"));
         grjl.setExperience(request.getParameter("experience"));
         grjl.setEvaluation(request.getParameter("evaluation"));
        GrjlServiceImpl grjlService = new GrjlServiceImpl();
        if(null!=grjl){
            HttpSession session = request.getSession();
            session.setAttribute("grjl",grjl);
            response.sendRedirect("pages/grjl-from.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request,response);
    }
}
