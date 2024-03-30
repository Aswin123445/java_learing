package com.aswin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
  


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	PrintWriter out=res.getWriter();
    	int k=(int)req.getAttribute("add");
    	k=k*k;
    	out.println("square is "+k);
    }
}
