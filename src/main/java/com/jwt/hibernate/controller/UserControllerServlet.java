package com.jwt.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.jwt.hibernate.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String userName = request.getParameter("userName");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");
         
        
        HttpSession session = request.getSession(true);
        
        try {
        	if (userName=="" && password1=="" && password2=="" && email=="" && phone =="" && city=="" && gender== "")
        	{
        		response.sendRedirect("Error");
        	}
        	else if(password1 != password2)
        	{
        		response.sendRedirect("Error");
        	}
        	else 
        	{
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(userName, password1, password2, email, phone, city, gender);
            response.sendRedirect("Success");
        	}
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
}
