package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.entity.Reg;
import com.service.Login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ViewServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer= response.getWriter();
		writer.println("<h1>All current records</h1?");
		response.setContentType("text/html");
		Login login=new Login();
		login.view();
		
		
	}

}
