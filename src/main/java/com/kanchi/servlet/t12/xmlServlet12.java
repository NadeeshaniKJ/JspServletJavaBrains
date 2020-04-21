package com.kanchi.servlet.t12;

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

@WebServlet(description = "xmlServlet12", urlPatterns = {"/xmlServlet12"},
        initParams = {@WebInitParam(name = "defaultuser",value = "Jon Doe")})
public class xmlServlet12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("init Parameter has default user name as "+ getServletConfig().getInitParameter("defaultuser") );
    }
}
