package main.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/teste"})
public class PrimeiroServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp){
        try{
           PrintWriter pw = resp.getWriter(); 
           pw.write("Bom dia pessoal!");
        } catch(IOException ioe){
            System.out.println("Impossível escrever na resposta!"); 
        }        
    }
    
}
