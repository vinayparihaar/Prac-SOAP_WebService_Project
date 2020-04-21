package com.vinay.soap.client.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.soap.client.beans.User;
import com.vinay.soap.client.service.IRegistrationService;
import com.vinay.soap.client.service.impl.RegistrationService;

@WebServlet(urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean isValid = true;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if (name == null || name.trim().length() <= 0) {
			request.setAttribute("username", "User Name is required field");
			isValid = false;
		}
		if (email == null || email.trim().length() <= 0) {
			request.setAttribute("email", "Email is required field");
			isValid = false;
		}
		if (password == null || password.trim().length() <= 0) {
			request.setAttribute("password", "Password is required field");
			isValid = false;
		}
		if (!isValid) {
			request.getRequestDispatcher("/registration.jsp").forward(request, response);
		} else {

			User user = new User();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);

			IRegistrationService iRegistrationService = new RegistrationService();
			iRegistrationService.createUser(user);
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		}

	}
}
