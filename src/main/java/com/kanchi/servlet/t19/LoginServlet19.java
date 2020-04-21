package com.kanchi.servlet.t19;

import com.kanchi.servlet.t18Login.dto.User;
import com.kanchi.servlet.t18Login.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login19")
public class LoginServlet19 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String userId, password;

        userId =req.getParameter("userId");
        password=req.getParameter("password");

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticate(userId,password);
        if(result){
            User user =loginService.getUserDetails(userId);
            req.getSession().setAttribute("user",user);
            resp.sendRedirect("success19.jsp");
            return;
        }else {
            resp.sendRedirect("login.jsp");
            return;
        }
    }
}
