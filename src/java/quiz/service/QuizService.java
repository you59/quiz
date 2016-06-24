/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.dao.QuizDAO;
import quiz.entity.Quiz;

/**
 *
 * @author admin
 */
public class QuizService {

    public Quiz DemarrerQuiz(long idQuiz) {
        QuizDAO q = new QuizDAO();
        return q.DemarrerQuiz(idQuiz);
    }

    public void AjouterQuiz(Quiz quiz) {
        QuizDAO q = new QuizDAO();
        q.AjouterQuiz(quiz);
    }

    public void CalculerScore() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    }
}
