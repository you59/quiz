<%-- 
    Document   : Quiz
    Created on : 24 juin 2016, 15:30:09
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
        <h3>Liste des Quiz</h3>
        
        <c:forEach items="${listeQuiz}" var="lq">
            <div>${lq.nom} &nbsp;&nbsp;<a href=jouer_quiz?id=${lq.id}>Jouer</a></div> 
        </c:forEach>
        <c:choose >
            <c:when test="${typeUtil=='admin'}"   >
                <a href="ajout_quiz">Ajouter un quiz</a>  
            </c:when>
        </c:choose>

    </body>
</html>
