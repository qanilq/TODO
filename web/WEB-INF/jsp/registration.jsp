<%-- 
    Document   : register
    Created on : 4 Aug, 2013, 7:45:55 PM
    Author     : M ANIL KUMAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
         <form:form commandName="user">
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
                <td>Email:</td>
                <td><form:input path="email"/></td>
            </tr>
             <tr>
                <td>Confirm Email:</td>
                <td><form:input path="confirmEmail"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"/></td>
            </tr>
        </table>
        </form:form>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
