package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        //Leer los parámetros del formulario html
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        System.out.println("Usuario: " + usuario);
        System.out.println("Password: " + password);
        
        try (PrintWriter out = res.getWriter()) {
            out.print("<html>");
            out.print("<body>");
            out.print("El parámetro usuario es: " + usuario);
            out.print("<br/>");
            out.print("El parámetro password es: " + password);
            out.print("</body>");
            out.print("</html>");
        }
        
    }
    
}
