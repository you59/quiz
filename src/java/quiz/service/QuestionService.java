/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.service;

import java.util.List;
import quiz.dao.QuestionDAO;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionService {

    public void AjouterQuestion(Question q) {
        new QuestionDAO().AjouterQuestion(q);
    }

    public List<Question> ListerQuestions() {
        return new QuestionDAO().ListerQuestions();
    }

    public void RepondreQuestionSuivante() {

    }

    public void ListerQuestionnaires() {

    }

    public Question trouverQuestSuiv(Long idQuiz, long ordreDernQuestion) {

        // Récup liste questions du quiz, triees par ordre
        List<Question> lq = new QuestionDAO().listeQuestionsTrieesParOrdre(idQuiz);

        // Exception si aucune question
        if (lq.size() == 0) {
            throw new RuntimeException("Aucune question dans le quiz");
        }

        // Trouve question suivante
        for (Question question:lq) {
            if (question.getOrdre() > ordreDernQuestion) {
                return question;
            }
        }

        return null;
    }
}
