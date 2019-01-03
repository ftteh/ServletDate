<%-- 
    Document   : displayimage
    Created on : Nov 22, 2016, 12:44:43 PM
    Author     : PCUSER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String filename = request.getParameter("filename");
            out.println("<img src='img/" + filename + "'>");
        %>    
    </body>
</html>
