package com.aswin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CubeOfNumber extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int ans=Integer.parseInt(req.getParameter("ans"));
		PrintWriter out=res.getWriter();
		out.println("ans is"+ans*ans*ans);
	}

}
