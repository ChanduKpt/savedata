package com.org.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class User extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String username =req.getParameter("uname");
		String password =req.getParameter("pwd");
		int i=0;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form","root","root");
				String sql ="INSERT INTO login_form.`userdata` VALUES(?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,username);
				ps.setString(2,password);
				 
				i=ps.executeUpdate();
				
				con.close();
			} catch (SQLException e) {
				 
				e.printStackTrace();
			}
			 catch (ClassNotFoundException e) {
			e.printStackTrace();
			 
			 }
		 PrintWriter pw = resp.getWriter();
		 
		 
		 pw.write("<html><body><h1>DATA SAVED SUCCESSFULLY</h1></body></html>");
		 RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			 rd.include(req, resp);	
		}
	}


