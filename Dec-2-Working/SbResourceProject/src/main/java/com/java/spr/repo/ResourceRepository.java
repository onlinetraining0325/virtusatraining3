package com.java.spr.repo;

import com.java.spr.model.Resource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends MongoRepository<Resource, String> {
    Resource findByResourceName(String resourceName);
}
