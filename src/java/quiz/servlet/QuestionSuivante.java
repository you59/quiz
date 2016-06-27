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
import quiz.entity.Question;
import quiz.entity.Quiz;
import quiz.service.QuestionService;
import quiz.service.QuizService;

/**
 *
 * @author admin
 */
@WebServlet(name = "QuestionSuivante", urlPatterns = {"/QuestionSuivante"})
public class QuestionSuivante extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long numQuestAct = (Long) req.getSession().getAttribute("numQuest");
        if (numQuestAct == null) {
            numQuestAct = 0L;
        }
        long idQuiz = (Long) req.getSession().getAttribute("idQuiz");
        Question q = new QuestionService().trouverQuestSuiv(idQuiz, numQuestAct);
        if (q == null) {
            // Fin quiz

            throw new RuntimeException("FIN DU QUIZ");
        }

       /* if (numQuestAct == null) {
            req.getSession().setAttribute("numQuest", q.getOrdre());
        }*/

        //Quiz quiz = new QuizService().RecupQuiz(idQuiz);
        // Question q = new QuestionService().ListerQuestSuiv(quiz, numQuestAct);
        req.setAttribute("Question", q);

        req.getRequestDispatcher("UnQuiz.jsp").forward(req, resp);
    }

}
