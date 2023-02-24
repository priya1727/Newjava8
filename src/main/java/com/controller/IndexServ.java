package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.service.Login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndexServ() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String city = request.getParameter("city");

		Login login = new Login();
		login.add(id, name, address, city);

		PrintWriter writer = response.getWriter();
		writer.println("data submited");
	}

}
