package com.aswin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletSecond extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void  doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		String pass=(String)session.getAttribute("pass");
		String email=(String)session.getAttribute("email");
		PrintWriter out=res.getWriter();
		out.println("name  :"+name+"\n"+"password :"+pass+"\n"+"email :"+email);
	}

}
