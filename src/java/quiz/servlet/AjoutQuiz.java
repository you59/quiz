/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static quiz.entity.Question_.quiz;
import quiz.entity.Quiz;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutQuiz", urlPatterns = {"/ajout_quiz"})
public class AjoutQuiz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("AjoutQuizNom.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom=req.getParameter("nom");
        Quiz q=new Quiz();
        q.setNom(nom);
        new QuizService().AjouterQuiz(q);
        resp.sendRedirect("Quiz.jsp");
    }
   

}
