package com.kanchi.servlet.t6;

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

@WebServlet(description = "xmlServlet6", urlPatterns = {"/xmlServlet6"})
public class xmlServlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String userName = req.getParameter("userName");

        writer.println("http://localhost:8080/try/xmlServlet6?userName=kkk..............................." );
        writer.println("Hello ! " + userName);

    }

}
