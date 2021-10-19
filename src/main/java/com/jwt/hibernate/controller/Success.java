package com.jwt.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class Success extends HttpServlet {
	Date date=java.util.Calendar.getInstance().getTime();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("" + "" + ""	+ "Details Added Successfully" + "" + ""
				+ ",");
		writer.println("Hello user you are registered now on time----"  +date);
	}

}