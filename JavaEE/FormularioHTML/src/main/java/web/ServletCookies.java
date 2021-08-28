package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookies")
public class ServletCookies extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //Supongamos que el usuario visita el sitio por primera vez
        boolean nuevoUsuario = true;
        int contador = 0;
        String mensaje = null;
        Cookie cookie;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //Bucamos si ya existe una cookie creada
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario = false;
                }
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        if(nuevoUsuario){
            cookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(cookie);
            mensaje = "Bienvenido al sitio";
        }else{
            mensaje = "Gracias por visitarnos nuevamente";
        }
        
        contador++;
        cookie = new Cookie("contadorVisitas", Integer.toString(contador));
        cookie.setMaxAge(3600);
        response.addCookie(cookie);
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Cookie visitante: " + mensaje);
        out.print("<br>");
        out.print("Cookie contador: " + contador);
        out.close();
        
    }
    
}
