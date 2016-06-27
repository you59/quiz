<%-- 
    Document   : AjoutQuestion
    Created on : 27 juin 2016, 09:38:01
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajouter une question</h1>
        <form method="post" action="ajout_question">
            Titre: <input type="text" name="titre" /> 
            Question: <input type="text" name="question" /> 

            Reponse 1: <input type="text" name="rep1" /> 
            Reponse 2: <input type="text" name="rep2" /> 
            Reponse 3: <input type="text" name="rep3" /> 
            Reponse 4: <input type="text" name="rep4" /> 
            Numero Reponse correcte: <input type="number" name="numrepco" /> 
            <input type="submit" />
        </form>
    </body>
</html>
