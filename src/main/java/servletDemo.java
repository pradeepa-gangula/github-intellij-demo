package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class servletDemo extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String Username=req.getParameter("username");
        String Password=req.getParameter("password");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Welcome</h1>"+Username);
        out.println("<p>password:</p>"+Password);
        out.println("</body>");
        out.println("</html>");
    }
}
