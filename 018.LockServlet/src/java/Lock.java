/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "Lock", urlPatterns = {"/Lock"})
public class Lock extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        String key = getInitParameter("key");
        String host = req.getServerName();
        int port = req.getServerPort();
        if (!keyFitsServer(key, host, port)) {
            out.println("Pirated!");
        } else {
            out.println("Valid");
        }
    }

    private boolean keyFitsServer(String key, String host, int port) {
        if (key == null) {
            return false;
        }
        long numericKey = 0;
        try {
            numericKey = Long.parseLong(key);
        } catch (NumberFormatException e) {
            return false;
        }
        byte hostIP[];
        try {
            hostIP = InetAddress.getByName(host).getAddress();
        } catch (UnknownHostException e) {
            return false;
        }
        long servercode = 0;
        for (int i = 0; i < 4; i++) {
            servercode <<= 8;
            servercode |= hostIP[i];
        }
        servercode <<= 32;
        servercode |= port;
        long accesscode = ~numericKey;
        return (servercode == accesscode);
    }
}
