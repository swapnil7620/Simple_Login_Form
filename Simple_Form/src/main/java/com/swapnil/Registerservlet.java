package com.swapnil;

import java.beans.Transient;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.security.PublicKey;

import org.apache.catalina.manager.DummyProxySession;

import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	
 public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServerException, IOException{
	 
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	 /* out.print("<h2>Welcome to Servlet  page</h2>");*/
	  
	  String Name =request.getParameter("user_Name");
	  String Password =request.getParameter("user_Password");
	  String Email =request.getParameter("user_email");	  
	  String Gender =request.getParameter("gender");
	  String Course =request.getParameter("user_Course");

	  String Cond =request.getParameter("condition");
	  if(Cond!=null) {
	  if(Cond.equals("checked")) {
		  out.println("<h2>Welcome to our website</h2>");
		  out.println("<h2>Name : " + Name + "<h2>");
		  out.println("<h2>Password : " + Password + "<h2>");
		  out.println("<h2>Email : " + Email + "<h2>");
		  out.println("<h2>Gender: " + Gender + "<h2>");
		  out.println("<h2>Course : " + Course + "<h2>");
	  }
	  else {
		  out.println("<h2>Please accept the terms and condition to login</h2>");
	  }
	  }
	  else {
		  out.println("<h2>Please accept the terms and condition then try to  login again   </h2>");

	     }
	  }
	  
	  
 }

	

