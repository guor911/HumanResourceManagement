package com.hrm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrm.entity.Human;
import com.hrm.service.HumanService;

public class HumanListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HumanService humanService = new HumanService();

	public HumanListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Human> list = humanService.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/list.jsp").forward(request, response);
	}
}
