package ru.java.test.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.java.test.entities.Web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Oleg on 05.12.2016.
 */
@Repository
public class ListWebImpl implements ListWeb {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @SuppressWarnings("unchecked")
    public List<Web> getWeb() {
        TypedQuery<Web> typedQuery=entityManager.createQuery("SELECT c from Web c",Web.class);
        List<Web> list=typedQuery.getResultList();
        return list;
    }
}
