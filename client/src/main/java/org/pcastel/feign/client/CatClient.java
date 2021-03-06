package org.pcastel.feign.client;

import java.util.List;

import feign.Param;
import feign.RequestLine;

/**  */
public interface CatClient {

    @RequestLine("GET /cat")
    List<Cat> findAll();

    @RequestLine("GET /cat/{id}")
    Cat findById(@Param("id") String id);
    
    @RequestLine("POST /cat")
    Cat create(Cat cat);
    
    @RequestLine("PUT /cat/{id}")
    Cat update(@Param("id") String id, Cat cat);
    
    @RequestLine("DELETE /cat/{id}")
    Cat delete(@Param("id") String id);
}
