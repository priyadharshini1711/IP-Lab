<%-- 
    Document   : basicCalculation
    Created on : 08-Sept-2024, 11:06:37 pm
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <% String s1=request.getParameter("number1");
                String s2=request.getParameter("number2");
                int a,b;
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                String operation=request.getParameter("r1");
                if(operation.equals("add"))
                {
                    int x;
                    x=a+b;
                    out.println(x);
                }
                else if(operation.equals("sub"))
                {
                    int x;
                    x=a-b;
                    out.println(x);
                }
                else if(operation.equals("mul"))
                {
                    int x;
                    x=a*b;
                    out.println(x);
                }
                else 
                {
                    int x;
                    x=a/b;
                    out.println(x);
                }
        %>
    </body>
</html>


