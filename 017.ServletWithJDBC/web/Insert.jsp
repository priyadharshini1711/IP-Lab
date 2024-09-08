<%-- 
    Document   : Insert
    Created on : 08-Sept-2024, 11:31:29 pm
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MyDB.MyDB" %>
<html>
    <body style="Background-color:#CCC0FF">

        <% out.println("<h2>Clients List</h2>"); %>
        <h3>------------------------------------------------------------------------------</h3>
        <% String firstName = request.getParameter("firstName");
           String email = request.getParameter("email");
        MyDB dbclient=new MyDB();
        dbclient.insertdata(firstName,email);
        out.println(dbclient.displayWithbrowser());
        dbclient.closecon();
        %>
        <h3>------------------------------------------------------------------------------</h3>
    </body>
</html>
