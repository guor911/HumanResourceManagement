package com.hrm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrm.entity.Human;
import com.hrm.service.HumanService;

public class HumanEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HumanService HS = new HumanService();
	
	public HumanEditServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Human human = HS.findOne(id);
		
		request.setAttribute("name", human.getName());
		request.setAttribute("birthday", human.getBirthday());
		request.setAttribute("gender", human.getGender());
		request.setAttribute("career", human.getCareer());
		request.setAttribute("address", human.getAddress());
		request.setAttribute("mobile", human.getMobile());
		request.getRequestDispatcher("/jsp/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
