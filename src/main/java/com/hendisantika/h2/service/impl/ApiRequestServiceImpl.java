package com.hendisantika.h2.service.impl;

import com.hendisantika.h2.dao.ApiRequestDao;
import com.hendisantika.h2.model.ApiRequest;
import com.hendisantika.h2.service.ApiRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApiRequestServiceImpl implements ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;

    @Override
    public void create(ApiRequest apiRequest) {
        apiRequestDao.create(apiRequest);
    }
}
