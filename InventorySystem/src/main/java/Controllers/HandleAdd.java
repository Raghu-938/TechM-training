package Controllers;
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
 
import javax.sql.DataSource;
 
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/HandleAdd")
public class HandleAdd extends HttpServlet{
	
	@Resource(name="jdbc/MyDB")
	private DataSource dataSource; //we fetched database info
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException  {
		
		String name= request.getParameter("itemname");
		String desc = request.getParameter("itemdesc");
		int price = Integer.parseInt(request.getParameter("itemprice"));
		
		try {
			Connection conn = dataSource.getConnection();
			String query = "INSERT INTO goods (itemname,itemdesc,itemprice) VALUES(?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setString(2, desc);
			stmt.setInt(3, price);
			stmt.executeUpdate();
			response.sendRedirect("index.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
 
}