package com.hrm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrm.service.HumanService;

public class HumanUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HumanService HS = new HumanService();

	public HumanUpdateServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String humanName = request.getParameter("name");
		String humanBirthday = request.getParameter("birthday");
		String humanGender = request.getParameter("gender");
		String humanCareer = request.getParameter("career");
		String humanAddress = request.getParameter("address");
		String humanMobile = request.getParameter("mobile");

		HS.update(id, humanName, humanBirthday, Boolean.getBoolean(humanGender), humanCareer, humanAddress,
				humanMobile);
		response.sendRedirect("list");
	}

}
