package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Datos de prueba
        String usuarioValido = "Andress";
        String passwordValido = "12345";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologia[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h3>Parametros procesados por el servlet</h3>");
        out.print("<table border='1'>");
        
        if(usuario.equals(usuarioValido) && password.equals(passwordValido)){
            
            out.print("<tr>");
            out.print("<td>Usuario</td>");
            out.print("<td>" + usuario + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Password</td>");
            out.print("<td>" + password + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Tecnologías</td>");
            out.print("<td>" + Arrays.toString(tecnologia).replace("[", "").replace("]", "") + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Género</td>");
            out.print("<td>" + genero + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Ocupación</td>");
            out.print("<td>" + ocupacion + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Música</td>");
            if(musica == null) out.print("<td>Ninguna</td>");
            else out.print("<td>" + Arrays.toString(musica).replace("[", "").replace("]", "") + "</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>Comentarios</td>");
            if(comentarios.equals("")) out.print("<td>Sin comentarios</td>");
            else out.print("<td>" + comentarios + "</td>");
            out.print("</tr>");
            
        }else{
            
            //Código de estado 401 "Error de autorización"
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
            
        }
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        out.close();
        
    }
    
}
