package com.java.spr.repo;

import com.java.spr.model.Trans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransRepository extends CrudRepository<Trans,String> {
    List<Trans> findByAccountNo(int accountNo);
}
