package com.aswin;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletSign extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String email=req.getParameter("em");
		session.setAttribute("name", name);
		session.setAttribute("pass", pass);
		session.setAttribute("email",email);
		res.sendRedirect("b");
	}

}
