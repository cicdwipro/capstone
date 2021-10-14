package com.jwt.hibernate.controller;
import java.io.IOException;
import java.util.Date;
import java.io.PrintWriter; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
public class Success extends HttpServlet {
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        
        Date date=java.util.Calendar.getInstance().getTime();  
        
       
        writer.println("" + "" + "<center>"
                + "Details Added Successfully" + "</center>" + ""
                + "");
        writer.println( "Hello user you are registerd succesfully on" +date);
    }
 
}