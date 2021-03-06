package com.example.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings("serial")
@WebServlet("/member")
public class MemberServlet extends HttpServlet {

	static Log log = LogFactory.getLog(MemberServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("##############");
		log.info("get");
		log.info("##############");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/memberform.jsp");
		dispatcher.forward(request, response);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("##############");
		log.info("post");
		log.info("##############");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/memberprocess.jsp");
		dispatcher.forward(request, response);
	
	}
}
