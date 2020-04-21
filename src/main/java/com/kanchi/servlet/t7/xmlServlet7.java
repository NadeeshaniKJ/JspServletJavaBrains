package com.kanchi.servlet.t7;

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

@WebServlet(description = "xmlServlet7", urlPatterns = {"/xmlServlet7"})
public class xmlServlet7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String userName = req.getParameter("userName");
        writer.println("Use .....http://localhost:8080/try/SimpleForm.html.....or......http://localhost:8080/try/xmlServlet7?userName=kkk............." );
        writer.println();
        writer.println("Hello ! " + userName);

    }

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

    }
}
