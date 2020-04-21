package com.kanchi.servlet.t9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "xmlServlet9", urlPatterns = {"/xmlServlet9"})
public class xmlServlet9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String userName = req.getParameter("userName");

        HttpSession session= req.getSession();

        if (userName!=""&&userName!=null){
            session.setAttribute("savedUserName",userName);

        }
        writer.println("http://localhost:8080/try/xmlServlet9?userName=kkk..............................." );
        writer.println("Hello ! " + userName);
        writer.println("Request Parameter has "+userName );
        writer.println("session Parameter has "+(String)session.getAttribute("savedUserName") );

    }

}
