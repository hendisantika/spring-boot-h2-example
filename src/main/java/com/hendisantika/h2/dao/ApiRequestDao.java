package com.hendisantika.h2.dao;

import com.hendisantika.h2.model.ApiRequest;

public interface ApiRequestDao {
    void create(ApiRequest apiRequest);

    void update(ApiRequest apiRequest);

    ApiRequest getApiRequestById(long id);

    void delete(long id);
}
