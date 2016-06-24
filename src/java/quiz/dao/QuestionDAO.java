/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import quiz.entity.Question;

/**
 *
 * @author admin
 */
public class QuestionDAO {

    public void AjouterQuestion(Question q) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(q);
        em.getTransaction().commit();
    }

    public List<Question> ListerQuestions() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT q FROM Question q").getResultList();
    }

    public void RepondreQuestionSuivante() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

    }

    public void ListerQuestionnaires() {

    }

}
