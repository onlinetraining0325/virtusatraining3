package com.java.spr.repo;

import com.java.spr.model.Employ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployRepository extends MongoRepository<Employ, String>
{
}
