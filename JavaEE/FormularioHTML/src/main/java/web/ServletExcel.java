package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletExcel")
public class ServletExcel extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=ejemplo.xls");
        
        //Para uso avanzado de excel usar poi.apache.org
        
        //Indicamos al navegador que no guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //Desplegamos la información al cliente
        PrintWriter out = response.getWriter();
        
        out.println("\tValores");
        out.println("\t7");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
        out.close();
        
    }
    
}
