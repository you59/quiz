<%-- 
    Document   : AjoutQuizNom
    Created on : 24 juin 2016, 15:53:38
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>Ajoutez un nom au Quiz
        <form method="post" action="ajout_quiz" >
            <input type="text" name="nom" />
            <input type="submit" />
            
        </form>
    </body>
</html>
