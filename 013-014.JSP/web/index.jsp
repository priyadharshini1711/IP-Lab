<%-- 
    Document   : index.jsp
    Created on : 08-Sept-2024, 11:06:20 pm
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> BASIC CALCULATOR</title>
    </head>
    <body>
        <h1><center>basic calculator</center></h1>
        <form action="basicCalculation.jsp"><br>
            <label>
                number1<input type="text" name="number1" value="num1"><br>
            </label>
            <label>
                number2<input type="text" name="number2" value="num2"><br>
            </label>
            <input type="radio" name="r1" value="add">+ Add
            <input type="radio" name="r1" value="sub">- Subtract
            <input type="radio" name="r1" value="mul">* Multiply
            <input type="radio" name="r1" value="div">/ Divide
            <input type="submit" value="submit">
        </form>
    </body>
</html>

