package com.hendisantika.h2.dao.impl;

import com.hendisantika.h2.dao.ApiRequestDao;
import com.hendisantika.h2.model.ApiRequest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ApiRequestDaoImpl implements ApiRequestDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(ApiRequest apiRequest) {
        entityManager.persist(apiRequest);
    }

    @Override
    public void update(ApiRequest apiRequest) {
        entityManager.merge(apiRequest);
    }

    @Override
    public ApiRequest getApiRequestById(long id) {
        return entityManager.find(ApiRequest.class, id);
    }

    @Override
    public void delete(long id) {
        ApiRequest apiRequest = getApiRequestById(id);
        if (apiRequest != null) {
            entityManager.remove(apiRequest);
        }
    }


}
