package Controllers;
import models.Goods;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/show.jsp")
public class HandleShow extends HttpServlet {    
	@Resource(name="jdbc/MyDB")
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Goods> goods=new ArrayList<>();
		try {
			Connection conn=dataSource.getConnection();
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM goods";
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				goods.add(new Goods(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getInt("price")));
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			response.getWriter().print(e.getMessage());
		}
		request.setAttribute("item", goods);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

}
