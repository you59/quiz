<%-- 
    Document   : UnQuiz
    Created on : 27 juin 2016, 12:06:59
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
        <h1>Debut du quiz</h1>
        <div> ${Question.titre}</div>
        <div> ${Question.rep1}</div>
        <div> ${Question.rep2}</div>
        <div> ${Question.rep3}</div>
        <div> ${Question.rep4}</div>
        <a href="QuestionSuivante">Question suivante</a>
    </body>
</html>
