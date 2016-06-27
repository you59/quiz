<%-- 
    Document   : AjoutQuizQuestion
    Created on : 27 juin 2016, 09:28:08
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Quiz</h1><br>
        <h3>Liste des Questions</h3>
        <c:forEach items="${listeQuestion}" var="lq">
            <div>${lq.titre}</div>
        </c:forEach><br>
        <a href="ajout_question">Ajouter une question</a>        
    </body>
</html>
