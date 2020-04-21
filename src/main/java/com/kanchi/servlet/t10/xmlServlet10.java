package com.kanchi.servlet.t10;

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

@WebServlet(description = "xmlServlet10", urlPatterns = {"/xmlServlet10"})
public class xmlServlet10 extends HttpServlet {
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
    }
}
