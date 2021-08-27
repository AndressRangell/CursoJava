package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeader")
public class ServletHeader extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h3>Headers HTTP</h3>");
        out.print("<b>Método Http: </b>" + request.getMethod());
        out.print("<br>");
        out.print("<b>Uri solicitada</b>" + request.getRequestURI());
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()) {
            String nombre = cabeceros.nextElement().toString();
            out.print("<br><b>" + nombre + ": </b>");
            out.print(request.getHeader(nombre));
        }
        out.print("</body>");
        out.print("</html>");
        
    }
    
}
