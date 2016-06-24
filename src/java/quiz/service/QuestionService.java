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

}
