<%-- 
    Document   : login
    Created on : 24 Aug, 2013, 10:27:14 PM
    Author     : M ANIL KUMAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
     <head>
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
  
    <body>
        <jsp:include page="header.jsp"/>
        
        <h1>Login Page</h1>
        <form:form method="post"commandName="user">
        <form:errors path="*"/>
        <table border="1" align="centre">
            <tr>
                <td>User Name:</td>
                <td><form:input path="userName"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login"/></td>
            </tr>
            <tr>
                <td><a href="registration.htm">New User?Register</a> </td>
            </tr>
        </table>
      </form:form>
      <jsp:include page="footer.jsp"/>
    </body>
    
</html>
