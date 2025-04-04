package controllers;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/MyDB")
    private DataSource dataSource;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String regNo=req.getParameter("regNo");
		double per=Double.parseDouble(req.getParameter("per"));
		
		try {
			Connection conn=dataSource.getConnection();
			String query="Insert into student values(?,?,?,?)";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, regNo);
			stmt.setFloat(4, (float) per);
			stmt.execute();	
			System.out.println("Executed");
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		res.sendRedirect("index.jsp");
		
		
	}

}
