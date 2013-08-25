<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to TODO</title>
    </head>

    <body>
       
        <jsp:include page="header.jsp"/>
        <form:form >
        <c:choose>
            <c:when test="${empty user.loggedIn}">
                <a href="login.htm">Login</a>
            </c:when>
            <c:otherwise>
                <a href="logout.htm">Logout</a>
            </c:otherwise>
        </c:choose>
        </form:form>
        <jsp:include page="footer.jsp"/>
       
    </body>
</html>
