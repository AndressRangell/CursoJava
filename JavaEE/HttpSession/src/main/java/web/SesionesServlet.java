package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        res.setContentType("text/html; charset=UTF-8");
        
        HttpSession sesion = req.getSession();
        String titulo = null;
        
        //pedimos el atributo contadorVisitas a la sesión
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            contadorVisitas++;
            titulo = "Bienvenido de nuevo";
        }
        
        //Agregamos el nuevo valor a la sesión
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Enviamos la respuesta al cliente
        PrintWriter out = res.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("Accesos al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("ID de la sesión: " + sesion.getId());
        out.close();
        
    }
    
}