package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHora")
public class ServletHora extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html; charset=UTF-8");
        response.setHeader("refresh", "1");
        
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        String horaFormato = formato.format(date);
        
        PrintWriter out = response.getWriter();
        out.print("Hora actualizada: " + horaFormato);
        out.close();
        
    }
    
}
