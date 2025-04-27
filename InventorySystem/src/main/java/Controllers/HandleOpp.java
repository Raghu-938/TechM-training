package Controllers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
 
import javax.sql.DataSource;
 
import models.Goods;
import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/HandleOpp")
public class HandleOpp extends HttpServlet {
    
    @Resource(name = "jdbc/MyDB")
    private DataSource dataSource;
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.print(request.getParameter("id")+", "+request.getParameter("action"));
        int id= Integer.parseInt(request.getParameter("id"));
        if(request.getParameter("action").equals("delete")){
        	
        	try {
    			Connection conn = dataSource.getConnection();
    			String query = "DELETE FROM goods WHERE id=?";
    			PreparedStatement stmt = conn.prepareStatement(query);
    			stmt.setInt(1,id);
    			stmt.executeUpdate(); //execute the query
    			
    			
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }else {
        	//edit
        }
 
    }
}