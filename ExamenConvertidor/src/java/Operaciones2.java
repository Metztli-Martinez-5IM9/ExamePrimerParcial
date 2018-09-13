/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(urlPatterns = {"/Operaciones2"})


public class Operaciones2 extends HttpServlet {
    int PESOS;
    float R=0;
    
    String CAMBIO, COSA="";
    
    @Override
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        PESOS=Integer.parseInt(request.getParameter("pesos"));
        CAMBIO=request.getParameter("operacion");
        
        
        if(CAMBIO.equals("dolar")){
            R= PESOS/20;
            COSA="";
        }
        else
        if(CAMBIO.equals("yen")){
            R= PESOS*20;
            COSA="";
            
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletOperaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><br><center><h1> SON " +R +CAMBIO+"</h1></center>");
            out.println("<h2>" +COSA+ "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}