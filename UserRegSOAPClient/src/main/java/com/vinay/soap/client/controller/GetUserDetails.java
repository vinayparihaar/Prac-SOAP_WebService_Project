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

/**
 * Servlet implementation class GetUserDetails
 */
@WebServlet("/getuser")
public class GetUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean isValid = true;
		//User user = new User();
		String email = request.getParameter("email");

		if (email == null || email.trim().length() <= 0) {
			request.setAttribute("email", "Email is required field");
			isValid = false;
		}
		if (!isValid) {
			request.getRequestDispatcher("/getuserdetails.jsp").forward(request, response);
		}
		else
		{
		IRegistrationService iRegistrationService = new RegistrationService();
		User user = (User) iRegistrationService.getUser(email);
		request.setAttribute("user", user);
		request.getRequestDispatcher("/userdetails.jsp").forward(request, response);
		}
	}

}
