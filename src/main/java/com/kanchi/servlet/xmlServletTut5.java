package com.kanchi.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "xmlServletTut5", urlPatterns = {"/xmlServletTut5"},
        initParams = {@WebInitParam(name = "defaultuser",value = "Jon Doe")})
public class xmlServletTut5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String userName = req.getParameter("userName");
        HttpSession session= req.getSession();
        ServletContext context=req.getServletContext();

        if (userName!=""&&userName!=null){
            session.setAttribute("savedUserName",userName);
            context.setAttribute("savedUserName",userName);

        }
        writer.println("Hello ! " + userName);
        writer.println("Request Parameter has "+userName );
        writer.println("session Parameter has "+(String)session.getAttribute("savedUserName") );
        writer.println("context Parameter has "+(String)context.getAttribute("savedUserName") );
        writer.println("init Parameter has default user name as "+ getServletConfig().getInitParameter("defaultuser") );


    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String userName = req.getParameter("userName");
        String fullName = req.getParameter("fullName");
        out.println("Hello ! " + userName + " from Post.We know your full name is " + fullName);

        String profession = req.getParameter("prof");
        out.println("You are " + profession);

//        String location =req.getParameter("location");
//        out.println("You are "+location);

        String[] location = req.getParameterValues("location");
        out.println("You are at "+ location.length + " places");
        for (int i=0;i<location.length;i++) {
            out.println(location[i]);
        }

    }*/
}
