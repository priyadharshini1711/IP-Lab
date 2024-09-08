/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletResponse;



/**
 *
 * @author LENOVO
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String user = req.getParameter("user");
        Cookie cookie = new Cookie("m", user);
        String age = req.getParameter("age");
        Cookie cookie1 = new Cookie("m", age);
        res.addCookie(cookie);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println(user + " is " + age + " years old.");
        cookie.setMaxAge(0);
    }
}
